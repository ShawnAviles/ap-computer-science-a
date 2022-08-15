// Shawn Aviles 9/26/2020
// this program asks user for number of pounds and converts value to kilograms
import java.util.Scanner;

public class lab2_4 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt user to input the number of pounds
        System.out.print("Enter a number in pounds: ");
        double pounds = input.nextDouble();

        // calculations to convert pounds to kilograms
        double kilograms = pounds * 0.454;

        // display results and close input
        System.out.println(pounds + " pounds is " + kilograms + " kilograms");
        input.close();
    }
}
