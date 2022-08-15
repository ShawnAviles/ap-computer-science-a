// Shawn Aviles 1/14/2021
import java.util.Scanner;

// this program tests a bubble sorting method
public class lab7_18{
    public static void main (String args[]){
        // create scanner object
        Scanner input = new Scanner(System.in);

        // create array, fill with 10 inputted numbers, close input object
        double[] num = new double[10];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < num.length; i++){
            num[i] = input.nextDouble();
        }
        input.close();

        // display results and exit program
        bubbleSort(num);
        System.out.println("Bubble Sorted Array: " + java.util.Arrays.toString(num));
        System.exit(0);

    }

    // method sorts an array using bubble sorting which passes through an array multiple times, 
    // each time successive neighboring pairs are compared
    public static void bubbleSort(double[] m){
        double temp;
        int n = m.length - 1;
        while(n != 0) {
            int i;
            for (i = 0; i < n; i++){
                if(m[i] > m[i + 1]){
                    temp = m[i];
                    m[i] = m[i + 1];
                    m[i + 1] = temp;
                }
            }
        n = i - 1;
        }
    }
}