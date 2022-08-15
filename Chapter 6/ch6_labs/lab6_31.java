// Shawn Aviles
import java.util.Scanner;

// this program determines if a credit card number is valid or not
public class lab6_31 {
    public static void main (String args[]){
        // create scanner object 
        Scanner input = new Scanner(System.in);

        // prompt user for credit card number
        System.out.println("Enter a credit card number as a long integer");
        long cardNumber = input.nextLong();
        input.close();

        // display if the number is valid and exit program
        String validityOverall = isValid(cardNumber) ? "valid": "invalid";
        System.out.println(cardNumber + " is " + validityOverall);
        System.exit(0);
    }

    // Return true if the card number is valid
    public static boolean isValid(long number){
        boolean validSize = getSize(number) >= 13 && getSize(number) <= 16;
        boolean validPrefix = prefixMatched(number, 4) || prefixMatched(number, 5) || prefixMatched(number, 6) || prefixMatched(number, 36);
        boolean luhnCheck = (sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0;

        if (validSize && validPrefix & luhnCheck)
            return true;
        else 
            return false;
        
    }
    // Get the result from Step 2 
    public static int sumOfDoubleEvenPlace(long number){   
        int sum = 0;
        String num = "" + number;
        for (int i = 0; i < num.length(); i += 2){
            String digit = "" + num.charAt(i);
            int evenDoubled = Integer.parseInt(digit) * 2;
            sum += getDigit(evenDoubled);
        }
        return sum;
    }

    // Return this number if it is a single digit, else return the sum of the two
    public static int getDigit(int number){
        int sum = 0;
        if (number < 10)
            return number;
        else {
            sum += number % 10;
            number /= 10;
            sum += number;
            return sum;
        }
    }

    // Return sum of odd-place digits in number
    public static int sumOfOddPlace(long number){
        int sum = 0;
        String num = "" + number;
        for (int i = 1; i < num.length(); i += 2){
            String digit = "" + num.charAt(i);
            int odd = Integer.parseInt(digit);
                sum += odd;
        }
        return sum;
    }

    // Return true if the number d is a prefix for number
    public static boolean prefixMatched(long number, int d){
        String lengthOfD = "" + d;
        if (d == getPrefix(number, lengthOfD.length()))
            return true;
        else
            return false;
    }

    // Return the number of digits in d 
    public static int getSize(long d){
        String num = "" + d;
        return num.length();
    }

    /** Return the first k number of digits from number. If the
    number of digits in number is less than k, return number. */
    public static long getPrefix(long number, int k){
        String num = "" + number;
        String kDigits = "";

        // make sure the number of digits in number is greater than k to continue
        if (num.length() < k)
            return number;

        // determine the first k digits in number 
        for (int i=0; i < k; i++){
            kDigits += num.charAt(i);
        }

        return Integer.parseInt(kDigits);
    }
}
