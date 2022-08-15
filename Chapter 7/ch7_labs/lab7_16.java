// Shawn Aviles 1/8/2021

// this program displays the time it takes to perform a linear search compared to a binary search
public class lab7_16 {
    public static void main (String[] arga){
        // generate an array of 100000 random numbers each ranging from 1-10000, and key
        int[] num = new int[100000];
        for (int i = 0; i < num.length; i++){
            num[i] = (int)(Math.random() * 100000 + 1);
        }
        int key = (int)(Math.random() * 100000 + 1);

        // begin timer for Linear search
        long startTimeLS = System.currentTimeMillis(); 
        int x = linearSearch(num, key);
        long endTimeLS = System.currentTimeMillis(); 
        long executionTimeLS = endTimeLS - startTimeLS;

        // timer for binary search
        java.util.Arrays.sort(num); //selection sort
        long startTimeBS = System.currentTimeMillis();
        int y = java.util.Arrays.binarySearch(num, key);
        long endTimeBS = System.currentTimeMillis(); 
        long executionTimeBS = endTimeBS - startTimeBS;

        // Display results and exit program
        System.out.println("Linear Search Time in ms: " + executionTimeLS + "\nReturned: " + x);
        System.out.println("Binary Search Time in ms: " + executionTimeBS + "\nReturned: " + y);
        System.exit(0);
    }

    public static int linearSearch(int[] list, int key){
        for (int i = 0; i < list.length; i++) {
            if (key == list[i])
                return i;
        }
        return -1;
    }
}
