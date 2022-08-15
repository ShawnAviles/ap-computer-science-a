// Shawn Aviles 11/8/2020
import java.util.Scanner;

// this program prompts the user to enter a letter grade amd display a corresponding value
// i.e. A,B,C,D, or F respectively displays 4,3,2,1, or 0
public class lab4_14 {
    public static void main(String args[]){
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // prompt user for letter grade, filter input, and close input
        System.out.print("Enter a letter grade: ");
        char letter = input.nextLine().charAt(0);
        input.close();
        char grade = Character.toUpperCase(letter);

        // determine and display what the numeric value of the inputted grade is
        switch (grade){
            case 'A': System.out.println("The numeric value for grade " + grade + " is 4");
                break;
            case 'B': System.out.println("The numeric value for grade " + grade + " is 3");
                break;
            case 'C': System.out.println("The numeric value for grade " + grade + " is 2");
                break;
            case 'D': System.out.println("The numeric value for grade " + grade + " is 1");
                break;
            case 'F': System.out.println("The numeric value for grade " + grade + " is 0");
                break;    
            default: System.out.println(letter + " is an invalid grade");
                System.exit(0);
        }

        // exit program
        System.exit(1);
    }
}