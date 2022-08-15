// Shawn Aviles 1/15/2021
import java.util.Scanner;

// this program finds which cell is flipped in a 6 x 6 matrix of 1's and 0's
public class lab8_23 {
    public static void main(String[] args){
        // create scanner object
        Scanner input = new Scanner(System.in);

        // prompt user for matrix, close input
        System.out.println("Enter a 6-by-6 matrix row by row: ");
        int[][] matrix = new int[6][6];
        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = input.nextInt();
            }
        }
        input.close();

        // display result and exit program
        int row = flippedRow(matrix);
        int column = flippedColumn(matrix);

        if (column == -1 && row == -1)
            System.out.println("There is no flipped cell.");
        else
            System.out.println("The flipped cell is at (" + row + ", " + column + ")");
    }

    // method determines which column has the flipped cell 
    public static int flippedColumn(int m[][]) {
        int sum = 0;
       
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                sum += m[j][i];
            }
            if (sum % 2 != 0) {
                return i;
            }
        }
        return -1;
    }

    // method determines which row has the flipped cell 
    public static int flippedRow(int m[][]) {
        int sum = 0;
       
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                sum += m[i][j];
            }
            if (sum % 2 != 0) {
                return i;
            }
        }
        return -1;
    }
}
