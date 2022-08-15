// Shawn Aviles 10/22/2020
import java.util.Scanner;
/*
this programs prompts user to enter an integer and determines 
whether it is divisible by 5 and 6, 5 or 6, and 5 or 6 but not both
*/
public class lab3_26 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // prompt user for integer and closes input
        System.out.print("Enter an integer: ");
        int num = input.nextInt();
        input.close();

        // determine if integer is divisible by 5 and 6, 5 or 6, and 5 or 6 but not both 
        // then assigns value to variable
        boolean divisibleAnd = num % 5 == 0 && num % 6 == 0;
        boolean divisibleOr = num % 5 == 0 || num % 6 == 0;
        boolean divisibleExclusiveOr = num % 5 == 0 ^ num % 6 == 0;

        // display results
        System.out.println("Is " + num + " divisible by 5 and 6? " + divisibleAnd);
        System.out.println("Is " + num + " divisible by 5 or 6? " + divisibleOr);
        System.out.println("Is " + num + " divisible by 5 or 6, but not both? " + divisibleExclusiveOr);
        
        System.exit(0);
    }
}
