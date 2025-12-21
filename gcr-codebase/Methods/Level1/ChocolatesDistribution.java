import java.util.*;
public class ChocolatesDistribution
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of chocolates: ");
		int numberOfChocolates = input.nextInt();
		
		System.out.println("Enter the number of children: ");
		int numberOfChildren = input.nextInt();
		
		int[] result = ChocolatesDistribution.findRemainderAndQuotient(numberOfChocolates, numberOfChildren);
		System.out.println(Arrays.toString(result));
		
		input.close();
		
	}
	
	public static int[] findRemainderAndQuotient(int numberOfChocolates, int numberOfChildren)
	{
		int[] arr  = new int[2];
		int quotient = (numberOfChocolates / numberOfChildren);
		int remainder = (numberOfChocolates % numberOfChildren);
		arr[0] = quotient;
		arr[1] = remainder;
		return arr;
	}
}	
		