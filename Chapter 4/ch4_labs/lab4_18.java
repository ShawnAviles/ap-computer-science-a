// Shawn Aviles 11/9/2020
import java.util.Scanner;

// this program prompts user to enter two characters and display their major and status as a result
public class lab4_18 {
    public static void main (String args[]){
        // create a scanner object
        Scanner input = new Scanner(System.in);

        // prompt user to enter two characters for major and status, close input
        System.out.print("Enter two characters: ");
        String response = input.nextLine();
        char majorShort = Character.toUpperCase(response.charAt(0));
        char statusShort = response.charAt(1);
        input.close();
        
        // determine if inputs are valid
        boolean isValidMajor = majorShort == 'M' || majorShort == 'C' || majorShort == 'D';
        boolean isValidStatus = statusShort == '1' || statusShort == '2' || statusShort == '3' || statusShort == '4';
        if (!(isValidMajor && isValidStatus)){
            System.out.println("Invalid input");
            System.exit(0);
        }

        // Assign the value of major and status based upon the input
        String major = " ";
        String status = " ";

        switch (majorShort){
            case 'M': major = "Mathematics ";
                break;
            case 'C': major = "Computer Science ";
                break;
            case 'D': major = "Information Technology ";
                break;
        }
        switch (statusShort){
            case '1': status = "Freshman";
                break;
            case '2': status = "Sophomore";
                break;
            case '3': status = "Junior";
                break;
            case '4': status = "Senior";
        }

        // display results and exit program
        System.out.println(major + status);
        System.exit(1);
    }
}
