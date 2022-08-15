// Shawn Aviles 1/7/2021
import java.util.Scanner;

// this program uses an overloaded method that returns the average of an array
public class lab7_8 {
    public static void main (String[] args){
        // create scanner object
        Scanner input = new Scanner(System.in);

        // create array, prompt user to enter 10 numbers, close input object
        System.out.println("Enter 10 doubles: ");
        double num[] = new double[10];
        for (int i = 0; i < num.length; i++){
            num[i] = input.nextDouble();
        }
        input.close();

        // display results and exit program
        System.out.println("The average of the 10 numbers: " + average(num));
    }

    // computes the average of an array of int
    public static int average(int[] array){
        int sum = 0;
        for (int n: array){
            sum += n;
        }
        return sum / array.length;
    }

    // computes the average of an array of doubles
    public static double average(double[] array){
        double sum = 0;
        for (double n: array){
            sum += n;
        }
        return sum / array.length;
    }
}
