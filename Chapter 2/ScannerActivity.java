// Shawn Aviles 9/22/2020
// Given an investment we had to calculate the future investment
import java.util.Scanner;

public class ScannerActivity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Ask user for the values needed to calculate the future Investment Amount
        System.out.println("How much are you investing?");
        double investmentAmount = input.nextDouble();

        System.out.println("What is the monthly interest rate. Enter without percentage sign");
        double monthlyInterestRate = input.nextDouble();
        monthlyInterestRate/=100;

        System.out.println("How many years?");
        double numberOfYears = input.nextDouble();

        // Calculate the future Investment Amount
        double futureInvestmentAmount = investmentAmount * Math.pow((1 + monthlyInterestRate), (numberOfYears * 12));

        // Results and Close
        System.out.printf("The Future Investment Value is $ %.2", futureInvestmentAmount);
        input.close();
    }
}