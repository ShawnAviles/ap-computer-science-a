// Shawn Aviles 3/21/2021
import java.math.BigInteger;
// program finds the first ten square numbers that are greater than Long.MAX_VALUE
public class lab10_17{
    public static void main(String[] args) {
        // create BigInteger object
        BigInteger i = new BigInteger(Long.MAX_VALUE + "");
        BigInteger end = i.add(new BigInteger("10"));

        // display results and exit program
        for (i = new BigInteger(Long.MAX_VALUE + ""); i.compareTo(end) <= 0; 
            i = i.add(new BigInteger("1"))){
            System.out.println(i.multiply(i));
        }
        System.exit(0);
    }
}