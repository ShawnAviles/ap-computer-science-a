// Shawn Aviles 11/8/2020
import java.util.Scanner;

// this program prompts the user to enter a letter and checks it's a vowel or consonant
public class lab4_13 {
    public static void main(String args[]){
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // prompt user for letter, filter input, and close input
        System.out.print("Enter a letter: ");
        char response = input.nextLine().charAt(0);
        char letter = Character.toLowerCase(response);
        input.close();

        // determine whether the filtered input is a vowel, consonant, or invalid and display results
        if (letter >= 'a' && letter <='z'){
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                System.out.println(response + " is a vowel");
            }
            else {
                System.out.println(response + " is a consonant.");
            }
        }
        else {
            System.out.println(response + " is an invalid input");
        }

        // exit program
        System.exit(0);
    }
}
