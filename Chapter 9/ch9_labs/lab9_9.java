// Shawn Aviles 2/7/2021

// this program utilizes RegularPolygon Class to create a polygon and find its area and perimeter
class lab9_9{
    public static void main(String[] args){
        // create three polygon objects
        RegularPolygon poly1 = new RegularPolygon();
        RegularPolygon poly2 = new RegularPolygon(6, 4);
        RegularPolygon poly3 = new RegularPolygon(10, 4, 5.6, 7.8);

        // display results for polygon 1
        String results1 = 
        "Polygon 1:" +
        "\n Perimeter: " + poly1.getPerimeter() +
        "\n Area: " + poly1.getArea();
        System.out.println(results1);

        // display results for polygon 2
        String results2 = 
        "Polygon 2:" +
        "\n Perimeter: " + poly2.getPerimeter() +
        "\n Area: " + poly2.getArea();
        System.out.println(results2);

        // display results for polygon 3
        String results3 = 
        "Polygon 3:" +
        "\n Perimeter: " + poly3.getPerimeter() +
        "\n Area: " + poly3.getArea();
        System.out.println(results3);

        // exit program
        System.exit(0);
    }
}

class RegularPolygon{
    private int n = 3;          // amount of sides
    private double side = 1;    // length of side
    private double x = 0;
    private double y = 0;


    /* construct default polygon object */
    RegularPolygon(){
    }

    /* construct polygon object with specified amount of sides and length of each at origin */
    RegularPolygon(int newN, double newSide){
        n = newN;  
        side = newSide;
    }

    /* construct polygon object with specified amount of sides, length of sides, & coordinate */
    RegularPolygon(int newN, double newSide, double newX, double newY){
        n = newN;  
        side = newSide;
        x = newX;
        y = newY;
    }


    /* getters / accessors */
    int getN(){
        return n;
    }

    double getSide(){
        return side;
    }

    double getX(){
        return x;
    }

    double getY(){
        return y;
    }


    /* setters / mutators */
    void setN(int newN){
        n = newN;
    }

    void setSide(double newSide){
        side = newSide;
    }

    void setX(double newX){
        x = newX;
    }

    void setY(double newY){
        y = newY;
    }


    /* method returns the perimeter of polygon */
    double getPerimeter(){
        return n * side;
    }

    /* method returns the area of polygon */
    double getArea(){
        return (n * side * side) / (4 * Math.tan(Math.PI / n));
    }
}