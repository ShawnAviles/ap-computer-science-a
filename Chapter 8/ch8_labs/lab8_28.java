// Shawn Aviles 1/15/2021
import java.util.Scanner;

// this program determines if two two-dimensional arrays are strictly identical
public class lab8_28 {
    public static void main(String[] args){
        // create scanner object
        Scanner input = new Scanner(System.in);

        // prompt user for lists, close input object
        System.out.print("Enter list1: ");
        int[][] list1 = new int[3][3];
        for (int i = 0; i < list1.length; i++){
            for (int j = 0; j < list1[i].length; j++){
                list1[i][j] = input.nextInt();
            }
        }
        System.out.print("Enter list2: ");
        int[][] list2 = new int[3][3];
        for (int n = 0; n < list1.length; n++){
            for (int m = 0; m < list1[n].length; m++){
                list2[n][m] = input.nextInt();
            }
        }
        input.close();

        // display results, exit program
        String isIdentical = equals(list1, list2) ? "": " not";
        System.out.println("The two arrays are" + isIdentical + " strictly identical");
        System.exit(0);
    }

    // method returns boolean determining if two dimensional arrays are strictly identical
    public static boolean equals(int[][] m1, int[][] m2){
        boolean result = true;
        for (int i = 0; i < m1.length; i++){
            for (int j = 0; j < m1[i].length; j++){
                if(m1[i][j] != m2[i][j]) result = false;
            }
        }
        return result;
    }

}
