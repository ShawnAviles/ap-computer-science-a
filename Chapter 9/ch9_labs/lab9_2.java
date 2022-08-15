// Shawn Aviles 2/5/2021

// this program utilizes a Stock class to display the percent change in its price
public class lab9_2 {
    public static void main(String[] args){
        // create stock object and initialize variables
        Stock oracle = new Stock("ORCL", "Oracle Corporation");
        oracle.setPreviousClosingPrice(34.50);
        oracle.setCurrentPrice(34.35);

        //display results and exit program
        double percent = Math.round(oracle.getChangePercent() * 100.0) / 100.0;
        System.out.println("The percent change in " + oracle.name + " is " + percent + "%");
        System.exit(0);
    }
}


class Stock{
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    /* construct Stock object with specified symbol and name */
    Stock(String newSymbol, String newName){
        symbol = newSymbol;
        name = newName;
    }

    /* setter method sets the previous closing price */
    void setPreviousClosingPrice(double newPreviousClosingPrice){
        previousClosingPrice = newPreviousClosingPrice;
    }

    /* setter method sets the current price */
    void setCurrentPrice(double newCurrentPrice){
        currentPrice = newCurrentPrice;
    }

    /* method returns the percentage change of previous closing price to current price */
    double getChangePercent(){
        return (currentPrice - previousClosingPrice) / previousClosingPrice * 100;
    }
}