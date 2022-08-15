// Shawn Aviles 10/22/2020
import java.util.Scanner;

// this program determines the shipping cost of a package based on its weight in pounds
public class lab3_18 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // prompt user for the weight of the package and closes input 
        System.out.print("Enter the weight of the package (pounds): ");
        double weight = input.nextLong();
        input.close();

        // first, determine if the weight is valid and can be shipped
        // then display the weight of the package and the cost
        if (weight > 0 && weight <= 20){
            if (weight <= 1){
                System.out.println("Package \n Weight: " + weight + " pounds \n Cost: $3.50");
            }
            else if (weight <= 3){
                System.out.println("Package \n Weight: " + weight + " pounds \n Cost: $5.50");
            }
            else if (weight <= 10){
                System.out.println("Package \n Weight: " + weight + " pounds \n Cost: $8.50");
            }
            else {
                System.out.println("Package \n Weight: " + weight + " pounds \n Cost: $10.50");
            }
        }
        else {
            System.out.println("The package cannot be shipped");
        }
    }
}
