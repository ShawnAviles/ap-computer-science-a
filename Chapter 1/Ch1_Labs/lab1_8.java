// Shawn Aviles 9/13/2020

public class lab1_8 {
    public static void main(String[] args){
        double r = 5.5;                                     // variable for radius 
        double perimeter =  2.0 * r * Math.PI;              // solve perimter, pi value comes from the Math Class already in java
        double area = r * r * Math.PI;                      // solve for area
        System.out.println("perimeter = " + perimeter);     // print perimeter with decimals, data type is double
        System.out.println("area = " + area);               // print area with decimals, data type is double
    }
}
