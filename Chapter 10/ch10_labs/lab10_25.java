// Shawn Aviles 2/20/2021

// this program utilizes a split method to return a splitted String array with its delimiters
public class lab10_25 {
    public static void main(String[] args) {
        // create two test arrays 
        String[] test1 = split("ab#12#453", "#");
        String[] test2 = split("a?b?gf#e", "[?#]");

        // display results and exit program
        printArray(test1);
        printArray(test2);
        System.exit(0);
    }

    // this method returns a String array with the delimiters 
    public static String[] split(String s, String regex){
        String[] temp = s.split(regex);
        String[] result = new String[temp.length * 2 -1];
        
        if (regex.length() < 1){
            return temp;
        }
        else {
            int indexRegex = 0;
            String regexValue;
            for (int i = 0, j = 0; i < result.length; i++){
                if (i % 2 == 0) {
                    result[i] = temp[j];
                    indexRegex += temp[j].length();
                    j++;
                }
                if (i % 2 == 1) {
                    regexValue = String.valueOf(s.charAt(indexRegex));
                    result[i] = regexValue;
                    indexRegex++;
                }
            }
            return result;
        }
    }

    // method displays arrays
    public static void printArray(String[] test){
        for (int i =0; i < test.length; i++){
            System.out.print(test[i] + " ");
        }
        System.out.println();
    }
}