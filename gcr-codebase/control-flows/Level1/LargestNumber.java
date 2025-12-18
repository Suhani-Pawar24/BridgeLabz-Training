import java.util.Scanner;

public class LargestNumber
{
	
  public static void main(String[] args)
  {
	
	//Create a Scanner Object
	Scanner input = new Scanner(System.in);
	System.out.println("Enter three numbers: ");
	int number1 = input.nextInt();
	int number2 = input.nextInt();
	int number3 = input.nextInt();
	
	//Checking which number is largest among three
	
	System.out.println("Is the first number the largest? " +((number1 > number2) && (number1 > number3)));
	System.out.println("Is the second number the largest? " +((number2 > number1)&& (number2 > number3)));
	System.out.println("Is the third number the largest? " +((number3 > number1)&& (number3 > number2)));
   }	
}   