package com.day6.tourmate;

public class InternationalTrip extends Trip
{

    public InternationalTrip(String destination, Transport t, Hotel h, Activity a) {
        super(destination, t, h, a);
    }

    @Override
    public void book() {
        System.out.println("\nBooking International Trip to: " + destination);
        System.out.println(">> Verification: Passport and Visa documents checked.");
        System.out.println(">> Status: Flight and Luxury Hotel reserved successfully!");
    }

    @Override
    public void cancel() {
        System.out.println(">> Cancelled: International trip to " + destination + " cancelled (25% cancellation fee applied).");
    }

}
