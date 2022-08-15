// Shawn Aviles 12/4/2020

public class lab6_8 {
    // display table of conversions of celsius to fahrenheit and vice versa
    public static void main(String args[]){
        // display table header
        System.out.printf("%-12s %-16s |        %-16s %-12s\n", "Celsius", "Farenheit", "Farenheit", "Celsius");

        // display table contents
        double fahrenheit2 = 120;
        for (double celsius1 = 40; celsius1 > 30; celsius1--){
            double fahrenheit1 = celsiusToFahrenheit(celsius1);
            double celsius2 = fahrenheitToCelsius(fahrenheit2);
            System.out.printf("%-12.1f %-16.1f |        %-16.1f %-12.2f\n", celsius1, fahrenheit1, fahrenheit2, celsius2);
            fahrenheit2 -= 10;
        }
        // exit program
        System.exit(0);
    }
    

    // convert from celcius to farenheit
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    // convert from farenheit to celcius
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}

