package com.encapsulation.librarymanagement;

public class Magazine extends LibraryItem implements Reservable
{
	private boolean available  = true;
		
		public Magazine(int itemId,String title,String author)
		{
			super(itemId,title,author);
		}
		String getLoanDuration()
		{
			return "4 days";
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


