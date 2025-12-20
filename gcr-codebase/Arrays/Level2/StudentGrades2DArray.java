import java.util.Scanner;
public class StudentGrades2DArray 
{
    public static void main(String[] args) 
	{
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int number = input.nextInt();

       
        double[][] marks = new double[number][3];
        double[] percentage = new double[number];
        String[] grade = new String[number];

        // Input marks and calculate percentage & grade
        for (int i = 0; i < number; i++)
		{
            for (int j = 0; j < 3; j++)
			{
                while (true)
				{
                    if (j == 0) System.out.print("Enter Physics marks for student " + (i+1) + ": ");
                    else if (j == 1) System.out.print("Enter Chemistry marks for student " + (i+1) + ": ");
                    else System.out.print("Enter Maths marks for student " + (i+1) + ": ");

                    double mark = input.nextDouble();
                    if (mark < 0)
					{
                        System.out.println("Marks cannot be negative. Enter again.");
                    } else 
					{
                        marks[i][j] = mark;
                        break;
                    }
                }
            }

            // Calculate percentage for the student
            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            // Assign grade based on percentage
            if (percentage[i] >= 90) grade[i] = "A+";
            else if (percentage[i] >= 80) grade[i] = "A";
            else if (percentage[i] >= 70) grade[i] = "B+";
            else if (percentage[i] >= 60) grade[i] = "B";
            else if (percentage[i] >= 50) grade[i] = "C";
            else grade[i] = "F";
        }

        // Display results
        System.out.println("\nStudent\tPhysics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < number; i++) {
            System.out.printf("%d\t%.2f\t%.2f\t\t%.2f\t%.2f\t\t%s\n",
                              i+1, marks[i][0], marks[i][1], marks[i][2], percentage[i], grade[i]);
        }

        input.close();
    }
}
