// Shawn Aviles 2/5/2021
import java.util.Date;

// this program utilizes the Date class to set its elapsed time from
// 1e+4 to 1e+11 (times 10 for each interval) displaying Date & Time respectively
public class lab9_3 {
    public static void main (String[] args){
        // create Date Object
        Date time = new Date();

        // display results and exit program
        for (long i = 10000; i <= 100000000000.0; i *= 10){
            time.setTime(i);
            System.out.println(time.toString());
        }
        System.exit(0);
    }
}


