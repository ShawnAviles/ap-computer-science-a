public class MyRectangle2D{
    private double x, y, width, height;

    /** default constructor */
    MyRectangle2D(){
        x = 0;
        y = 0;
        width = 1;
        height = 1;
    }

    /** constructor with specified coordinate, width and height */
    MyRectangle2D(double x, double y, double width, double height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    /** accessors/ getters */
    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    /** mutators/ setters */
    public void setX(double newX){
        x = newX;
    }

    public void setY(double newY){
        y = newY;
    }

    public void setWidth(double newWidth){
        width = newWidth;
    }

    public void setHeight(double newHeight){
        height = newHeight;
    }
    
    /** method returns area of rectangle */
    public double getArea(){
        return width * height;
    }

    /** method returns perimeter of rectangle */
    public double getPerimeter(){
        return 2 * width + 2 * height;
    }

    /** method returns true if a specified point is inside this rectange, false otherwise */
    public boolean contains(double x, double y){
        double leftX = this.x - width/2;
        double rightX = this.x + width/2;
        double topY = this.y + height/2;
        double bottomY = this.y - height/2;

        boolean withinY = y < topY && y > bottomY;
        boolean withinX = x < rightX && x > leftX;

        return withinY && withinX;
    }

    /** method returns true if a specified rectangle is inside this rectangle */
    public boolean contains(MyRectangle2D r){
        // x and y values of sides
        double leftX = x - width/2;
        double rightX = x + width/2;
        double topY = y + height/2;
        double bottomY = y - height/2;

        // determine if the sides of rectangle r are within this rectangle
        boolean withinY = (r.getY() + r.getHeight()/2) < topY && (r.getY() - r.getHeight()/2) > bottomY;
        boolean withinX = (r.getX() + r.getWidth()/2) < rightX && (r.getX() - r.getWidth()/2) > leftX;

        return withinY && withinX;
    }

    /** method returns true if a specified rectangle overlaps with this rectangle */
    public boolean overlaps(MyRectangle2D r){
        // x and y value of sides of rectangle R
        double leftX = r.getX() - r.getWidth()/2;
        double rightX = r.getX() + r.getWidth()/2;
        double topY = r.getY() + r.getHeight()/2;
        double bottomY = r.getY() - r.getHeight()/2;

        // are corners of rectangle R within this rectangle
        boolean topR = this.contains(rightX, topY);
        boolean topL = this.contains(leftX, topY);
        boolean bottomR = this.contains(rightX, bottomY);
        boolean bottomL = this.contains(leftX, bottomY);
        boolean containsCorner = topR || topL || bottomR || bottomL;

        // determine if the sides of rectangle r are larger than this rectangle
        boolean withinY = (y + height/2) > topY && (y - height/2) < bottomY;
        boolean withinX = (x + width/2) > rightX && (x - width/2) < leftX;
        boolean overlapTopSide = withinX && ((y + height/2) < topY && (y + height/2) < bottomY);
        boolean overlapBottomSide = withinX && ((y - height/2) > topY && (y - height/2) < bottomY);
        boolean overlapRightSide = withinY && ((x + width/2) < rightX && (x + width/2) > leftX);
        boolean overlapLeftSide = withinY && ((x - width/2) < rightX && (x - width/2) > leftX);
        boolean overlapSides = overlapTopSide || overlapBottomSide || overlapLeftSide || overlapRightSide;

        return containsCorner || overlapSides;
    }
}