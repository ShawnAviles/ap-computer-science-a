// Shawn Aviles 11/22/2020
import java.util.Scanner;

// this program generates 10 random addition questions for two integers between 1 and 15.
// it also displays the time to finish and how many answers were right
public class lab5_2{
    public static void main(String args[]){
        // create scanner object
        Scanner input = new Scanner(System.in);

        // initialize variables
        final int TOTAL_QUESTIONS = 10;
        int correct = 0;
        int counter = 0;
        long startTime = System.currentTimeMillis();
        String output = "";

        // ask user 10 addition questions
        while (counter < TOTAL_QUESTIONS){
            // generate two random integers from 1-15
            int num1 = (int)(Math.random() * 15 + 1);
            int num2 = (int)(Math.random() * 15 + 1);

            // prompt user to answer addition problem
            System.out.print("What is " + num1 + " + " + num2 + "? ");
            int answer = input.nextInt();

            // determine if answer is correct and display result
            if (num1 + num2 == answer) {
                System.out.println("You are correct!\n"); 
                correct++;
            }
            else {
                System.out.println("Your answer is wrong.\n" + num1 + " + " + num2 + " should be " + (num1 + num2) + "\n");
            }
            counter++;
            output += "\n" + num1 + "+" + num2 + "=" + answer + ((num1 + num2 == answer) ? " correct" : " wrong");
        }
        // close scanner object and compute time to answer the 10 questions
        input.close();
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;

        // display results and exit program
        System.out.println("You got " + correct + " questions right. \nTest time is " + testTime/1000 + " seconds\n" + output);
        System.exit(0);
    }
}