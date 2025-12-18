import java.util.*;
public class BasicCalculator{
	public static void main(String[] args){
	//Taking a User Input
	Scanner scanner = new Scanner(System.in);
    // Ask for two floating point numbers
    System.out.print("Enter first number: ");
    double num1 = scanner.nextDouble();
    System.out.print("Enter second number: ");
    double num2 = scanner.nextDouble();

    // Perform arithmetic operations
    double add = num1 + num2;
    double sub = num1 - num2;
    double mul = num1 * num2;
    double div = num1 / num2; // Division of doubles results in a decimal

    // Display result 
    System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " 
            + num1 + " and " + num2 + " is " + add + ", " + sub + ", " + mul + ", and " + div);
    }
}