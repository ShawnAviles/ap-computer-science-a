// Shawn Aviles 2/9/2021

// this program utilizes a Fan class to create two fan objects and display them invoking a 
public class lab9_8 {
    public static void main(String[] args) {
        // create fan objects with specifications
        Fan fan1 = new Fan();
        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        Fan fan2 = new Fan();
        fan2.setSpeed(2);
        fan2.setRadius(5);
        fan2.setOn(false);

        // display objects and close program
        System.out.println("Fan 1: \n" + fan1.toString());
        System.out.println("Fan 2: \n" + fan2.toString());
        System.exit(0);
    }
}

class Fan{
    static final String[] SPEEDS = {"","Slow","Medium","Fast"};
    static final int SLOW = 1;
    static final int MEDIUM = 2;
    static final int FAST = 3;

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    String color = "blue";


    /** default constructor */
    Fan() {
    }


    /** setters/ mutators */
    void setSpeed(int speed) {
        this.speed = speed;
    }

    void setOn (boolean on) {
        this.on = on;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    void setColor(String color) {
        this.color = color;
    }


    /** getters/ accessors */
    String getSpeed(){
        return SPEEDS[speed];
    }

    boolean getOn(){
        return on;
    }

    double getRadius(){
        return radius;
    }

    String getColor(){
        return color;
    }


    /** method returns string description of fan */
    public String toString() {
        if (on) {
            return " Speed: " + getSpeed() + "\n Radius: " + radius + "\n Color: " + color;
        } 
        else {
            return " The fan is off \n Radius: " + radius + "\n Color: " + color;
        }
    }
}