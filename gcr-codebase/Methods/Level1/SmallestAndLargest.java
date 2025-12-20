import java.util.*;
public class SmallestAndLargest
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three numbers: "); 
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		int[] result = SmallestAndLargest.findSmallestAndLargest(number1, number2, number3);
		System.out.println(Arrays.toString(result));
		input.close();
	}
	public static int[] findSmallestAndLargest(int number1, int number2, int number3)
	{
		int[] arr = new int[2];
		int smallest = 0;
		int largest = 0;
		if(number1 < number2 && number1 < number3)
		{
			if(number2 < number3)
			{
				largest = number3;
			}
			else
			{
				largest = number2;
			}
		smallest = number1;
		}
		else if(number2 < number3 && number2 < number1)
		{
			if(number1 < number3)
			{
				largest = number3;
			}
			else
			{
				largest = number1;
			}
		smallest = number2;
		}
		else
		{
			if(number2 <number1)
			{
				largest=number1;
			}
			else
			{
				largest=number2;
			}
		smallest=number3;
		}
		arr[0]=smallest;
		arr[1]=largest;
		return arr;
		
	}
}	
			
		
				
		
		
		
		