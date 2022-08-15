// Shawn Aviles 2/5/2021

// this program utilizes a Rectangle class to create a rectangle and display its properties
public class lab9_1{
    public static void main(String[] args){
        // create rectangle objects
        Rectangle rectangle1 = new Rectangle(4, 40);
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);

        // display results for rectangle 1
        String display1 = 
        "Rectangle 1:" + 
        "\n width: " + rectangle1.width +
        "\n height: " + rectangle1.height +
        "\n area: " + rectangle1.getArea() +
        "\n perimeter: " + rectangle1.getPerimeter();
        System.out.println(display1);

        // display results for rectangle 2
        String display2 = 
        "Rectangle 2:" + 
        "\n width: " + rectangle2.width +
        "\n height: " + rectangle2.height +
        "\n area: " + rectangle2.getArea() +
        "\n perimeter: " + rectangle2.getPerimeter();
        System.out.println(display2);

        // exit program
        System.exit(0);
    }
} 

class Rectangle{
    double width = 1;
    double height = 1;

    /* construct default object */
    Rectangle(){
    }

    /* construct object with specified width and height */
    Rectangle(double newWidth, double newHeight){
        width = newWidth;
        height = newHeight;
    }

    /* method returns area of rectangle */
    double getArea(){
        return width * height;
    }

    /* method returns perimeter of rectangle */
    double getPerimeter(){
        return width * 2 + height * 2;
    }
}