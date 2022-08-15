// Shawn Aviles 12/4/2020

public class lab6_12 {
    // execute method
    public static void main(String args[]){
        printChars('1', 'a', 10);
    }

    // display characters between ch1 and ch2 with specified characters per line
    public static void printChars(char ch1, char ch2, int numberPerLine){
        // for the columns
        while (ch1 < ch2){
            // for the rows
            for (int i = 0; i < numberPerLine; i++, ch1++){
                System.out.print(ch1 + " ");
                if (ch1 == ch2)
                    break;
            }
        System.out.println();
        }
    }
}
