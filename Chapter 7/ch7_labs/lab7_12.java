// Shawn Aviles 1/7/2021
import java.util.Arrays;
import java.util.Scanner;

// this program reverses an array by reversing passed array and returning it
public class lab7_12 {
    public static void main (String[] args){
        // create scanner class
        Scanner input = new Scanner(System.in);
        
        // prompt user for 10 numbers, create array, close input
        System.out.print("Enter ten numbers: ");
        int[] list = new int[10];
        for (int i = 0; i < list.length; i++){
            list[i] = input.nextInt();
        }
        input.close();

        // display results and exit program
        reverse(list);
        System.out.println("Reversed array: " + Arrays.toString(list));
    }

    // reverses array
    public static int[] reverse(int[] array){
        int j = array.length - 1;
        for (int i = 0; i < array.length / 2; i++, j--){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        return array;
    }
}
