import java.util.Scanner;
public class DivisionDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();

        // The / operator calculates how many times number2 fits into number1
        int quotient = number1 / number2;
        
        // The % (modulo) operator calculates what is left over
        int reminder = number1 % number2;
		
		//Display result
        System.out.println("The Quotient is " + quotient + " and Reminder is " + reminder + " of two number " + number1 + " and " + number2);
    }
}