// Shawn Aviles 1/14/2021
import java.util.Scanner;

// this program tests a method that returns true if two lists entered are completely identical
public class lab7_26{
    public static void main (String[] args){
        // create scanner object
        Scanner input = new Scanner(System.in);

        // prompt user for lists, close input object
        System.out.print("Enter list1: ");
        int size1 = input.nextInt();
        int[] list1 = new int[size1];
        for (int i = 0; i < list1.length; i++){
            list1[i] = input.nextInt();
        }
        System.out.print("Enter list2: ");
        int size2 = input.nextInt();
        int[] list2 = new int[size2];
        for (int i = 0; i < list1.length; i++){
            list2[i] = input.nextInt();
        }
        input.close();

        // display results exit programa
        String notEqual = equals(list1, list2)?"":"not ";
        System.out.println("The two lists are " +  notEqual + "strictly identical");
        System.exit(0);
    }

    // determine where methods are completely identical
    public static boolean equals(int[] list1, int[] list2){
        boolean result = true;
        if (list1.length == list2.length){
            for (int i = 0; i < list1.length; i++){
                if(list1[i] != list2[i]) result = false;
            }
        }
        else result = false;
        return result;
    }
}