// Shawn Aviles 3/21/2021
import java.math.BigDecimal;
import java.math.RoundingMode;

// program approximates e using a series, displays approximations to different ending values 100, 200,... 1000
public class lab10_20 {
    public static void main(String[] args) {
        // create BigDecimal object
        BigDecimal end1 = new BigDecimal("100");
        BigDecimal end2 = new BigDecimal("1000");

        // display results and exit program
        System.out.println("Approximation of e for i = 100 to 1000:");
        for (BigDecimal i = end1; i.compareTo(end2) <= 0; i = i.add(end1)) {
			System.out.println(approximateE(i));
        }
        System.exit(0);
    }

    /** method returns e value */
	public static BigDecimal approximateE(BigDecimal end) {
        BigDecimal one = new BigDecimal("1");
        BigDecimal e = new BigDecimal("0.0");

        // solve series for e
        for (BigDecimal i = one; i.compareTo(end) <= 0; i = i.add(one)) {
		    // factorial
            BigDecimal denominator = i;
            for (BigDecimal j = i.subtract(one); j.compareTo(one) >= 1; j = j.subtract(one)) {
                denominator = denominator.multiply(j);
			}
			// comptutation with 25 digits of precision
			e = e.add(one.divide(denominator, 25, RoundingMode.CEILING));  
		}
		return e;
	}
}
