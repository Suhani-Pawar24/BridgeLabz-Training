package com.inheritance.multilevelinheritance.coursedetails;

public class OnlineCourse extends Course
{
	
	protected String platform;
	protected boolean isRecorded;
	
	public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded)
	{
		super(courseName, duration);
		// TODO Auto-generated constructor stub
		this.platform = platform;
		this.isRecorded = isRecorded;
	}
	
	public void courseDetails() 
	{
		super.courseDetails();
		System.out.println("Course platform:" + platform);
		System.out.println("isRecorded :" + isRecorded);
		
	}

}
