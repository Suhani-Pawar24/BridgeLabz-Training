import java.util.*;
public class VowelAndConsonants
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = input.next();
		
		String lowerCase = str.toLowerCase();
		System.out.println(CountVowelAndConsonants(lowerCase));
	}
	
	
	public static String CountVowelAndConsonants(String str)
	{
		int countVowel = 0;
		int countConsonant = 0;
		
		for(int i = 0; i <str.length(); i++)
		{
			char ch = str.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			{
				countVowel++;
			}
			else
			{
				countConsonant++;
			}
		}
		return ("Vowels : "+ countVowel + "\nConsonants : "+ countConsonant);
	}
}	