package com.encapsulation.vehiclerentalsystem;

public class Truck extends Vehicle implements Insurable
{
		
		
		Truck(String vehicleNumber,double rentalRate)
		{
			super(vehicleNumber,rentalRate);
			
		}
		double calculateRentalCost(int days) 
		{
			return rentalRate*days*1.5;
		}
		public double calculateInsurance(int days)
		{
			return 500*days;
		}
		public String getInsuranceDetails() 
		{
			return "truck insurance";
		}
		
}

