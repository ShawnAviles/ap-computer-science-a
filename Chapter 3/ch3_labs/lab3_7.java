// Shawn Aviles 10/22/2020
import java.util.Scanner;

//  This program prompts user for amount of money and changes money into smaller monetary units
public class lab3_7{
    public static void main(String[] args){
        // Create Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user for the amount and close input
        System.out.println("Enter an amount in double, for example 11.56: ");
        double amount = input.nextDouble();
        input.close();

        // Code is from listing 2.10 as the lab informs us to use
        int remainingAmount = (int)(amount * 100);

        // Find the number of one dollars
        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount %= 100;

        // Find the number of quarters in remaining amount
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount %= 25;

        // Find the number of dimes in remaining amount
        int numberOfDimes = remainingAmount / 10;
        remainingAmount %= 10;

        // Find the number of nickels in remaining amount
        int numberOfNickels = remainingAmount / 5;
        remainingAmount %= 5;

        // Find the number of pennies in remaining amount
        int numberOfPennies = remainingAmount;

        // Display results
        System.out.println("Your amount " + amount +  " consists of");
        String unit;

        /*
        first if statement determines if the amount should be printed;
        then, ternary operator assigns the monetary unit to be plural 
        or singular if the value is greater than 1;
        final line of each displays result
        */
        if (numberOfOneDollars > 0){
            unit = (numberOfOneDollars > 1) ? " dollars":" dollar";
            System.out.println("    " + numberOfOneDollars + unit);
        }
        if (numberOfQuarters > 0){
            unit = (numberOfQuarters > 1) ? " quarters":" quarter";
            System.out.println("    " + numberOfQuarters + unit);
        }
        if (numberOfDimes > 0){
            unit = (numberOfDimes > 1) ? " dimes":" dime";
            System.out.println("    " + numberOfDimes + unit);
        }
        if (numberOfNickels > 0){
            unit = (numberOfNickels > 1) ? " nickels":" nickel";
            System.out.println("    " + numberOfNickels + unit);
        }
        if (numberOfPennies > 0){
            unit = (numberOfPennies > 1) ? " pennies":" penny";
            System.out.println("    " + numberOfPennies + unit); 
        }
    }
}