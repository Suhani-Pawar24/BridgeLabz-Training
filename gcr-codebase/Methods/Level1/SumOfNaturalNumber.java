import java.util.*;
public class SumOfNaturalNumber
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		SumOfNaturalNumber obj = new SumOfNaturalNumber();
		System.out.println(obj.naturalNumberSum(number));
		
	}
	
	//Method to find sum of N natural Number 
	public int naturalNumberSum(int number)
	{
		int sum = 0;
		for(int i = 1; i <=number; i++)
		{
			sum+=i;
		}
		return sum;
	}
}	
		
	