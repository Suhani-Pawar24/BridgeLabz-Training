package com.constructor.level1;

public class HotelBooking {
	
	String guestName;
	String roomType;
	int nights;
	
	HotelBooking()
	{
		this("Guest" , "Regular", 1);
	}
	
	HotelBooking(String guestName, String roomType, int nights)
	{
		this.guestName = guestName;
		this.roomType = roomType;
		this.nights = nights;
	}
	
	HotelBooking(HotelBooking hotelBookingCopy)
	{
		this.guestName = hotelBookingCopy.guestName;
		this.roomType = hotelBookingCopy.roomType;
		this.nights = hotelBookingCopy.nights;
	}
	
	public void displayDetails()
	{
		System.out.println("Guest Name : "+guestName);
		System.out.println("Room Type : "+roomType);
		System.out.println("Nights : "+nights);
	}
	
	public static void main(String[] args)
	{
		HotelBooking obj1 = new HotelBooking();
		obj1.displayDetails();
		
		HotelBooking obj2 = new HotelBooking("Raman", "Deluxe", 3);
		obj2.displayDetails();
		
		HotelBooking obj3 = new HotelBooking(obj2);
		obj3.displayDetails();
		
	}

}
