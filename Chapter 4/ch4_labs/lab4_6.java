// Shawn Aviles 11/1/2020
import java.util.Random;

/*
This program generates three random points on a circle with a radius of 40 and computes 
three angles of the triangle formed by these three points
*/
public class lab4_6 {
    public static void main(String args[]){
        // Create Random Object
        Random rand = new Random();

        // Generate random points using angle from center (0,0):
        // Point A
        double angle1 = rand.nextDouble() * Math.PI * 2;
        double x1 = 40.0 * Math.cos(angle1);
        double y1 = 40.0 * Math.sin(angle1);
        // Point B
        double angle2 = rand.nextDouble() * Math.PI * 2;
        double x2 = 40.0 * Math.cos(angle2);
        double y2 = 40.0 * Math.sin(angle2);
        // Point C
        double angle3 = rand.nextDouble() * Math.PI * 2;
        double x3 = 40.0 * Math.cos(angle3);
        double y3 = 40.0 * Math.sin(angle3);

        // Calculate Side lengths:
        // Side from Point A to Point B
        double sideAB = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        // Side from Point B to Point C
        double sideBC = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        // Side from Point C to Point A
        double sideCA = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

        // Calculate Angle within triangle:
        double angleA = Math.toDegrees(Math.acos((sideAB * sideAB - sideBC * sideBC - sideCA * sideCA) / (-2 * sideBC * sideCA)));
        double angleB = Math.toDegrees(Math.acos((sideBC * sideBC - sideAB * sideAB - sideCA * sideCA) / (-2 * sideAB * sideCA)));
        double angleC = Math.toDegrees(Math.acos((sideCA * sideCA - sideBC * sideBC - sideAB * sideAB) / (-2 * sideAB * sideBC)));

        // Display rounded Results and exit program
        System.out.printf("Point A: (%.2f, %.2f)\nPoint B: (%.2f, %.2f)\nPoint C: (%.2f, %.2f)\n", x1, y1, x2, y2, x3, y3);
        System.out.println("Angle A: " + Math.round(angleA * 100)/ 100.0);
        System.out.println("Angle B: " + Math.round(angleB * 100)/ 100.0);
        System.out.println("Angle C: " + Math.round(angleC * 100)/ 100.0);
        System.exit(0);
    }
}
