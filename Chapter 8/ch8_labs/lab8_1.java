// Shawn Aviles 1/15/2021
import java.util.Scanner;

// this program sums all the elements in a specified column in a matrix
public class lab8_1{
    public static void main(String[] args){
        // create scanner object
        Scanner input = new Scanner(System.in);

        // create multidimensional array, prompt user for matrix, close input
        System.out.println("Enter a 3-by-4 matrix row by row: ");
        double[][] matrix = new double[3][4];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = input.nextDouble();
            }
        }
        input.close();

        // Display results and exit program
        System.out.println("Sum of the elements at column 0 is " + sumColumn(matrix, 0));
        System.out.println("Sum of the elements at column 0 is " + sumColumn(matrix, 1));
        System.out.println("Sum of the elements at column 0 is " + sumColumn(matrix, 2));
        System.out.println("Sum of the elements at column 0 is " + sumColumn(matrix, 3));
        System.exit(0);
    }

    // method returns the sum of all elements in a specified column
    public static double sumColumn(double[][] m, int columnIndex){
        double sum = 0;
        for(int i = 0; i < m.length; i++){
            sum += m[i][columnIndex];
        }
        return sum;
    }
}