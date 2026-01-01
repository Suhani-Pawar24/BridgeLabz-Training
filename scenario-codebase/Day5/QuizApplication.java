/*Ask 5 questions (MCQs) from a user.
● Use arrays and for-loop.
● Record score.
● Switch for answer checking. Apply clear indentation and structured layout.*/

import java.util.*;
public class QuizApplication
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		String[] ques = {" Indexing start from which number in an array ?",
		                 "  If an array size is five, then what will be the number of last index ",
						 " What is the abbreviation of Hyper Text Markup Language? ",
						 " What is the abbreviation of Cascading Style Sheets? ",
						 " What is the abbreviation of Wireless Fidelity "};
		String[] option = { "1. 0, 2. 1, 3. -1, 4. 10" ,
						"1. 1, 2. 4, 3. 0, 4. -1" ,
						"1. HTML, 2.MTHL, 3.CMLH, 4.HTPL",
						"1.CMS , 2.CPS , 3.CSS, 4.TSS",
						"1.Wi-Fi , 2.Wi-li , 3.Wi-di , 4.Di-gi"};
		int score = 0;				
		for(int i = 0; i < 5; i++)
		{
			System.out.println(ques[i]);
			System.out.println(option[i]);
			System.out.println("Choose the correct answer");
			int userAns = input.nextInt();
			int[] ans = { 1, 2, 1, 3, 1};
			switch(ans[i])
			{
				case 1:
					if(userAns == 1)
					{
						score++;
					}	
				break;	
				case 2:
					if(userAns == 2)
					{
						score++;
					}
				break;	
				case 3:
                    if(userAns == 3)
					{
						score++;
					}
				break;	
				case 4:
					if(userAns == 4)
					{
						score++;
					}
				break;
	            default:
			        System.out.println("Invalid option ");
			}
		}
		System.out.println("Your score is " + score);
	}	
}	
						 