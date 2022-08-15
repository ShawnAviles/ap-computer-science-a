// Shawn Aviles 11/1/2020
import java.util.Scanner;

// This program computes the area of a pentagon when given the length from its center to a vertex
public class lab4_1{
    public static void main(String args[]){
        // Create scanner object
        Scanner input = new Scanner(System.in);

        // prompt user for length from the center to the vertex of a pentagon
        System.out.print("Enter the length from the center to a vertex: ");
        double r = input.nextDouble();
        input.close();

        // Calculate area of the pentagon
        double side = 2 * r * Math.sin(Math.PI / 5.0);
        double area = (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));

        // Display rounded result and exit program
        System.out.println("The area of the pentagon is " + Math.round(area * 100.0) / 100.0);
        System.exit(0);
    }
}