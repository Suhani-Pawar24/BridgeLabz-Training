package com.encapsulation.ridehailingapplicaiton;

public class Auto extends Vehicle implements GPS
{
		
		private String location;
		Auto(int vehicleId,String driverName,double ratePerKm,String location)
		{
			super(vehicleId,driverName,ratePerKm);
			this.location = location;
			
		}
		
		double calculateFare(double distance) 
		{
			return distance*ratePerKm;
		}
		public String getCurrentLocation() 
		{
			return this.location;
		}
		public void updateLocation(String location)
		{
			this.location = location;
		}
		
		
}


