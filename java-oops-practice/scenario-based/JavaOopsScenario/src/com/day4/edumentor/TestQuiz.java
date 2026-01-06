package com.day4.edumentor;

public class TestQuiz 
{
	public static void main(String[] args)
	{
		String[] questions = { "1+1", "Bhopal is the city of?"};
		String[] answers = {"2", "Lakes"};
		
		
		Learner student = new Learner("Suhani", "xyz@gmail.com","A21");
		Quiz mathQuiz = new Quiz("Easy", questions,answers);
		
		String[] suhaniAnswers = {"2", "Lakes"};
		double result = mathQuiz.calculateScore(suhaniAnswers);
		
		System.out.println("Learner : "+ student.name);
		System.out.println("Quiz Score : "+ result + "%");
		
		if(result >= 50.0)
		{
			student.generateCertificate("Short Course");
		}
	}

}
