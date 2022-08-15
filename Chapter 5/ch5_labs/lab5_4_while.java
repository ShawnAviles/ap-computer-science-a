// Shawn Aviles 11/20/2020

// this program displays a table converting miles to kilometers using a while loop
public class lab5_4_while {
    public static void main (String args[]){
        // initialize variable - sentinel value 
        int miles = 1;

        // display title of table
        System.out.printf("%-8s %-10s\n", "Miles", "Kilometers");

        // display the table
        while (miles <= 10){
            System.out.printf("%-8d %-10.3f\n", miles, miles * 1.609);
            miles += 1;
        }

        // exit program
        System.exit(0);
    }
}
