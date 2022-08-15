public class Queue {
    private int[] elements;
    private int size;
    public static final int CAPACITY = 8;

    /** default constructor */
    Queue(){
        elements = new int[CAPACITY];
    }

    /** method adds an element into the queue */
    public void enqueue(int v){
        if (size >= elements.length){
            int[] newList = new int[elements.length * 2];
            System.arraycopy(elements, 0, newList, 0, elements.length);
            elements = newList;
        }
        elements[size++] = v;
    }

    /** method removes and returns the element from the queue */
    public int dequeue(){
        int temp = elements[0];
        int[] newList = new int[elements.length * 2];
        System.arraycopy(elements, 1, newList, 0, size);
        elements = newList;
        size--;
        return temp;
    }

    /** method returns true if the queue is empty */
    public boolean empty(){
        return (size == 0);
    }

    /** method returns the size of the queue */
    public int getSize(){
        return size;
    }
}
