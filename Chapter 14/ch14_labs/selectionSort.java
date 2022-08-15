// Shawn Aviles 5/12/2021

// program tests selectionSort method
public class selectionSort {
    public static void main(String[] args) {
        // create integer array
        int[] list = {8, 12, 6, 19, 28, 4, 14};

        // run method and exit program
        selSort(list);      
        System.exit(0);  
    }

    // method finds the smallest element in array of integers and displays results
    public static void selSort(int[] array){
        int minValue = 0;
        int minIndex = 0;
        int temp = 0;

	    // selection sort 
        for(int i = 0; i < array.length; i++){
            minValue = array[i];
            minIndex = i;
            for(int j = i; j < array.length; j++){
                if (array[j] < minValue){
                    minValue = array[j];
                    minIndex = j;
                }
            }
            if (minValue < array[i]){
                temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
	    // displays result, first element of array after selection sort
        System.out.println("\nMinimum Integer: " + array[0]);
    }
}
