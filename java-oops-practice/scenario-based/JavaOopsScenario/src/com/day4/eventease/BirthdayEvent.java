package com.day4.eventease;

 class BirthdayEvent extends EventClass 
 {

     BirthdayEvent(String location, String date, int attendees, UserClass organizer) 
     {
         super("Birthday Party", location, date, attendees, organizer, 1500, 5000, 2000);
     }

     @Override
     public void schedule()
     {
         System.out.println("Birthday event scheduled with cake & decoration package.");
     }

     @Override
     public void reschedule(String newDate) 
     {
         this.date = newDate;
         System.out.println("Birthday event rescheduled to " + newDate);
     }

     @Override
     public void cancel()
     {
         System.out.println("Birthday event cancelled. Partial refund applicable.");
     }
}