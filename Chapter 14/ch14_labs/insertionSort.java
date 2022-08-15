// Shawn Aviles 5/12/2021
import java.util.Arrays;

// program tests insertionSort method
public class insertionSort {
    public static void main(String[] args) {
        // create double array
        double[] list = {7.5, 9.3, 11.2, 2.6, 6.7, 8.9};

        // test method, display result, exit program
        inSort(list);
        System.out.println(Arrays.toString(list));
        System.exit(0);
    }   

    // insertion sort method that sorts an array of double elements
    public static double[] inSort(double[] array) {
        double temp;

        // loop goes through every element in array
        for(int i = 1; i < array.length; i++){
            double key = array[i];
            int j = i - 1;

            // loop determines if element is larger than previous ones
            while(j >= 0 && array[j] > key){
                temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
                j--;
            }
        }
        return array;
    }
}