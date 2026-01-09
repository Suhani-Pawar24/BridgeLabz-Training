package com.day6.tourmate;

public abstract class Trip implements IBookable 
{
	protected String destination;
	protected double budget;
	
	protected Transport transport;
	protected Hotel hotel;
	protected Activity activity;
	
	Trip(String destination,Transport t,Hotel h,Activity a)
	{
		this.destination = destination;
		this.transport = t;
		this.hotel = h;
		this.activity = a;
		calculateTotalBudget();
	}
	
	private void calculateTotalBudget()
	{
		this.budget = transport.getTransportCost() + hotel.getHotelCost() + activity.getActivityCost();
	}
	
	public void displayPackage()
	{
		System.out.println("---Trip details---");
		System.out.println("Activity Name :" + activity.getActivityName());
		System.out.println("Total cost :" +budget);
	}
	
}
