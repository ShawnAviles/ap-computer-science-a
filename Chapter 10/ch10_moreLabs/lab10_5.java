// Shawn Aviles 3/21/2021
import java.util.Scanner;

// program prompts user for a positive integer and displays its smallest factors
public class lab10_5{
    public static void main(String[] args) {
        // create scanner object
        Scanner input = new Scanner(System.in);

        // prompt user for positive integer
        System.out.print("Enter positive integer: ");
        int num = input.nextInt();
        input.close();

        // displays the number's smallest factors in decreasing order
		System.out.print("Smallest factors of " + num + ": ");
		StackOfIntegers factorStack = new StackOfIntegers(); // Create a StackOfIntegers
		smallestFactors(num, factorStack);

		while (!factorStack.empty()) {
			System.out.print(factorStack.pop() + " ");
		}
		System.out.println();

        // exit program
        System.exit(0);
	}

	/** compute the smallest factors and push them to StackOfIntegers */
	public static void smallestFactors(int num, StackOfIntegers factorStack) {
		int var = 2;
		while (num / var!= 1){ 
			if (num % var== 0) {
				factorStack.push(var);
				num /= var;
			}
			else var++;
		}
		factorStack.push(num);
	}
}
