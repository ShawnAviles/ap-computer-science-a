// Shawn Aviles 9/26/2020
// this program is used for financial situations to calculate tips

import java.util.Scanner;

public class lab2_5 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        // prompt user for subtotal amount and gratuity rate
        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuity = input.nextDouble();
        gratuity /= 100;

        // calculate tip and total
        double tip = subtotal * gratuity;
        double total = subtotal + tip;

        // print the tip and total; and close input
        System.out.println("The gratuity is $" + tip + " and total is $" + total);
        input.close();
    }
}
