package com.day4.eventease;

public class ConferenceEvent extends EventClass 
{

	    ConferenceEvent(String location, String date, int attendees, UserClass organizer) {
	        super("Conference", location, date, attendees, organizer, 50000, 20000, 5000);
	    }

	    @Override
	    public void schedule() 
	    {
	        System.out.println("Conference scheduled with AV & catering services.");
	    }

	    @Override
	    public void reschedule(String newDate) 
	    {
	        this.date = newDate;
	        System.out.println("Conference rescheduled to " + newDate);
	    }

	    @Override
	    public void cancel()
	    {
	        System.out.println("Conference cancelled. Cancellation charges applied.");
	    }
}


