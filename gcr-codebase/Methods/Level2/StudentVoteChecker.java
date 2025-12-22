import java.util.Scanner;
public class StudentVoteChecker
{

    // Method to check Voting Eligibility
    public boolean canStudentVote(int age)
	{
        if (age < 0)
		{
            return false; 
        } 
		else if (age >= 18) 
		{
            return true;  
        } 
		else 
		{
            return false; 
        }
    }

 
    public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);
        StudentVoteChecker obj = new StudentVoteChecker();

        int[] ages = new int[10];

        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();

            boolean canVote = obj.canStudentVote(ages[i]);

            if (canVote)
			{
                System.out.println("Student " + (i + 1) + " is eligible to vote.");
            }
			else
			{
                System.out.println("Student " + (i + 1) + " is NOT eligible to vote.");
            }
        }

        scanner.close();
    }
}
