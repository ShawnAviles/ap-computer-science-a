// Shawn Aviles 12/2/2020
import java.util.Scanner;

// this program displays the sum of all digits in an integer
public class lab6_2{
    public static void main(String args[]){
        // create a scanner object
        Scanner input = new Scanner(System.in);

        // prompt user for integer and close input
        System.out.print("Enter an integer: ");
        int num = input.nextInt();
        input.close();

        // execute and display method
        System.out.println(sumDigits(num));

        // exit program
        System.exit(0);
    }

    // this method computes the sum of the digits in an integer
    public static int sumDigits(long n){
        int sum = 0;
        int num = 0;
        while (n != 0){
            num = (int)n % 10;
            sum += num;
            n /= 10;
        }
        return sum;
    }
}