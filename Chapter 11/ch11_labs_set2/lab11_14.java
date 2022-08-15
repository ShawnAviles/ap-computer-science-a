// Shawn Aviles 4/22/2021
import java.util.ArrayList;
import java.util.Scanner;

// program tests the union method
public class lab11_14 {
    public static void main(String[] args) {
        // create scanner object
        Scanner input = new Scanner(System.in);
        
        // create two ArrayLists
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        // prompt user to enter two lists of 5 integers, close scanner object
        System.out.print("Enter five integers for list1: ");
		for (int i = 0; i < 5; i++) {
			list1.add(input.nextInt());
		}
		System.out.print("Enter five integers for list2: ");
		for (int i = 0; i < 5; i++) {
			list2.add(input.nextInt());
		}
        input.close();

        // combine lists
        ArrayList<Integer> list3 = union(list1,list2);

        // display results and exit program
        System.out.print("The combined list is ");
        for (int i = 0; i < list3.size(); i++) {
            System.out.print(list3.get(i) + " ");
        }
        System.out.println();
        System.exit(0);
    }

    // method returns union of two array lists 
    public static ArrayList<Integer> union( ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> list3 = list1;
        for (int i = 0; i < list2.size(); i++) {
            list3.add(list2.get(i));
        }
        return list3;
    }
}
