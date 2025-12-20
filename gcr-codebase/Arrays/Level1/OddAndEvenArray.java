import java.util.*;
public class OddAndEvenArray
{
	public static void main(String[] args)
	{
		//Creating a Scanner Object
		Scanner input = new Scanner(System.in);
		
		//Taking Integer Input 
		System.out.println("Enter a number : ");
		//Assign variable number to it
		int number = input.nextInt();
		
		//Check condition for natural number
		if(number < 1)
		{
			System.out.println("Error");
			System.exit(0);
		}
		else
		{
			int size = (number / 2) + 1;
			
			//Creating integer array for even and odd numbers
			int evenArray[] = new int[size];
			int oddArray[] = new int[size];
			int evenIndex = 0;
			int oddIndex = 0;
			for(int i = 1; i <= number ; i++)
			{
				if( i % 2 == 0 )
				{
					evenArray[evenIndex++]=i;
				}
				else
				{
					oddArray[oddIndex++]=i;
				}	
			}
			System.out.println("Odd Array ");
			for(int index = 0; index < oddIndex; index++)
			{
				System.out.print(oddArray[index]+" ");
			}
			System.out.println("");
			System.out.println("Even Array ");
			for(int index = 0; index < evenIndex; index++)
			{
				System.out.print(evenArray[index]+" ");
			}
			input.close();
		}
	}		
		
}	