// Shawn Aviles;
import java.util.Scanner;

// this program tests a method that returns a new array by eliminating the duplicate values in the array
public class lab7_15{
    public static void main (String[] args){
        // create scanner object
        Scanner input = new Scanner(System.in);

        // prompt user for ten numbers, create array with those numbers
        System.out.print("Enter ten numbers: ");
        int[] num = new int[10];
        for (int i = 0; i < num.length; i++){
            num[i] = input.nextInt();
        }
        input.close();
        
        // display result and exit program
        int[] distinctNum = eliminateDuplicates(num);
        System.out.print("The distinct numbers are: ");
        for(int i: distinctNum){
            if (i > 0) System.out.print(i + " ");
        }
        System.exit(0);

    }

    // method returns a new array by eliminating the duplicate values in the array
    public static int[] eliminateDuplicates(int[] list){
        int[] distinctNum = new int[list.length];
        int i = 0;
        for (int a: list){
            if (linearSearch(distinctNum, a) == -1){
                distinctNum[i] = a;
                i++;
            }
        }
        return distinctNum;
    }

    // method searches array sequentially for a key and returns the index where it is
    public static int linearSearch(int[] list, int key){
        for (int i = 0; i < list.length; i++) {
            if (key == list[i])
                return i;
        }
        return -1;
    }
}