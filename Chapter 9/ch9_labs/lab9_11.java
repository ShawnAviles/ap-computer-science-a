// Shawn Aviles 2/9/2021
import java.util.Scanner;

// this program utilizes a LinearEquation class to solve for the intersection point (x,y) of two linear equations
public class lab9_11 {
    public static void main(String[] args) {
        // create scanner object
        Scanner input = new Scanner(System.in);

        // prompt user for data and close input object
        System.out.print("For two linear equations in form \n ax + by = e\n cx + dy = f\nEnter a, b, c, d, e, & f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        input.close();
        
        // create LinearEquations object
        LinearEquation system = new LinearEquation(a, b, c, d, e, f);

        // display x and y unless unsolvable
        if (system.isSolvable()){
            System.out.println("Solution: \n X: " + system.getX() + "\n Y: " + system.getY());
        }
        else{
            System.out.println("The equation has no solution");
        }

        // exit program
        System.exit(0);
    }
}

class LinearEquation {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    /** construct with specified data fields */
    LinearEquation(double a, double b, double c, double d, double e, double f){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    /** getters */
    double getA() {
        return a;
    }
    double getB() {
        return b;
    }
    double getC() {
        return c;
    }
    double getD() {
        return d;
    }
    double getE() {
        return e;
    }
    double getF() {
        return f;
    }

    /** method returns true if the linear equation can be solved */
    boolean isSolvable() {
        if ((getA() * getD() - getB() * getC())!= 0){
            return true;
        }
        else {
            return false;
        }
    }

    /** method returns the x-value of intersection point for the system of linear equations */
    double getX(){
        return (getE()*getD() - getB()*getF()) / (getA()*getD() - getB()*getC());
    }

    /** method returns the y-value of intersection point for the system of linear equations */
    double getY(){
        return (getA()*getF() - getE()*getC()) / (getA()*getD() - getB()*getC());
    }
}
