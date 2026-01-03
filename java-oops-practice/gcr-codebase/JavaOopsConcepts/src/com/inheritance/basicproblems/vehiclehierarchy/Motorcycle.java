package com.inheritance.basicproblems.vehiclehierarchy;

public class Motorcycle extends Vehicle
{
	    private boolean hasSidecar;

	    public Motorcycle(int maxSpeed, String fuelType, boolean hasSidecar) 
	    {
	        super(maxSpeed, fuelType);
	        this.hasSidecar = hasSidecar;
	    }

	    @Override
	    public void displayInfo() 
	    {
	        System.out.print("Motorcycle -> ");
	        super.displayInfo();
	        System.out.println("Has Sidecar: " + hasSidecar);
	    }
}


