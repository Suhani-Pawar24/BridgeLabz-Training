package com.encapsulation.vehiclerentalsystem;

public abstract class Vehicle 
{
		private String vehicleNumber;
		protected double rentalRate;
		
		Vehicle(String vehicleNumber,double rentalRate)
		{
			this.vehicleNumber = vehicleNumber;
			this.rentalRate = rentalRate;
		}
		
		abstract double calculateRentalCost(int days);
		
		double getRentalRate()
		{
			return rentalRate;
		}
		String getVehicleNumber() 
		{
			return vehicleNumber;
		}
}


