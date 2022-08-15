// Shawn Aviles 10/22/2020
import java.util.Scanner;

// this program determines whether an entered three digit number is a palindrome
public class lab3_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt user for three digit integer then closes input
        System.out.print("Enter a three digit integer: ");
        int original = input.nextInt();
        int reversed = 0;
        input.close();

        // Original Digits
        int originalOnesPlace = original % 10;
        int originalTensPlace = (original % 100) - originalOnesPlace;
        
        // Reversed Digits
        int reversedHundredsPlace = originalOnesPlace * 100;
        int reversedOnesPlace = (original - originalTensPlace - originalOnesPlace) / 100;

        // Reversed Number
        reversed = reversedHundredsPlace + originalTensPlace + reversedOnesPlace;

        // determine whether number is a palindrome and if it is three digits
        if (original > -1000 && original < 1000) {
            if (original == reversed){
                System.out.println(original + " is a palindrome"); 
            }
            else {
                System.out.println(original + " is not a palindrome");
            }
        }
        else{
            System.out.println("The number you entered isn't three digits");
        }
    }
}
