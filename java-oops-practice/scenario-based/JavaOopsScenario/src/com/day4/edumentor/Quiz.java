package com.day4.edumentor;

public class Quiz
{
	private String difficulty;
	private String[] questions;
	private String[] correctAnswers;
	private int totalQues;
	
	public Quiz(String difficulty, String[] questions, String[] correctAnswers)
	{
		this.difficulty = difficulty;
		this.questions = questions;
		this.correctAnswers = correctAnswers;
	}
	
	public double calculateScore(String[] learnerAnswers) 
	{
	    int correctCount = 0; 
	    
	    for (int i = 0; i < questions.length; i++)
	    {
	       
	        if (learnerAnswers[i].equalsIgnoreCase(correctAnswers[i]))
	        {
	            correctCount++; 
	        }
	    }

	    double percentage = (double) (correctCount * 100) / questions.length;
	    
	    return percentage;
	}
}
