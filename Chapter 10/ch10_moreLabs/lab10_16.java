// Shawn Aviles 3/21/2021
import java.math.BigInteger;

// programs finds the first ten numbers with 50 decimal digits that are divisible by 2 or 3
public class lab10_16{
    public static void main(String[] args) {
        // create BigInteger object
        int count = 0;
        BigInteger num1 = new BigInteger("10000000000000000000000000000000000000000000000000");
        BigInteger num2 = new BigInteger("0");

        // determine if numbers are divisible by 2 or 3
        while (count < 10){
            boolean divTwo = num2.compareTo(num1.remainder(new BigInteger("2"))) == 0;
            boolean divThree = num2.compareTo(num1.remainder(new BigInteger("3"))) == 0;
            if (divTwo || divThree){
                System.out.println(num1);
                count++;
            }
            num1 = num1.add(new BigInteger("1"));
        }
        
        // exit program
        System.exit(0);
    }
}