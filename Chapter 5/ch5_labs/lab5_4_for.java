// Shawn Aviles 11/20/2020

// this program displays a table converting miles to kilometers using a for loop
public class lab5_4_for {
    public static void main (String args[]){
        // display title of table
        System.out.printf("%-8s %-10s\n", "Miles", "Kilometers");

        // display table
        for (int miles = 1; miles <= 10; miles += 1){
            System.out.printf("%-8d %-10.3f\n", miles, miles * 1.609);
        }

        // exit program
        System.exit(0);
    }
}
