package com.encapsulation.librarymanagement;

public class Book extends LibraryItem implements Reservable
{
		private boolean available  = true;
		
		public Book(int itemId,String title,String author) 
		{
			super(itemId,title,author);
		}
		String getLoanDuration()
		{
			return "14 days";
		}
		
		public void reserveItem() 
		{
			if(available)
			{
				available  = false;
				System.out.println("Book reserved successfully");
			}
			else 
			{
				System.out.println("Book is already reserved");
			}
		}
		
		public boolean checkAvailability()
		{
			return available;
		}
}


