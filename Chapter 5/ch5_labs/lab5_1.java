// Shawn Aviles 11/20/2020
import java.util.Scanner;

/*
this program prompts user for a list of numbers and returns the
amount of positives, negatives, the total, and the average 
*/
public class lab5_1{
    public static void main(String args[]){
        // create scanner object & initialize variables
        Scanner input = new Scanner(System.in);
        int positive = 0;
        int negative = 0;
        double total = 0;
        int counter = 0;

        // prompt user for numbers
        System.out.print("Enter an integer, the input ends if it is 0: ");
        int num;

        // loop receives input until 0 is inputted and reads the data
        while ((num = input.nextInt()) != 0){
            if (num > 0)
                positive++;
            else if (num < 0)
                negative++;
            else
                break;
            counter++;
            total += num;
        }

        // close scanner object and determine if value is valid
        input.close();
        if (counter == 0){
            System.out.println("No numbers are entered except 0");
            System.exit(0);
        }

        // display results and exit program
        String result = 
        "The number of positives is " + positive +
        "\nThe number of negatives is " + negative +
        "\nThe total is " + total +
        "\nThe average is " + total/counter;
        System.out.println(result);
        System.exit(1);
    }
}