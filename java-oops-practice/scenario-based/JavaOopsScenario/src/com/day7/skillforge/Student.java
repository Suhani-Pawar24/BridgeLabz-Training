package com.day7.skillforge;

public class Student extends User
{
   private double currentProgress = 0.0;

	    public Student(String name, String email)
	    {
	        super(name, email);
	    }

	    // Progress tracking using Operators
	    public void updateProgress(double completedModules, double totalModules)
	    {
	        this.currentProgress = (completedModules / totalModules) * 100; // Division and Multiplication
	    }

	    public double getProgress()
	    {
	    	return currentProgress;
	    }
	    public String getName() 
	    {
	    	return name;
	    }
}

	


