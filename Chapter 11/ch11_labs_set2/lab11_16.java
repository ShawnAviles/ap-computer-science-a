// Shawn Aviles 4/22/2021
import java.util.Scanner;
import java.util.ArrayList;

// program rewrites listing 5.1 to alert user if an answer is repeated
public class lab11_16 {
    public static void main(String[] args) {
        // generate 2 random numbers
        int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);

		// create scanner object and an ArrayList
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> answers = new ArrayList<Integer>();

        // display question and prompt for answer
		System.out.print("What is " + number1 + " + " + number2 + "? ");
		int answer = input.nextInt();

        // analyze solution entered by user and close scanner object
		while (number1 + number2 != answer) {
			if (answers.contains(answer)) System.out.println("You already entered " + answer);
			else {
				System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
				answers.add(answer);
			}
			answer = input.nextInt();
		}
		System.out.println("You got it!");
        input.close();

        // exit program
        System.exit(0);
    }
}
