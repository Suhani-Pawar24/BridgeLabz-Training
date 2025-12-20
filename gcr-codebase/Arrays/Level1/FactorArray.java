import java.util.*;
public class FactorArray
{
	public static void main(String[] args)
	{
		//Creating a Scanner Object
		Scanner input = new Scanner(System.in);
		//Take the input for a number and store it in number variable
		int number = input.nextInt();
		
		//Creating integer variable maxFactor and initializing with 0
		int maxFactor = 10;
		
		//Creating factorsArray of size maxFactor
		int[] factorsArray = new int[maxFactor];
		int index = 0;
		
		for(int i = 1; i <= number; i++)
		{
			if( number % i == 0 )
			{
				if( index == maxFactor )
				{
					maxFactor = maxFactor * 2;
					int[] temp = new int[maxFactor];
					for( int j = 0; j < index; j++)
					{
						temp[j] = factorsArray[j];
					}
					factorsArray = temp;
				}
			factorsArray[index]=i;
			index++;
			}
		}	
		System.out.println("The factors of a number are : " );
		for( int i = 0; i < index; i++)
		{
			System.out.print(factorsArray[i] + " ");
		}
	}
}	
			