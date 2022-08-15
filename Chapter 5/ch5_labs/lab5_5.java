// Shawn Aviles 11/22/2020

// this program displays two conversion tables of kilograms to pounds and pounds to kilograms side by side
public class lab5_5{
    public static void main(String args[]){
        // initialize variables - sentinel values
        int kg1 = 1;
        int lb2 = 20;

        // create title 
        System.out.printf("%-10s %10s    |     %-10s %10s\n", "Kilograms", "Pounds", "Pounds", "Kilograms");

        // display table
        do {
            System.out.printf("%-10d %10.1f    |     %-10d %10.2f\n", kg1, kg1*2.2, lb2, lb2/2.2);
            kg1 += 2;
            lb2 += 5;
        } while (kg1 < 200 && lb2 < 520);
    
        // exit program
        System.exit(0);
    }
}