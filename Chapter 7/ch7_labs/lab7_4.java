// Shawn Aviles 1/6/2021
import java.util.Scanner;

/*
this program reads an unspecified number of scores and determines how many scores are above 
or equal to the average and how many scores are below the average
*/
public class lab7_4 {
    public static void main(String[] args) {
        // create a scanner object
        Scanner input = new Scanner(System.in); 

        // prompt user to enter scores and close input object
        int[] scores = new int[100];
        double sum = 0;
        int counter = 0;
        System.out.print("Enter the scores (Enter negative number to end list): ");
        int i = 0;
        while((scores[i] = input.nextInt()) >= 0) {
            sum += scores[i];
            counter++;
            i++;
        }
        input.close();

        // compute average & amount  larger and greater than average
        double average = sum / counter;
        int above = 0;
        int below = 0;
        for (int j = 0; j < counter; j++){
            if (scores[j] >= average) above++;
            else below++;
        }

        // display results and exit program
        System.out.println("Scores above or equal to average: " + above);
        System.out.println("Scores below average: " + below);
        System.exit(0);
    }
}
