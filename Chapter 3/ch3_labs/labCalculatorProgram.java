//Shawn Aviles 10/22/2020
import java.util.Scanner;

// this program prompts user for an operator and two numbers and performs calculation
public class labCalculatorProgram {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // prompt user for operator, two numbers, and declare result variable
        System.out.print(" 1. Addition\n 2. Subtraction\n 3. Multiplication\n 4. Division\n 5. Modulus\n");
        System.out.print("Enter an operation (1,2,3,4,5): ");        
        String operator = input.nextLine();
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();
        input.close();
        double result = 0;
        
        // perform calculations
        switch (operator){
            case "1": result += num1 + num2;
                operator = "+";
                break;
            case "2": result += num1 - num2;
                operator = "-";
                break;
            case "3": result += num1 * num2;
                operator = "x";
                break;
            case "4": result += num1 / num2;
                operator = "/";
                break;
            case "5": result += num1 % num2;
                operator = "%";
                break;
            default: System.out.println("The operator you entered can't be done by this calculator. I'm sorry");
                System.exit(1);
        }
        
        // display result 
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        System.out.println("Answer: " + result);
    }
}
