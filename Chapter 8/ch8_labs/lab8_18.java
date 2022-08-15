// Shawn Aviles 1/15/2021

// this program shuffles rows in a two-dimensional array
public class lab8_18{
    public static void main(String[] args){
        // create two-dimensional array
        int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};

        // Display results and exit program
        shuffle(m);
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.exit(0);
    }

    // this method shuffles the rows in a two dimensional array
    public static void shuffle(int[][] m){
        int[] temp = new int[2];

        for (int i = 0; i < m.length; i ++){
            int randomRow = (int)(Math.random() * m.length);

            temp[0] = m[i][0];
            temp[1] = m[i][1];
            m[i][0] = m[randomRow][0];
            m[i][1] = m[randomRow][1];
            m[randomRow][0] = temp[0];
            m[randomRow][1] = temp[1];
        }
    }
}