// Shawn Aviles 9/13/2020

public class lab1_6 {
    public static void main(String[] args){
        int i = 1;                  // set first integer to 1
        int sum = 0;                // set the sum to 0
        while (i <= 9) {            // while loop repeats till the integer is 9 
            sum += i;               // adds each integer to the sum of the previous   
            i ++;                   // increase integer by 1 each loop
        }
        System.out.println("1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 = " + sum);    // print sum
    }
}
