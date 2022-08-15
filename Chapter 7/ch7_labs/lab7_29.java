// Shawn Aviles 1/14/2021

// this program picks four cards from a deck of 52 cards and computes their sum
public class lab7_29 {
    public static void main(String[] args){
        // create array
        int[] deck; 

        // initialize array, pick four random cards till sum of the cards equals 24
		do {
            deck = new int[52];
			pickFourCards(deck);	 
		} while (sumCards(deck) != 24);
		
		// display results and exit program
        printCards(deck);
        System.exit(0);
	}

	// method picks four random cards
	public static void pickFourCards(int[] deck) {
		for (int i = 0; i < 4; i++) {
			deck[(int)(Math.random() * 52)]++;
		}
	}

	// method returns the sum of the four cards picked
	public static int sumCards(int[] deck) {
        int sum = 0;
        
		for (int i = 0; i < deck.length; i++) {
			sum += ((i + 1) % 13) * deck[i]; 
		}
		return sum;
	}

	// method prints the four cards printed
	public static void printCards(int[] deck) {
		String[] cardTypes = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

		System.out.print("Cards: ");
		for (int i = 0; i < deck.length; i++) {
			if (deck[i] > 0)
				System.out.print(cardTypes[i % 13] + " ");
		}
	}
}
