// Shawn Aviles 12/7/2020

// this program formats a number to have 0's filling in the space before it based of a specified width 
public class lab6_37 {
    public static void main(String args[]){
        // execute the method
        System.out.println(format(24,5));

        // exit program
        System.exit(0);
    }

    // The method returns a string for the number with one or more prefix 0s. The size of the string is the width
    public static String format(int number, int width){
        String numberS = "" + number;
        if (numberS.length() >= width)
            return numberS;
        else {
            String zeroes = "";
            for (int i = 0; i < width - numberS.length(); i++){
                zeroes += "0";
            }
            return zeroes + numberS;
        }

    }
}
