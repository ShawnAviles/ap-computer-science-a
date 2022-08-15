// Shawn Aviles 1/7/2021
import java.util.Scanner;

// this program finds the smallest element in an array of doubles
public class lab7_9 {
    public static void main(String[] args){
        // create scanner object
        Scanner input = new Scanner(System.in);

        // create array, prompt user to enter 10 numbers, close input object
        System.out.print("Enter ten numbers: ");
        double num[] = new double[10];
        for (int i = 0; i < num.length; i++){
            num[i] = input.nextDouble();
        }
        input.close();

        // display result and exit program
        System.out.println("The minimum number is: " + min(num));
        System.exit(0);
    }

    // return the smallest value in array
    public static double min(double[] array){
        double min = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] < min) min = array[i];
        }
        return min;
    }
}


