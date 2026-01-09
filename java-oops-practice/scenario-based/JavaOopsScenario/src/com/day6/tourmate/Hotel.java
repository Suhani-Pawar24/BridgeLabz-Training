package com.day6.tourmate;

public class Hotel 
{
	private double roomPrice;
	private int days;
	
	public Hotel(double roomPrice,int days)
	{
		this.roomPrice = roomPrice;
		this.days = days;
	}
	
	public double getHotelCost()
	{
		return roomPrice*days;
	}
 
}
