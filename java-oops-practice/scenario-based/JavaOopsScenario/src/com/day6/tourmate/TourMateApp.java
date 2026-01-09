package com.day6.tourmate;

public class TourMateApp
{
	public static void main(String[] args) 
	{
		
        Transport flight = new Transport(45000); 
        Hotel resort = new Hotel(5000, 5);     
        Activity sightseeing = new Activity("Eiffel Tower Visit", 3000, 1000);

        InternationalTrip trip1 = new InternationalTrip("Paris", flight, resort, sightseeing);
        
        trip1.displayPackage();					
        trip1.book();          
        
        System.out.println("------------------------------------");

     
        Transport bus = new Transport(2000);
        Hotel cottage = new Hotel(1500, 3);
        Activity trekking = new Activity("Solang Valley Trek", 500, 200);

        DomesticTrip trip2 = new DomesticTrip("Manali", bus, cottage, trekking);
        
        trip2.displayPackage();
        trip2.book();               
	    trip2.cancel();
	    }
}
