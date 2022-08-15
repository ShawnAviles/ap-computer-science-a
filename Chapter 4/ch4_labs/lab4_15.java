// Shawn Aviles 11/8/2020
import java.util.Scanner;

// this program prompts the user to enter a letter and display its corresponding letter on telephone letter/number mapping
public class lab4_15 {
    public static void main (String args[]){
        // create scanner object
        Scanner input = new Scanner(System.in);

        // prompt user for letter, filter input, and close input object
        System.out.print("Enter a letter: ");
        char response = input.nextLine().charAt(0);
        input.close();
        char letter = Character.toUpperCase(response);

        // determine and display the inputted letter's corresponding number
        if (letter == 'A' || letter == 'B' || letter == 'C'){
            System.out.println("The corresponding number is 2");
        }
        else if (letter == 'D' || letter == 'E' || letter == 'F'){
            System.out.println("The corresponding number is 3");
        }
        else if (letter == 'G' || letter == 'H' || letter == 'I'){
            System.out.println("The corresponding number is 4");
        }
        else if (letter == 'J' || letter == 'K' || letter == 'L'){
            System.out.println("The corresponding number is 5");
        }
        else if (letter == 'M' || letter == 'N' || letter == 'O'){
            System.out.println("The corresponding number is 6");
        }
        else if (letter == 'P' || letter == 'Q' || letter == 'R' || letter == 'S'){
            System.out.println("The corresponding number is 7");
        }
        else if (letter == 'T' || letter == 'U' || letter == 'V'){
            System.out.println("The corresponding number is 8");
        }
        else if (letter == 'W' || letter == 'X' || letter == 'Y' || letter == 'Z'){
            System.out.println("The corresponding number is 9");
        }
        else{
            System.out.println(response + " is an invalid input");
        }

        // exit program
        System.exit(0);
    }
}
