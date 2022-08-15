// Shawn Aviles 11/10/2020
import java.util.Scanner; 

// this program prompts the user to enter a SSN and displays whether it is valid
public class lab4_21 {
    public static void main (String args[]){
        // create scanner object
        Scanner input = new Scanner(System.in);

        // prompt user to enter a SSN and close input
        System.out.print("Enter a SSN (i.e. 000-00-0000): ");
        String social = input.nextLine();
        input.close();

        // input filter: make sure only digits are in the SSN and its long enough
        boolean digit1 = false;
        boolean digit2 = false;
        boolean digit3 = false;
        boolean digit4 = false;
        boolean set1 = false;
        boolean set2 = false;
        boolean set3 = false;

        for (int i = 0; i <= social.length(); i ++) {
            boolean isDigit = Character.isDigit(social.charAt(i));
            if (i == 0 && isDigit){
                digit1 = true;
            }
            else if (i == 1 && isDigit){
                digit2 = true;
            }
            else if (i == 2 && isDigit){
                digit3 = true;
                set1 = digit1 && digit2 && digit3;
                digit1 = false;
                digit2 = false;
                digit3 = false;
            }
            else if (i == 4 && isDigit) {
                digit1 = true;
            }
            else if (i == 5 && isDigit) {
                digit2 = true;
                set2 = digit1 && digit2;
                digit1 = false;
                digit2 = false;
            }
            else if (i == 7 && isDigit) {
                digit1 = true;
            }
            else if (i == 8 && isDigit) {
                digit2 = true;
            }
            else if (i == 9 && isDigit) {
                digit3 = true;
            }
            else if (i == 10 && isDigit) {
                digit4 = true;
                set3 = digit1 && digit2 && digit3 && digit4;
            }
        }

        // display results and exit program
        if (set1 && set2 && set3){
            System.out.println(social + " is a valid social security number");
        }
        else {
            System.out.println(social + " is an invalid social security number");
        }
        System.exit(1);
    } 
}
