// Shawn Aviles 4/13/2021
import java.util.Scanner;

// program test the Triangle Class 
public class lab11_1{
    public static void main(String[] args) {
		// create scanner object
		Scanner input = new Scanner(System.in);

		// prompt user for three sides of the triangle
		System.out.print("Enter three side of the triangle: ");
		double side1 = input.nextDouble();		
		double side2 = input.nextDouble();		
		double side3 = input.nextDouble();

		// prompt user for color
		System.out.print("Enter a color: ");
		String color = input.next();

		// prompt user to enter whether the triangle is filled
		System.out.print("Is the triangle filled (true / false)? ");
		boolean filled = input.nextBoolean();

		// create triangle object and close scanner object
		Triangle t = new Triangle(side1, side2, side3);
		t.setColor(color);
		t.setFilled(filled);
        input.close();

        // display results and exit program
        String results = t.toString() + 
        "\nArea: " + t.getArea() +
        "\nPerimeter: " + t.getPerimeter() +
        "\nColor: " + t.getColor() + 
        "\nTriangle is" + (t.isFilled() ? " " : " not ") + 
        "filled";
        System.out.println(results);
        System.exit(0);
	}
}