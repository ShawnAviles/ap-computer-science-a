// Shawn Aviles 9/30/2020
// this program displays the current time GMT offset to what the user inputs 
import java.util.Scanner;

public class lab2_8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        // compute the current time (GMT), similar to 2.7 in the textbook
        long milliSeconds = System.currentTimeMillis();
        long totalSeconds = milliSeconds / 1000;
        long totalMinutes = totalSeconds / 60;
        long currentSeconds = totalSeconds % 60;
        long currentMinutes = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHours = totalHours % 24;

        // prompt user for offset and adjust time as a result
        System.out.print("Enter the timezone offset to GMT: ");
        int offset = input.nextInt();
        currentHours += offset;

        // display results and close input
        System.out.println("The current time is " + currentHours + ":" + currentMinutes + ":" + currentSeconds);
        input.close();
    }
}
