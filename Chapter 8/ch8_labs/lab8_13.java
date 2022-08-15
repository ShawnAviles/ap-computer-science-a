// Shawn Aviles 1/15/2021
import java.util.Arrays;
import java.util.Scanner;

// this program locates the largest element in a two-dimensional array
public class lab8_13 {
    public static void main (String[] args){
        // create scanner object
        Scanner input = new Scanner(System.in);

        // create multidimensional array, prompt user for matrix, close input
        System.out.print("Enter the rows and columns of the array: ");
        int row = input.nextInt();
        int column = input.nextInt();
        System.out.println("Enter the array: ");
        double[][] matrix = new double[row][column];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = input.nextDouble();
            }
        }
        input.close();

        // Display results and exit program
        System.out.println("The location of the largest element is at " + Arrays.toString(locateLargest(matrix)));
        System.exit(0);
    }

    // method returns the location of the largest element in an array
    public static int[] locateLargest(double[][] a){
        int[] location = new int[2];
        double max = a[0][0]; 
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                if (a[i][j] > max) {
                    max = a[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }
}
