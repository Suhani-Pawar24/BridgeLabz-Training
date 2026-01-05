package com.encapsulation.vehiclerentalsystem;

public class VehicleRentalTest 
{

		public static void main(String[] args)
		{
			Vehicle[] vehicles = new Vehicle[3];
			
			vehicles[0] = new Car("MP09-c2342",1000,"Car-INS-01");
			vehicles[1] = new Bike("MP04-b2223",500);
			vehicles[2] = new Truck("MP49-B2345",5000);
			
			int day =5;
			for(Vehicle v : vehicles) 
			{
				double rent = v.calculateRentalCost(day);
				System.out.println("Rental cost :"+ rent);
				
				if(v instanceof Insurable ) 
				{
					Insurable ins = (Insurable) v;
					 System.out.println("Insurance : " + ins.calculateInsurance(day));
		             System.out.println("Insurance Info : " + ins.getInsuranceDetails());
		        }

		            System.out.println("----------------------------");
				
			}

		}

}

