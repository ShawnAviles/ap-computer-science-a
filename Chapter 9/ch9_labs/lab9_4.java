// Shawn Aviles 2/7/2021
import java.util.Random;

// this program utilizes the random class to create object with seed 100 and display
// the first 50 random integers between & 100 using the nextInt(100) method
public class lab9_4 {
    public static void main (String args[]){
        // create random object with seed
        Random ran = new Random(100);

        // display first 50 random integers between 0 and 100
        for (int i = 0; i < 50; i++){
            System.out.println(ran.nextInt(100) + " ");
        }

        // exit program
        System.exit(0);
    }
}
