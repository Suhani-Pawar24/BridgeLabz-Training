import java.util.*;
public class VoteEligibility
{
	public static void main(String[] args)
  {
	
	//Taking User Input
	int[] ages = new int[10];
	Scanner input = new Scanner(System.in);
	
	System.out.println("Please enter the ages of 10 students : ");
	for(int i = 0; i < ages.length ; i++)
	{
	System.out.println("Student" + ( i + 1 ) +  ": ");
	ages[i] = input.nextInt();
	}
	for(int i = 0; i < ages.length; i++)
	{
	int age = ages[i];
		if(age < 0)
		{
			System.out.println("Invalid age entered: " + age);
		}
		else if(age >= 18)
		{
			System.out.println("The Student with age " + age + " can vote ");
		}
		else
		{
			System.out.println("The Student with age " + age + " cannot vote ");
		}
	}
	input.close();
  }
} 