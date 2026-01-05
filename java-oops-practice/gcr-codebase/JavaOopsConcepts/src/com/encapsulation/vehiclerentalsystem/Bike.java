package com.encapsulation.vehiclerentalsystem;

public class Bike extends Vehicle implements Insurable{
	
	
	Bike(String vehicleNumber,double rentalRate)
	{
		super(vehicleNumber,rentalRate);
		
	}
	double calculateRentalCost(int days) 
	{
		return rentalRate*days *0.8;
	}
	public double calculateInsurance(int days)
	{
		return 100*days;
	}
	public String getInsuranceDetails() 
	{
		return "bike insurance";
	}
	
}


