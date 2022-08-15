// Shawn Aviles 11/10/2020
import java.util.Scanner;

// this program prompts the user for a string and displays its length and first character
public class lab4_20{
    public static void main(String args[]){
        // create scanner object
        Scanner input = new Scanner(System.in);

        // prompt the user for a string and close input
        System.out.print("Enter a string (a word): ");
        String word = input.nextLine();
        input.close();

        // get length and the first character
        int length = word.length();
        char firstChar = word.charAt(0);

        // display results and exit program
        System.out.println("String length: " + length + "\nFirst Character: " + firstChar);
        System.exit(0);
    }
}