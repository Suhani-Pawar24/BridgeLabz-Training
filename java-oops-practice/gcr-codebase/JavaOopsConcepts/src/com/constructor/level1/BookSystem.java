package com.constructor.level1;

public class BookSystem {
	
	String title;
	String author;
	double price;
	boolean availability;
	
	BookSystem(String title, String author, double price, boolean availability)
	{
		this.title = title;
		this.author = author;
		this.price = price;
		this.availability = availability;
	}
	
	void borrowBook() 
	{
		if(availability)
		{
			availability = false;
			System.out.println("Book borrowed");
		}
		else
		{
			System.out.println("Book already borrowed");
		}
	}
	void display()
	{
		System.out.println("Title : "+title);
		System.out.println("Author : "+author);
		System.out.println("Price : "+price);
		System.out.println("Availability :"+availability);
	}
	public static void main(String[] args)
	{
		BookSystem obj1 = new BookSystem("One Arranged Murder", "Chetan Bhagat", 200, false);
		obj1.display();
		obj1.borrowBook();
	}

}
