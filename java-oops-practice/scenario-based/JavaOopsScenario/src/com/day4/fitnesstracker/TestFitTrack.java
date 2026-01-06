package com.day4.fitnesstracker;

public class TestFitTrack 
{
	public static void main(String[] args)
	{
		UserProfile user = new UserProfile("Suhani",23,75.0,500.0);
		
		CardioWorkout run = new CardioWorkout(30);
		run.startWorkout();
        run.calculateCalories();
       
        
		double left = user.dailyTarget - run.caloriesBurned;

		
		System.out.println("User name : "+ user.name);
		System.out.println("Calories Burner : "+run.caloriesBurned);
		System.out.println("Remaining target : "+ left);
		run.stopWorkout();
		
		
	}

}
