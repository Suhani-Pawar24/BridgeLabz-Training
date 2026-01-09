package com.day6.tourmate;

public class Activity 
{
	private String activityName;
	private double entryFee;
	private double guideCharges;
	
	public Activity(String activityName,double entryFee,double guideCharges)
	{
		this.activityName = activityName;
		this.entryFee = entryFee;
		this.guideCharges = guideCharges;
	}
	
	public double getActivityCost()
	{
		return entryFee + guideCharges;
	}
	
	public String getActivityName()
	{
		return activityName;
	}

}
