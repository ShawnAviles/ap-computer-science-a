// Shawn Aviles 1/6/2021
import java.util.Scanner;

// this program finds the gcd of numbers
public class lab7_14_ExtraCredit {
    public static void main (String[] args){
        // create scanner object 
        Scanner input = new Scanner(System.in);

        // prompt user for 5 numbers and close input object
        System.out.print("Enter five numbers: ");
        int x1 = input.nextInt();
        int x2 = input.nextInt();
        int x3 = input.nextInt();
        int x4 = input.nextInt();
        int x5 = input.nextInt();
        System.out.println("The GCD of the five numbers listed: " + gcd(x1, x2, x3, x4, x5));
        input.close();

        // exit program
        System.exit(0);
    }

	public static int gcdTwo(int num1, int num2) { 
		if (num2 == 0) 
			return num1; 
        else
            return gcdTwo(num2, num1 % num2); 
	} 

	public static int gcd(int... array) { 
		int result = 0; 
		for (int element: array){ 
			result = gcdTwo(result, element); 
			if(result == 1) 
			    return 1; 
		} 
		return result; 
	} 
}
