// Shawn Aviles 1/15/2021
import java.util.Scanner;

// this program writes the sum of all numbers in the major diagonal in n x n matrix
public class lab8_2 {
    public static void main (String[] args){
        // create scanner object
        Scanner input = new Scanner(System.in);

        // create multidimensional array, prompt user for matrix, close input
        System.out.println("Enter a 4-by-4 matrix row by row: ");
        double[][] matrix = new double[4][4];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = input.nextDouble();
            }
        }
        input.close();

        // Display results and exit program
        System.out.println("Sum of the elements a in the major diagonal is " + sumMajorDiagonal(matrix));
        System.exit(0);
    }

    // method returns sum of all the numbers in major diagonal of matrix, returns -1 if not a n x n matrix
    public static double sumMajorDiagonal(double[][] m){
        double sum = 0;
        for(int j = 0; j < m.length; j++){
            if (m.length != m[j].length) return -1;
        }
        for(int i = 0; i < m.length; i++){
            sum += m[i][i];
        }
        return sum;
    }
}
