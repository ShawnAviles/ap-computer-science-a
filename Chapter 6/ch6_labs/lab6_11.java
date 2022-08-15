// Shawn Aviles

// display table of the commissions earned for sales amounts
public class lab6_11 {
    public static void main(String args[]){
        // display table header
        System.out.printf("%-16s %-16s\n", "Sales Amount", "Commission");

        // display table contents
        for (int sales = 10000; sales < 100001; sales += 5000){
            System.out.printf("%-16d %8.1f\n", sales, computeCommision(sales));
        }

        // exit program
        System.exit(0);
    }

    /*
    computes the commission of the sales using the graduating rates
    sales amount                    Commission Rate
    $0.01 - $5000                   8%
    $5000.01 - $10000               10%
    $10000.01 and above             12%
    */
    public static double computeCommision(double salesAmount){
        double commission = 0;
        
        // make sure sales is positive
        if (salesAmount <= 0){
            return 0;
        }

        // determine commission using graduated rate
        if (salesAmount >= 10000.01){
            commission += 5000 * 0.08;
            commission += 5000 * 0.1;
            commission += (salesAmount - 10000) * 0.12;
        }
        else if (salesAmount >= 5000.01){
            commission += 5000 * 0.08;
            commission += (salesAmount - 5000) * 0.1;
        }
        else if (salesAmount <= 0.01){
            commission += salesAmount * 0.08;
        }
        else {
            commission += salesAmount;
        }
        return commission;
    }
}
