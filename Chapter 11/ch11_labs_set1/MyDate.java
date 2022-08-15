// MyDate Class from lab 10.14
import java.util.GregorianCalendar;

public class MyDate{
    private int year, month, day;

    /** default constructor */
    MyDate(){
        GregorianCalendar date = new GregorianCalendar();
        year = date.get(GregorianCalendar.YEAR);
        month = date.get(GregorianCalendar.MONTH);
        day = date.get(GregorianCalendar.DAY_OF_MONTH);
    }

    /** constructor with specified elapsed time since midnight, January 1, 1970, in milleseconds */
    MyDate(long elapsedTime){
        GregorianCalendar date = new GregorianCalendar();
        date.setTimeInMillis(elapsedTime);
        year = date.get(GregorianCalendar.YEAR);
        month = date.get(GregorianCalendar.MONTH);
        day = date.get(GregorianCalendar.DAY_OF_MONTH); 
    }

    /** constructor with specified year, month, day */
    MyDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    /** accessors/ getters */
    public int getYear(){
        return year;
    }

    public int getMonth(){
        return month;
    }

    public int getDay(){
        return day;
    }

    /** method sets a new date for the object using the elapsed time */
    public void setDate(long elapsedTime){
        GregorianCalendar date = new GregorianCalendar();
        date.setTimeInMillis(elapsedTime);
        year = date.get(GregorianCalendar.YEAR);
        month = date.get(GregorianCalendar.MONTH);
        day = date.get(GregorianCalendar.DAY_OF_MONTH); 
    }
}
