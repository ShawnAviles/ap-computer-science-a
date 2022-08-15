// Shawn Aviles 3/21/2021
import java.math.BigInteger;

// program finds the first ten numbers greater than Long.MAX_VALUE that are divisible by 5 or 6
public class lab10_21 {
    public static void main(String[] args) {
        int count = 0;
        
        // create BigInteger object
        BigInteger num = new BigInteger(Long.MAX_VALUE + "");
        BigInteger zero = new BigInteger("0");

        // determine if numbers are divisible by 5 or 6
        while (count < 10){
            boolean divFive = zero.compareTo(num.remainder(new BigInteger("5"))) == 0;
            boolean divSix = zero.compareTo(num.remainder(new BigInteger("6"))) == 0;
            if (divFive || divSix){
                System.out.println(num);
                count++;
            }
            num = num.add(new BigInteger("1"));
        }
        System.exit(0);
    }
}
