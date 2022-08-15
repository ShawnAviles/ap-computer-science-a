// Shawn Aviles 5/11/2021

// tests the recursive reverse method
public class recursion{
    public static void main(String[] args) {
        // iniitalize integer to be reversed
        int number = 1234567890;

        // run method for results
        reverse(number);

        // exit program
        System.exit(0);
    }

    // recursive method outputs its integer parameter in reverse order
    public static void reverse(int number) {
        if (number / 10 == 0) {
            System.out.print(number);
        }
        else {
            System.out.print(number % 10);
            reverse(number/10);
        }
    }
}