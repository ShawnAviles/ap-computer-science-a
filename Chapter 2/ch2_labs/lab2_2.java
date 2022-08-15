// Shawn Aviles 9/26/2020
// The program asks the user for the radius and length of a cylinder to calculate its area and volume
import java.util.Scanner;

public class lab2_2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Ask user for radius and length values
        System.out.print("Enter the radius and the length of a cylinder: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();

        // calculate the area and volume of the cylinder
        double area = radius * radius * Math.PI;
        double volume = area * length;

        // display results and close input
        System.out.printf("The area is %.4f \n", area);
        System.out.printf("The volume is %.1f \n", volume);
        input.close();
    }
}