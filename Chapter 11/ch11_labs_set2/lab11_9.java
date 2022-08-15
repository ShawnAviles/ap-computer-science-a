// Shawn Aviles 4/22/2021
import java.util.ArrayList;
import java.util.Scanner;

// program randomly fills 0s & 1s into an n-by-n matrix, then displays matrix 
// and finds index of row and column with the most 1s
public class lab11_9{
    public static void main(String[] args) {
        // create scanner object
        Scanner input = new Scanner(System.in);

        // prompt user to enter array size, and close scanner object
        System.out.print("Enter the array size n: ");
        int n = input.nextInt();
        input.close();

        // create matrix n by n, fill it with 1s & 0s
        int[][] matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int)(Math.random() * 2);
			}
		}

        // display matrix, results, and exit program
        print(matrix);
        System.out.print("The largest row index: ");
		print(largestRow(matrix));
		System.out.print("The largest column index: ");
		print(largestColumn(matrix));
        System.exit(0);
    }

    // method prints an array 
    public static void print(ArrayList<Integer> a) {
		for (int i = 0; i < a.size(); i++) {
			System.out.print(a.get(i) + " ");
		}
		System.out.println();
	}

    // method prints the matrix
    public static void print(int[][] m) {
		System.out.println("The random array is ");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j]);
			}
			System.out.println();
		}
	}

    // method returns the max integer in array
	public static int max(int[] b) {
		int max = b[0];
		for (int i = 0; i < b.length; i++) {
			if (b[i] > max) max = b[i];
		}
		return max;
	}

	// method adds the indices of x in count to the list
	public static void getIndex(ArrayList<Integer> list, int[] count, int x) {
		for (int i = 0; i < count.length; i++) {
			if (count[i] == x) list.add(i);
		}
	}

    // method returns a list of column indices with most 1s */
	public static ArrayList<Integer> largestColumn(int[][] a) {
		ArrayList<Integer> index = new ArrayList<Integer>();
		int[] count = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] == 1)
					count[j]++;
			}
		}
		int max = max(count);
		getIndex(index, count, max);
		return index;
	}

	// method returns list of row indices with most 1s */
	public static ArrayList<Integer> largestRow(int[][] a) {
		ArrayList<Integer> index = new ArrayList<Integer>();
		int[] count = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[j][i] == 1)
					count[j]++;
			}
		}
		int max = max(count);
		getIndex(index, count, max);
		return index;
	} 
}