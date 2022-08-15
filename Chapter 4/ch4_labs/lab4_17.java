// Shawn Aviles 11/9/2020
import java.util.Scanner;

/*
this program prompts the user for a year and the first three letters of a month name 
and displays the number of days in the month
*/
public class lab4_17 {
    public static void main(String args[]){
        // create scanner object 
        Scanner input = new Scanner(System.in);

        // prompt user to enter a year and first 3 letters of a month's name and close input
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        input.nextLine();
        System.out.print("Enter a month: ");
        String month = input.nextLine().substring(0, 3);
        input.close();

        // determine if it is a leap year and assign the amount of days in February accordingly
        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        int FebDays = isLeapYear ? 28: 29;

        // determine and display the days user's inputted month 
        switch (month) {
            case "Jan": case "Mar": case "May": case "July": case "Jul": case "Aug": case "Oct": case "Dec":
                System.out.println(month + " " + year + " has 31 days");
                break;
            case "Feb": System.out.println(month + " " + year + " has " + FebDays + " days");
                break;
            case "Apr": case "Jun": case "Sep": case "Nov":
                System.out.println(month + " " + year + " has 30 days");
                break;
            default: System.out.println(month + " is not a correct month name");
                System.exit(0);
        }

        // exit program
        System.exit(1);
    }
}
