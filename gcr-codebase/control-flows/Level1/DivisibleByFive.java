import java.util.*;

public class DivisibleByFive{

	public static void main(String[] args){
	  //Create a Scanner Object
	  Scanner input = new Scanner(System.in);
	  System.out.println("Enter a number : ");
	  
	  //Get input value for number
	  int number = input.nextInt();
	  
	  if(number % 5 == 0){
		System.out.println("Is the number " +number+ " divisible by 5? "+ "Yes");
		}
	  else{
		System.out.println("Is the number " +number+ " divisible by 5? "+ "No");
		}
	}
}	