package com.day6.tourmate;

public class Transport 
{
	private double ticketPrice;
	private double tax;
	
	public Transport(double price)
	{
		this.ticketPrice = price;
		this.tax = price * 0.10;
	}
	
	public double getTransportCost()
	{
		return ticketPrice + tax;
	}

}
