// Shawn Aviles 12/4/2020
import java.util.Scanner;

// this program displays an integer in reverse
public class lab6_4 {
    public static void main(String args[]){
        // create a scanner object
        Scanner input = new Scanner(System.in);

        // prompt user for integer and close input
        System.out.print("Enter an integer: ");
        int num = input.nextInt();
        input.close();

        // execute method
        reverse(num);

        // exit program
        System.exit(0);
    }

    // this method displays the reverse of the integer inputted
    public static void reverse(int number){
        String num = "" + number;
        String reverse = "";
        for (int i = 1; i <= num.length(); i++){
            char digit;
            digit = num.charAt(num.length() - i);
            reverse += digit;
        }
        System.out.println(reverse);
    }
}
