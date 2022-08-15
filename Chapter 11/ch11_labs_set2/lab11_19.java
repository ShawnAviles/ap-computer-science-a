// Shawn Aviles 4/22/2021
import java.util.Scanner;
import java.util.ArrayList;

// Bin Packing program places an object into the first bin in which it would fit
public class lab11_19 {
    public static void main(String[] args) {
        // create scanner object
        Scanner input = new Scanner(System.in);
        
        // prompt user for objects and create ArrayList
        System.out.print("Enter the number of objects: ");
        int numberOfObjects = input.nextInt();
        ArrayList<Integer> objects = new ArrayList<>();
        
        // prompt user for weight of objects
        System.out.print("Enter the weights of the objects: ");
        for (int i = 0; i < numberOfObjects; i++) {
            objects.add(input.nextInt());
        }
        input.close();

        // display results and exit program
        int container = 1;
        while (!objects.isEmpty()) {
            System.out.println("Container " + container++ + " contains objects with weight " + getContainer(objects, 10));
        }
        System.exit(0);
    }
    
    // method returns the result of what weights would be in the container 
    public static String getContainer(ArrayList<Integer> objects, int max) {
        String result = "";
        for (int i = 0; i < objects.size(); i++) {
            if(objects.get(i) <= max) {
                int tmp = objects.get(i);
                result += tmp + " ";
                objects.remove(i);
                return result + getContainer(objects, max - tmp);
            }
        }
        return result;
    }
}
