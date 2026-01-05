package com.encapsulation.ridehailingapplicaiton;

public abstract class Vehicle 
{
		private int vehicleId;
		private String driverName;
		protected double ratePerKm;
		
		Vehicle(int vehicleId,String driverName,double ratePerKm){
			this.vehicleId =  vehicleId;
			this.driverName = driverName;
			this.ratePerKm = ratePerKm;
		}
		
		
		
		abstract double calculateFare(double distance);
		
		void getVehicleDetails() {
			System.out.println("Driver Name :"+driverName);
			System.out.println("vehicle id:"+vehicleId);
			
		}
		
		

}


