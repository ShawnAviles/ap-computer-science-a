// Shawn Aviles 11/11/2020
import java.util.Scanner;

// this program prompts the user for information to print a payroll statement
public class lab4_23 {
    public static void main(String args[]){
        // create scanner object
        Scanner input = new Scanner(System.in);

        // prompt user for information
        System.out.print("Enter employee's name: ");
        String name = input.nextLine();
        System.out.print("Enter number of hours worked in a week: ");
        double hours = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double payRate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double taxFederal = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double taxState = input.nextDouble();
        input.close();

        // filter input of tax rates to desired percentage (for print statement)
        if (taxFederal < 1)
            taxFederal *= 100.0;
        if (taxState < 1)
            taxState *= 100.0;

        // rounded calculations of gross pay, federal, state withholdings, and net pay
        double grossPay = Math.round(hours * payRate * 100.0) / 100.0;
        double withholdingsFederal = Math.round(grossPay * taxFederal) / 100.0;
        double withholdingsState = Math.round(grossPay * taxState) / 100.0;
        double deductions = withholdingsFederal + withholdingsState;
        double netPay = grossPay - withholdingsFederal - withholdingsState;

        // display results and exit program
        String statement = 
            "\nEmployee Name: " + name +
            "\nHours Worked: " + hours +
            "\nPay Rate: $" + payRate +
            "\nGross Pay: $" + grossPay +
            "\nDedcutions:" + 
            "\n  Federal Withholdings (" + taxFederal + "%): $" + withholdingsFederal +
            "\n  State Withholdings (" + taxState + "%): $" + withholdingsState +
            "\n  Total Deductions: $" + deductions +
            "\nNet Pay: $" + netPay;
        System.out.println(statement);
        System.exit(0);
    }
    
}
