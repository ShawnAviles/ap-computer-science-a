// Shawn Aviles 11/11/2020

// this program randomly generates a vehicle plate number, three uppercase letters followed by four digits
public class lab4_25 {
    public static void main(String args[]){
        // randomly generate 4 upper case letter by using random A-Z ASCII values ranging from 65-90
        char letter1 = (char) ((int) (Math.random() * 26) + 65);
        char letter2 = (char) ((int) (Math.random() * 26) + 65);
        char letter3 = (char) ((int) (Math.random() * 26) + 65);

        // randomly assign
        int digit1 = (int)(Math.random() * 10);
        int digit2 = (int)(Math.random() * 10);
        int digit3 = (int)(Math.random() * 10);
        int digit4 = (int)(Math.random() * 10);

        // concatenate the string, display results, and exit program
        System.out.println("" + letter1 + letter2 + letter3 + digit1 + digit2 + digit3 + digit4);
        System.exit(0);
    }
}
