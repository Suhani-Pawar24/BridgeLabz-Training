package com.inheritance.basicproblems.vehicle;

public class TestVehicle 
{
	    public static void main(String[] args)
	    {
	
	        Vehicle[] fleet = new Vehicle[3];
	        
	        fleet[0] = new Car(180, "Petrol", 5);
	        fleet[1] = new Truck(100, "Diesel", 15.5);
	        fleet[2] = new Motorcycle(150, "Petrol", false);

	        System.out.println("=== Transport Fleet Details ===\n");
	        
	        for (Vehicle v : fleet)
	        {
	            v.displayInfo(); 
	            System.out.println("-----------------------------");
	        }
	    }
}


