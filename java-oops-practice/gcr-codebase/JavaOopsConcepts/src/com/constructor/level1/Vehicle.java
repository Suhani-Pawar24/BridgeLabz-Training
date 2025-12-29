package com.constructor.level1;

public class Vehicle {
	
	String ownerName;
	String vehicleType;
	
	static double registrationFee = 0;
	
	Vehicle(String ownerName, String vehicleType)
	{
		this.ownerName = ownerName;
		this.vehicleType = vehicleType;
	}
	
	void displayVehicleDetails()
	{
		System.out.println("Owner Name : "+ ownerName);
		System.out.println("Vehicle Type : "+vehicleType);
	}
	
	static void updateRegistrationFee(double fee)
	{
		registrationFee = fee;
	}
	
	public static void main(String[] args)
	{
		Vehicle obj = new Vehicle("Aditya", "Car");
		obj.displayVehicleDetails();
		Vehicle.updateRegistrationFee(500);
	}

}
