// Shawn Aviles 10/22/2020
import java.util.Scanner;

// this program is a game that prompts the user to guess whether the flip of a coin results in heads or tails 
public class lab3_14 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // flips the coin and if heads was flipped heads becomes true
        int result = (int)(Math.random() * 2);
        boolean heads = (result == 1) ? true:false;
        boolean tails = (result == 0) ? true:false;

        // prompts user for their guess of the result and closes input
        System.out.print("I'm going to flip a coin. Guess heads or tails: ");
        String guess = input.nextLine();
        input.close();

        // determines if the guess was right
        if (guess.equalsIgnoreCase("heads") && heads) {
            System.out.println("Your guess was correct.");
        }
        else if (guess.equalsIgnoreCase("tails") && tails) {
            System.out.println("Your guess was correct.");
        }
        else{
            System.out.println("Your guess was wrong.");
        }
    }
}