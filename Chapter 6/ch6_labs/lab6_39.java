// Shawn Aviles
import java.util.Scanner;

// this program prompts the user to enter the three points for p0, p1, and p2 
// and displays whether p2 is on the left of the line from p0 to p1, right, the same line, or on the line segment
public class lab6_39 {
    public static void main(String args[]){
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // prompt user for points and close scanner object
        System.out.println("Enter three points for p0, p1, and p2: ");
        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        input.close();

        // organize values into coordinates
        String p0 = "(" + x0 + ", " + y0 + ")";
        String p1 = "(" + x1 + ", " + y1 + ")";
        String p2 = "(" + x2 + ", " + y2 + ")";

        // display result
        if (leftOfTheLine(x0, y0, x1, y1, x2, y2)) 
            System.out.println(p2 + " is on the left side of the line from " + p0 + " to " + p1);
        else if (onTheLineSegment(x0, y0, x1, y1, x2, y2))
            System.out.println(p2 + " is on the line segment from " + p0 + " to " + p1);
        else if (onTheSameLine(x0, y0, x1, y1, x2, y2))
            System.out.println(p2 + " is on the same line from " + p0 + " to " + p1);
        else
            System.out.println(p2 + " is on the right side of the line from " + p0 + " to " + p1);
          
        // Exit program
        System.exit(0);
    }

    //Return true if point (x2, y2) is on the left side of the directed line from (x0, y0) to (x1, y1)
    public static boolean leftOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2){
        double condition = (x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0);
        if (condition > 0)
            return true;
        else 
            return false;
    }

    // Return true if point (x2, y2) is on the same line from (x0, y0) to (x1, y1)
    public static boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2){
        double condition = (x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0);
        if (condition == 0)
            return true;
        else 
            return false;
    }

    // Return true if point (x2, y2) is on the line segment from (x0, y0) to (x1, y1) 
    public static boolean onTheLineSegment(double x0, double y0, double x1, double y1, double x2, double y2){
        boolean sameLine = onTheSameLine(x0, y0, x1, y1, x2, y2);
        boolean betweenX = (x2 < x0 && x2 > x1) || (x2 < x1 && x2 > x0);
        boolean betweenY = (y2 < y0 && y2 > y1) || (y2 < y1 && y2 > y0);

        if (sameLine && betweenX && betweenY)
            return true;
        else
            return false;
    }
}
