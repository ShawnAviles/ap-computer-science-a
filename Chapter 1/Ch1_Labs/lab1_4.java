// Shawn Aviles 9/13/2020

public class lab1_4 {
    public static void main(String[] args) {
        System.out.printf("%1s %7s %5s\n", "a", "a^2", "a^3");              // print the table header
        int a = 1;                                                          // set the first value of table to start at 1
        while (a <= 4) {                                                    // while loop till a equals 4
            int aPower2 = a * a;
            int aPower3 = a * a * a;
            System.out.printf("%1d %5d %5d\n", a, aPower2, aPower3);        // print the values formatted in a line and go to next line
            a ++;                                                           // increase variable by 1 every loop
        }
    }
}

