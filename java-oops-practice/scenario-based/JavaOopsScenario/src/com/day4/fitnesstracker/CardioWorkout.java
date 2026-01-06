package com.day4.fitnesstracker;

public class CardioWorkout extends Workout
{
	CardioWorkout(int duration)
	{
		super("Cardio", duration);

	}
	
	@Override
	public void calculateCalories()
	{
		this.caloriesBurned = duration * 10.5;
	}

}


