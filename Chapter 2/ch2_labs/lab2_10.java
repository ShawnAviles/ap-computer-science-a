// Shawn Aviles 9/30/2020
// This program calculates the energy needed to heat water from an initial temperature to a final temperature
import java.util.Scanner;

public class lab2_10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // prompt user for amount of water (kg), initial temperature, and final temperature of the water (degrees Celsius)
        System.out.print("Enter the amount of water in kilograms: ");
        float waterMass = input.nextFloat();
        System.out.print("Enter the initial temperature: ");
        float initialTemp = input.nextFloat();
        System.out.print("Enter the final temperature: ");
        float finalTemp = input.nextFloat();

        // calculate the energy need to heat the water
        float energy = waterMass * (finalTemp - initialTemp) * 4184;

        // print results and close input 
        System.out.println("The energy needed is " + energy);
        input.close();
    }
}
