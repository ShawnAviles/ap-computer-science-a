// Shawn Aviles 4/22/2021
import java.util.ArrayList;
import java.util.Scanner;

// program tests the sum method 
public class lab11_12 {
    public static void main(String[] args) {
        // create scanner object and an ArrayList
		Scanner input = new Scanner(System.in);
		ArrayList<Double> list = new ArrayList<Double>();

		// prompt user to enter 5 numbers and close scanner object
		System.out.print("Enter 5 numbers: ");
		for (int i = 0; i < 5; i++) {
			list.add(input.nextDouble());
		}
        input.close();

		// display result and exit program
		System.out.println("Sum: " + sum(list));
        System.exit(0);
    }

    // method returns the sum of all numbers in an ArrayList
    public static double sum(ArrayList<Double> list){
        double sum = 0;
        for (int i = 0; i < list.size(); i++){
            sum += list.get(i);
        }
        return sum;
    }
}

