// Shawn Aviles 1/6/2021
import java.util.Arrays;
import java.util.Scanner;

// this program reverses the list of numbers in the order they were read
public class lab7_2 {
    public static void main (String[] args){
        // create scanner object
        Scanner input = new Scanner(System.in);


        // display first array, close input object, and display result
        System.out.print("Enter 10 numbers: ");
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
        }
        input.close();
        System.out.println(Arrays.toString(numbers));

    
        // display result and exit program
        int[] numbersReversed = reverse(numbers);
        System.out.println(Arrays.toString(numbersReversed));
        System.exit(0);
    }

    // reverses list
    public static int[] reverse(int[] list){
        int[] result = new int[list.length];
        for (int i = 0, j = list.length - 1; i < list.length; i ++, j--){
            result[j] = list[i];
        }
        return result;
    }
}
