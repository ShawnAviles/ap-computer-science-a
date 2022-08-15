// Shawn Aviles 11/8/2020

// this program displays a random uppercase letter using the Math.random() method
public class lab4_16{
    public static void main(String args[]){
        // randomly assign a number ranging from 65-90 (A - Z ASCII values)
        char letter = (char) ((int) (Math.random() * 26) + 65);
        System.out.println(letter); 

        // exit program
        System.exit(0);
    }
}
