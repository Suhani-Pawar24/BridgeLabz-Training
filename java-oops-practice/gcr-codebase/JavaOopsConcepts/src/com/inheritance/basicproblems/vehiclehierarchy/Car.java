package com.inheritance.basicproblems.vehicle;

public class Car extends Vehicle
{
	    private int seatCapacity;

	    public Car(int maxSpeed, String fuelType, int seatCapacity) 
	    {
	        super(maxSpeed, fuelType);
	        this.seatCapacity = seatCapacity;
	    }

	    @Override
	    public void displayInfo() 
	    {
	        System.out.print("Car -> ");
	        super.displayInfo();
	        System.out.println("Seats: " + seatCapacity);
	    }
}
	

