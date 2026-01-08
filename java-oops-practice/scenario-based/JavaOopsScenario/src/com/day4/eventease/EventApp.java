package com.day4.eventease;

public class EventApp
{

	    public static void main(String[] args) {

	        UserClass user = new UserClass("Suhani", "ani@gmail.com");

	        EventClass event1 = new BirthdayEvent("Indore", "15-Feb-2026", 80, user);
	        EventClass event2 = new ConferenceEvent("Bhopal", "10-Mar-2026", 300, user);

	        event1.schedule();
	        event1.showEventDetails();

	        System.out.println();

	        event2.schedule();
	        event2.reschedule("24-Mar-2026");
	        event2.showEventDetails();
	    }
}



