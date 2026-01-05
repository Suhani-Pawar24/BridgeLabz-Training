package com.encapsulation.ridehailingapplicaiton;

public class TestVehicle 
{
	
		public static void main(String [] args) 
		{
		Vehicle[] varr = new Vehicle[3];
		varr[0] = new Car(112,"Suhani",20,"Bhopal");
		varr[1] = new Bike(113,"Adi",8,"Indore");
		varr[2] = new Auto(114,"Raman",15,"Bhopal");
		
			for(Vehicle v : varr) 
			{
				v.getVehicleDetails();
				System.out.println(v.calculateFare(15));
			
				if(v instanceof GPS) 
				{
					System.out.println("Current Location :"+((GPS) v).getCurrentLocation());
				}
			
			System.out.println("_______________________________________");
			}
		
		}
}


