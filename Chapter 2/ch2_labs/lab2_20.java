// Shawn Aviles 9/30/2020
// this program prompts user for balance and interest rate to calculate interest for the next month 
import java.util.Scanner;

public class lab2_20 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // prompt user for balance and annual percentage interest rate
        System.out.print("Enter the balance and interest rate (e.g., 3 for 3%): ");
        float balance = input.nextFloat();
        float annualInterestRate = input.nextFloat();

        // calculate the interest amount for the next month
        float interest = balance * (annualInterestRate / 1200);

        // display interest of the next month and close input
        System.out.println("The interest is " + interest);
        input.close();
    }
}
