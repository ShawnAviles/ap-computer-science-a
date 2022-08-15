// Shawn Aviles 1/7/2021

// this program returns a random number between 1 and 54, excluding the numbers passed in the argument
public class lab7_13 {
    public static void main(String[] args){
        // test method
        int test = getRandom(10, 20, 30, 40, 50);
        System.out.println(test);
    }

    // returns a random integer from 1-54 excluding the numbers passed
    public static int getRandom(int... numbers){
        if (numbers.length == 0) {
            System.out.println("No argument passed"); 
            return -1;
        }
        int random = (int)(Math.random() * 54) + 1;
        while (linearSearch(numbers, random) != -1) {
            random = (int)(Math.random() * 54) + 1;
        }
        return random;
    }

    // method searches array sequentially for a key and returns the index where it is
    public static int linearSearch(int[] list, int key){
        for (int i = 0; i < list.length; i++) {
            if (key == list[i])
                return i;
        }
        return -1;
    }
}
