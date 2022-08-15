// Shawn Aviles 11/22/2020

// this program displays all the numbers from 100 - 1000 that are divisible by 5 and 6
public class lab5_10 {
    public static void main (String args[]){
        // initialize variable to determine when to go to the next line
        int counter = 0;

        // compute and display values divisible by 5 and 6
        for (int i = 100; i <= 1000; i++) {
            if (i % 5 == 0 && i % 6 == 0){
                System.out.print(i + " ");
                counter++;
                if (counter % 10 == 0)
                    System.out.println();
            }
        }

        // exit program
        System.exit(0);
    }
}
