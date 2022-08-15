// Shawn Aviles 3/21/2021

// program tests the MyRectangle2D class
public class lab10_13 {
    public static void main(String[] args) {
        // create MyRectangle2D object
        MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9);

        // display r1 area, perimeter, contains(3,3), and overlaps(3,5,2.3,5.4)
        String result  = "Rectangle:" + 
        "\nArea: " + r1.getArea() + 
        "\nPerimeter: " + r1.getPerimeter() + 
        "\nContains (3,3)?: " + r1.contains(3,3) + 
        "\nContains Rectangle centered on (4,5) with a width of 10.5 & height of 3.2?: " + 
        r1.contains(new MyRectangle2D(4,5,10.5,3.2)) + 
        "\nOverlaps Rectangle centered on (3,5) with a width of 2.3 & height of 5.4?: " + 
        r1.contains(new MyRectangle2D(3,5,2.3,5.4));
        System.out.println(result);

        // exit program 
        System.exit(0);
    }
}
