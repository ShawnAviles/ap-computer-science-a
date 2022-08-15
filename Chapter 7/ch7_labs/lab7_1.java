// Shawn Aviles 1/6/2021
import java.util.Scanner;

/*
This program reads student scores, gets the best score, and then assigns grades following 
Grade is A if score is >= best - 10 
Grade is B if score is >= best - 20
Grade is C if score is >= best - 30
Grade is D if score is >= best - 40
Grade is F otherwise.
*/
public class lab7_1{
    public static void main (String[] args){
        // create scanner object\
        Scanner input =  new Scanner(System.in);

        // Prompt user for number of students, store each score in an array, close input object
        System.out.print("Enter the number of students: ");
        int students = input.nextInt();
        int[] scores = new int[students];
        System.out.print("Enter " + students + " scores: ");
        for (int i = 0; i < scores.length; i++){
            scores[i] = input.nextInt();
        }
        input.close(); 

        // determine max score of students
        int maxScore = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > maxScore)
                maxScore = scores[i];
        }

        // determine the grades for each score and display results
        String grade = "";
        for (int i = 0; i < scores.length; i++){
            if (scores[i] >= maxScore - 10){
                grade = "A";
            }
            else if (scores[i] >= maxScore - 20){
                grade = "B";
            }
            else if (scores[i] >= maxScore - 30){
                grade = "C";
            }
            else if (scores[i] >= maxScore - 40){
                grade = "D";
            }
            else{
                grade = "F";
            }
            System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grade);
            System.out.println(maxScore);
        }
        // exit program
        System.exit(0);
    }

}