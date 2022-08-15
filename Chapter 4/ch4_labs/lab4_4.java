// Shawn Aviles 11/1/2020
import java.util.Scanner;

// This program prompts the user for the side length of a hexagon and computes its area
public class lab4_4 {
    public static void main(String args[]){
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // prompt user for the side length of a hexagon and close input
        System.out.print("Enter the side: ");
        double side = input.nextDouble();
        input.close();

        // calculate area of hexagon
        double area = (6 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 6)); 

        // display rounded results and exit program
        System.out.println("The area of the hexagon is " + Math.round(area * 100) / 100.0);
        System.exit(0);

    }
}