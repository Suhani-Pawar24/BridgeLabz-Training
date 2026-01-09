package com.day6.tourmate;

public class DomesticTrip extends Trip
{
	public DomesticTrip(String destination, Transport t, Hotel h, Activity a) 
	{
        super(destination, t, h, a);
    }

	@Override
	public void book() 
	{
	System.out.println("\nBooking Domestic Trip to: " + destination);
	System.out.println(">> Verification: Aadhar Card/ID Proof verified.");
	System.out.println(">> Status: Bus/Train and Local Stay confirmed!");
    }

	@Override
	public void cancel() 
	{
	    System.out.println(">> Cancelled: Domestic trip to " + destination + " cancelled (Full refund initiated).");
	}
}
