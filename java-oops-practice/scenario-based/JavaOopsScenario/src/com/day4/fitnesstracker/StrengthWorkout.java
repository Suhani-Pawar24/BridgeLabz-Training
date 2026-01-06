package com.day4.fitnesstracker;

public class StrengthWorkout extends Workout
{
	StrengthWorkout(int duration)
	{
		super("Strength",duration);
	}
	
	public void calculateCalories()
	{
		this.caloriesBurned = duration * 5.0;
	}
}
