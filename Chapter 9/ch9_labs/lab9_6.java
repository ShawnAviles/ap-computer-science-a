// Shawn Aviles 2/8/2021

// this program utilizes a StopWatch class to time how long a selection sort of 100000 integers would take
public class lab9_6 {
    public static void main (String[] agrs){
        // create stopwatch class
        StopWatch timer = new StopWatch();

        // create array to sort
        int[] sort = new int[100000];
        for (int i = 0; i < sort.length; i++){
            sort[i] = (int)(Math.random() * 100000);
        }

        // timing the selection sort
        timer.start();
        selectionSort(sort);
        timer.stop();

        //display results and exit program
        System.out.println("The selection sort took " + timer.getElapsedTime() + " milliseconds");
        System.exit(0);
    }

    public static void selectionSort(int[] list){
        for (int i = 0; i < list.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < list.length; j++){
                if (list[j] < list[minIndex]) minIndex = j;
            }
            int temp = list[minIndex];
            list[minIndex] = list[i];
            list[i] = temp;
        }
    }
}

class StopWatch{
    private double startTime;
    private double endTime;

    /* getters/ accessors */
    double getStartTime(){
        return startTime;
    }

    double getEndTime(){
        return endTime;
    }

    /* construct default object with current time as StartTime */
    StopWatch(){
        startTime = System.currentTimeMillis();
    }

    /* method resets the start time to the current time */
    void start(){
        startTime = System.currentTimeMillis();
    }

    /* method sets the end time to the current time */
    void stop(){
        endTime = System.currentTimeMillis();
    }

    /* method returns the elapsed time in milliseconds */
    double getElapsedTime(){
        return endTime - startTime;
    }

}
