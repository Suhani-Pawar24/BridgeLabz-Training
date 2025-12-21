import java.util.*;
public class QuotientAndRemainder
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer : ");
		int number = input.nextInt();
		
		System.out.println("Enter divisor : ");
		int divisor = input.nextInt();
		
		int[] result=QuotientAndRemainder.findRemainderAndQuotient(number,divisor);
		System.out.println(Arrays.toString(result));
		
		input.close();
	}
	
	public static int[] findRemainderAndQuotient(int number, int divisor)
	{
		int[] arr = new int[2];
		int quotient = number / divisor;
		int remainder = number % divisor;
		arr[0]=quotient;
		arr[1]=remainder;
		return arr;
	}
}	
		
		