// Shawn Aviles 1/14/2021

// this program answers the locker puzzle
public class lab7_23 {
    public static void main (String[] args){
        boolean[] lockers = new boolean[100];
        lockerPuzzle(lockers);

        // display results and exit program
        for (int i = 0; i < lockers.length; i++){
            if (lockers[i]) System.out.print("L" + (i + 1) + " ");
        }
        System.exit(0);
    }

    /*locker puzzle
    Then the second student begins with the second locker and closes every other locker
    Student 3 begins with the third locker and changes every third locker (closes it if it was open, and opens it if it was closed)
    Student 4 begins with locker L4 and changes every fourth locker
    Student S starts with L5 and changes every fifth locker, and so on, until student S100 changes L100
    */
    public static void lockerPuzzle(boolean[] lockers){
        // student 0
        java.util.Arrays.fill(lockers, true);
        
        // student 1-99
        for (int student = 1; student < lockers.length; student++){
            int temp = student + 1;
            lockers[student] = !lockers[student];

            for (int j = student + temp; j < lockers.length; j += temp){
                lockers[j] = !lockers[j];
            }
        }
    }
}
