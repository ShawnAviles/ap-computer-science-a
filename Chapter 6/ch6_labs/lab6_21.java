// Shawn Aviles 12/4/2020
import java.util.Scanner;

public class lab6_21 {
    // execute method to translate a phone number that has letters to all digits
    public static void main(String args[]){
        // Create scanner object
        Scanner input = new Scanner(System.in);

        // prompt user to enter phone number and close input
        System.out.print("Enter a string (phone number): ");
        String phoneNumber = input.nextLine();
        input.close();
        String finalNumber = "";

        // translate each character to a digit
        for (int i = 0; i < phoneNumber.length(); i++){
            if (Character.isLetter(phoneNumber.charAt(i)))
                finalNumber += getNumber(phoneNumber.charAt(i));
            else
                finalNumber += phoneNumber.charAt(i);
        }
        
        // display results and exit program
        System.out.println(finalNumber);
        System.exit(0);
    }

    // method returns a number when a letter is inputted based on the international standard letter/mapping for telephones
    public static int getNumber(char uppercaseLetter){
        char input = Character.toUpperCase(uppercaseLetter);
        switch (input){
            case 'A': case 'B': case 'C':
                return 2;
            case 'D': case 'E': case 'F':
                return 3;
            case 'G': case 'H': case 'I':
                return 4;
            case 'J': case 'K': case 'L':
                return 5;
            case 'M': case 'N': case 'O':
                return 6;
            case 'P': case 'Q': case 'R': case 'S':
                return 7;
            case 'T': case 'U': case 'V':
                return 8;
            case 'W': case 'X': case 'Y': case 'Z':
                return 9;
            default: 
                return uppercaseLetter;
        }
    }
}
