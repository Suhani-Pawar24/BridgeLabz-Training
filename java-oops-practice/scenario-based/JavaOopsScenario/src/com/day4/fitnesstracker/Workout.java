package com.day4.fitnesstracker;

public abstract class Workout implements ITrackable
{
    protected String type;
    protected int duration;
    protected double caloriesBurned;

    public Workout(String type, int duration)
    {
        this.type = type;
        this.duration = duration;
    }

    public abstract void calculateCalories();

    public void startWorkout()
    {
        System.out.println("Workout Started");
    }

    public void stopWorkout()
    {
        System.out.println("Workout Completed");
    }
}

	


