// Shawn Aviles 11/22/2020
import java.util.Scanner;

// this program prompts user to enter the number of students and their names and scores
// and displays the name of the student with the highest score
public class lab5_8 {
    public static void main(String args[]){
        // create a scanner object
        Scanner input = new Scanner(System.in);

        // prompt user for amount of students
        System.out.print("How many students participated?: ");
        int students = input.nextInt();

        // initialize variables to record and prompt user for student's name and score
        double highest = 0;
        String highestName = "";
        for (int i = 1; i <= students; i++){
            System.out.print("\nStudent " + i + ") \nFirst and last name (i.e: John Doe): ");
            String firstName = input.next();
            String lastName = input.next();

            System.out.print("Score: ");
            int score = input.nextInt();

            // determine the highest score and capitalize names
            if (score > highest){
                highest = score;
                String firstNameCap = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
                String lastNameCap = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
                highestName = firstNameCap +" "+ lastNameCap;
            }
        }

        // display results, close scanner object and exit program
        System.out.println("\n" + highestName + " had the highest score!");
        input.close();
        System.exit(0);
    }
}
