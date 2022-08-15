// Shawn Aviles 1/12/2021
import java.util.Scanner;

// this program is the connect four game
public class GroupLab8_20{
    public static void main (String[] args) {
        // create grid array
        String[][] grid = createPattern();
        boolean gameRunning = true;
        int turn = 0;
    
        printPattern(grid);
        while (gameRunning){
            if (turn % 2 == 0) dropRedPattern(grid);
            else dropYellowPattern(grid);
            turn++;
            printPattern(grid);

            // check if a player won
            if (checkWinner(grid) != "none") {
                if (checkWinner(grid) == "R") System.out.println("The red player won");
                else if (checkWinner(grid)== "Y") System.out.println("The yellow player won");
                gameRunning = false;
            }
        }

        // exit program
        System.exit(0);
    }
    

    // method creates the grid where the game will be made
    public static String[][] createPattern() {
        String[][] grid = new String[7][15];
    
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0;j < grid[i].length; j++) {
                if (j % 2 == 0) grid[i][j] ="|";
                else grid[i][j] = " ";
            if (i == 6) grid[i][j] = "-";
            }
        }
        return grid;
    }
  

    // method displays the grid
    public static void printPattern(String[][] grid){
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length;j++) {
                System.out.print(grid[i][j]);
            }
        System.out.println();
        }
    }
  

    // Red's Turn
    public static void dropRedPattern(String[][] grid) {
        System.out.print("Drop a red disk at column (0–6): ");
        Scanner input = new Scanner(System.in);

        //convert 1,2,3,4,5,6 into 1,3,5,7,9,11,13
        int col = 2 * input.nextInt() + 1;

        // determine the first empty row and use it
        for (int i = 5; i >= 0; i--) {
            if (grid[i][col] == " "){
                grid[i][col] = "R";
                break;
            }
        }
    }
  

    // Yellow's Turn
    public static void dropYellowPattern(String[][] grid) {
        System.out.print("Drop a yellow disk at column (0–6): ");
        Scanner input = new Scanner(System.in);

        //convert 1,2,3,4,5,6 into 1,3,5,7,9,11,13
        int col = 2 * input.nextInt() + 1;

        // determine the first empty row and use it
        for (int i = 5; i >= 0; i--) {
            if (grid[i][col] == " ") {
                grid[i][col] = "Y";
                break;
            }
        }
    }
  

    // determines whether or not a player won
    public static String checkWinner(String[][] g) {
    
        // check for horizontal line in each row
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j+=2) {
                if ((g[i][j+1] != " ")
                && (g[i][j+3] != " ")
                && (g[i][j+5] != " ")
                && (g[i][j+7] != " ")
                && ((g[i][j+1] == g[i][j+3])
                && (g[i][j+3] == g[i][j+5])
                && (g[i][j+5] == g[i][j+7])))
                    return g[i][j+1];  
            }
        }
        
        // check for vertical line in each column
        for (int i = 1; i < 15; i+=2) {
            for (int j = 0; j < 3; j++) {
                if((g[j][i] != " ")
                && (g[j+1][i] != " ")
                && (g[j+2][i] != " ")
                && (g[j+3][i] != " ")
                && ((g[j][i] == g[j+1][i])
                && (g[j+1][i] == g[j+2][i])
                && (g[j+2][i] == g[j+3][i])))
                    return g[j][i];  
            }  
        }
        
        // check for diagonal line with left up and right down
        // start at top 3 rows and then check left to right
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j < 9; j+=2) {
                if((g[i][j] != " ")
                && (g[i+1][j+2] != " ")
                && (g[i+2][j+4] != " ")
                && (g[i+3][j+6] != " ")
                && ((g[i][j] == g[i+1][j+2])
                && (g[i+1][j+2] == g[i+2][j+4])
                && (g[i+2][j+4] == g[i+3][j+6])))
                    return g[i][j];  
            }  
        }

        // check for diagonal line with left down and right up
        // start at top 3 rows and then check right to left
        for (int i = 0; i < 3; i++) {
            for (int j = 7; j < 15; j+=2) {
                if((g[i][j] != " ")
                && (g[i+1][j-2] != " ")
                && (g[i+2][j-4] != " ")
                && (g[i+3][j-6] != " ")
                && ((g[i][j] == g[i+1][j-2])
                && (g[i+1][j-2] == g[i+2][j-4])
                && (g[i+2][j-4] == g[i+3][j-6])))
                return g[i][j];  
            }  
        }

        return "none";
    }
}