// Shawn Aviles 12/4/2020
public class lab6_30 {
    // play craps
    public static void main(String args[]){
        // the first roll, determine if you win, lose, or get a point
        int firstRoll = diceRoll();
        switch (firstRoll){
            case 2: case 3: case 12:
                System.out.println("You lose");
                System.exit(0);
            case 7: case 11:
                System.out.println("You win");
                System.exit(1);
            default:
                System.out.println("point is " + firstRoll);
        }

        // the next roll, only reached if the player didn't win or lose, continues until the point is repeated or 7 is rolled
        int nextRoll;
        do{
            nextRoll = diceRoll();
        } while (!(nextRoll == firstRoll || nextRoll == 7));
        
        if (nextRoll == 7){
            System.out.println("You lose");
            System.exit(2);
        }
        else{
            System.out.println("You win");
            System.exit(3);
        }
            
    }

    // method simulates rolling two die and returns the sum of the two
    public static int diceRoll(){
        int roll1 = (int) (Math.random() * 6 + 1);;
        int roll2 = (int) (Math.random() * 6 + 1);;
        int sum = roll1 + roll2;
        System.out.println("You rolled "+ roll1 +" + "+ roll2 +" = "+ sum);
        return sum;
    }
}
