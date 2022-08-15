// Shawn Aviles 4/22/2021
import java.util.Scanner;
import java.util.ArrayList;

// program tests the removeDuplicates method
public class lab11_13 {
    public static void main(String[] args) {
        // create scanner object and an ArrayList
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();

		// prompt user to enter 5 numbers and close scanner object
		System.out.print("Enter 10 numbers: ");
		for (int i = 0; i < 10; i++) {
			list.add(input.nextInt());
		}
        input.close();

		// display result and exit program
		removeDuplicate(list);
        System.out.print("The distinct integers are ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        System.exit(0);
    }

    // method removes duplicate elements from array list of integers\
    public static void removeDuplicate(ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++){
            for (int j = i + 1; j < list.size() - 1; j++){
                if (list.get(i) == list.get(j)) list.remove(j);
            }
        }
    } 
}
