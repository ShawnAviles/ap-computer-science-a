// Shawn Aviles 3/21/2021

// program tests the MyDate Class
public class lab10_14 {
    public static void main(String[] args) {
        // create MyDate objects
        MyDate d1 = new MyDate();
        MyDate d2 = new MyDate(34355555133101L);
        // display year, month, day
        System.out.println("Date 1: " + d1.getMonth() + "/" + d1.getDay() + "/" + d1.getYear());
        System.out.println("Date 2: " + d2.getMonth() + "/" + d2.getDay() + "/" + d2.getYear());
    }
}
