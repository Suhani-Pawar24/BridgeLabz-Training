package com.encapsulation.librarymanagement;

public abstract class LibraryItem 
{
		private int itemId;
		private String title;
		private String author;
		
		LibraryItem(int itemId,String title,String author)
		{
			this.itemId  = itemId;
			this.title  = title;
			this.author = author;
			
		}
		
		abstract String getLoanDuration();
		
		void display()
		{
			System.out.println("Title     :"+title);
			System.out.println("Author    :"+author);	
		}
		
}


