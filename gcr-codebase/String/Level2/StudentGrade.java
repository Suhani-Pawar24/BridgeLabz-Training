import java.util.Scanner;
public class StudentGrade
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int students = sc.nextInt();

        int[][] scores = generateScores(students);
        double[][] calculations = calculateResults(scores);
        String[][] grades = calculateGrades(calculations);
        displayScoreCard(scores, calculations, grades);
    }

    public static int[][] generateScores(int n)
    {
        int[][] scores = new int[n][3];

        for (int i = 0; i < n; i++)
        {
            scores[i][0] = (int)(Math.random() * 90) + 10;
            scores[i][1] = (int)(Math.random() * 90) + 10;
            scores[i][2] = (int)(Math.random() * 90) + 10;
        }

        return scores;
    }

    public static double[][] calculateResults(int[][] scores)
    {
        double[][] result = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++)
        {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            result[i][0] = Math.round(total * 100.0) / 100.0;
            result[i][1] = Math.round(average * 100.0) / 100.0;
            result[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        return result;
    }

    public static String[][] calculateGrades(double[][] data)
    {
        String[][] grades = new String[data.length][1];

        for (int i = 0; i < data.length; i++)
        {
            double percentage = data[i][2];

            if (percentage >= 90)
            {
                grades[i][0] = "A";
            }
            else if (percentage >= 80)
            {
                grades[i][0] = "B";
            }
            else if (percentage >= 70)
            {
                grades[i][0] = "C";
            }
            else if (percentage >= 60)
            {
                grades[i][0] = "D";
            }
            else
            {
                grades[i][0] = "F";
            }
        }

        return grades;
    }

    public static void displayScoreCard(int[][] scores, double[][] calc, String[][] grades)
    {
        System.out.println("Stu\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");

        for (int i = 0; i < scores.length; i++)
        {
            System.out.println(
                    (i + 1) + "\t" +
                    scores[i][0] + "\t" +
                    scores[i][1] + "\t" +
                    scores[i][2] + "\t" +
                    calc[i][0] + "\t" +
                    calc[i][1] + "\t" +
                    calc[i][2] + "\t" +
                    grades[i][0]
            );
        }
    }
}
