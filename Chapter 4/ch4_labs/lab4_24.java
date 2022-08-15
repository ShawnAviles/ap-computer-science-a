// Shawn Aviles 11/11/2020
import java.util.Scanner;

// this program prompts user for three cities and displays them in alphabetical order
public class lab4_24 {
    public static void main(String args[]){
        // create scanner object
        Scanner input = new Scanner(System.in);

        // prompt user for three cities
        System.out.print("Enter the first city: ");
        String city1 = input.nextLine();
        System.out.print("Enter the second city: ");
        String city2 = input.nextLine();
        System.out.print("Enter the third city: ");
        String city3 = input.nextLine();
        input.close();

        // determine the order of the cities
        String firstCity = "";
        String secondCity = "";
        String thirdCity = "";
        // determine the first city in alphabetical order
        if (city1.compareToIgnoreCase(city2) < 0 && city1.compareToIgnoreCase(city3) < 0){
            firstCity = city1;
        }
        else if (city2.compareToIgnoreCase(city1) < 0 && city2.compareToIgnoreCase(city3) < 0){
            firstCity = city2;
        }
        else {
            firstCity = city3;
        }
        // determine the second city
        if (city1.compareToIgnoreCase(city2) > 0 && city1.compareToIgnoreCase(city3) < 0 || city1.compareToIgnoreCase(city2) < 0 && city1.compareToIgnoreCase(city3) > 0){
            secondCity = city1;
        }
        else if (city2.compareToIgnoreCase(city1) > 0 && city2.compareToIgnoreCase(city3) < 0 || city2.compareToIgnoreCase(city1) < 0 && city2.compareToIgnoreCase(city3) > 0){
            secondCity = city2;
        }
        else{
            secondCity = city3;
        }
        // determine the final city
        if (city1.compareToIgnoreCase(city2) > 0 && city1.compareToIgnoreCase(city3) > 0){
            thirdCity = city1;
        }
        else if (city2.compareToIgnoreCase(city1) > 0 && city2.compareToIgnoreCase(city3) > 0){
            thirdCity = city2;
        }
        else{
            thirdCity = city3;
        }

        // display results and exit program
        System.out.println("The three cities in alphabetical order are: " + firstCity + ", " + secondCity + ", "+ thirdCity);
        System.exit(0);
    }
    
}
