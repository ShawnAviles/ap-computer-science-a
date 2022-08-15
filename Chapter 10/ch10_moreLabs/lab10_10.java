// Shawn Aviles 3/21/2021

// program tests the Queue class
public class lab10_10 {
    public static void main(String[] args) {
        // create queue object
        Queue q = new Queue();

        // adds 20 numbers from 1-20 into queue
        for (int i = 1; i < 21; i ++){
            q.enqueue(i);
        }

        // remove numbers, display, and exit program
        while(!q.empty()){
            System.out.print(q.dequeue());
        }
        System.exit(0);
    }
}
