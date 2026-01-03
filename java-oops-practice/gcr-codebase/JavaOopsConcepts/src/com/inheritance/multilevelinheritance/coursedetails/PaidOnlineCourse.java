package com.inheritance.multilevelinheritance.coursedetails;

public class PaidOnlineCourse extends OnlineCourse
{
	protected double fee;
	protected double discount;
	
	public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded,double fee, double discount)
	{
		super(courseName,duration,platform,isRecorded);
		this.fee = fee;
		this.discount = discount;
		
	}
	public void courseDetails() 
	{
		super.courseDetails();
		System.out.println("FEE :" +fee);
		System.out.println("Discount offer :" + discount);
		
	}

}
