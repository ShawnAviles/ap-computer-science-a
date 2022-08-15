// Shawn Aviles 11/20/2020

// this program displays a table converting kilograms to pounds
public class lab5_3 {
    public static void main (String args[]){
        // initialize variable - sentinel value 
        int kg = 1;

        // display title of table
        System.out.printf("%-10s %10s\n", "Kilograms", "Pounds");

        // display the table, conversion of kilograms to pounds: kilograms * 2.2 = pounds
        while (kg < 200){
            System.out.printf("%-10d %10.1f\n", kg, kg * 2.2);
            kg += 2;
        }

        // exit program
        System.exit(0);
    }
}