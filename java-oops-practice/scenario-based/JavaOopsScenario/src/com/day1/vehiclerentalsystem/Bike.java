package com.day1.vehiclerentalsystem;

public class Bike extends Vehicle implements Rentable
{
	
		public Bike(String plateNumber)
		{
	        super(plateNumber, 20.0);
	    }

	    @Override
	    public double calculateRent(int days)
	    {
	        return baseRate * days;
	    }

	    @Override
	    public String getVehicleType() 
	    {
	    	return "Bike"; 
	    }
}


