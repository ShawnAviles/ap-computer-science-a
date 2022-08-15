// Shawn Aviles 9/13/2020

public class lab1_10 {
    public static void main(String[] args){
        double km = 14;                             // distance in kilometers
        double time = 45.5;                         // time in minutes
        // unit conversion of 14 kilometers and 45.5 minutes to miles per hour
        // 14km / 45.5 min * 60 min/ 1 hr * 1 mile/ 1.6 km = mile / hour
        double mph = (km * 60) / (time * 1.6);
        System.out.println("miles per hour = " + mph);
    }
}