package com.constructor.level1;

public class Book {
	
	String title;
	String author;
	double price;
	
	Book()
	{
		title = "Unknown";
		author = "Unknown";
		price = 0.0;
	}
	
	Book(String title, String author, double price)
	{
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	void displayDetails()
	{
		System.out.println("Title : "+title);
		System.out.println("Author : "+author);
		System.out.println("Price : "+price);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book obj1 = new Book();
		obj1.displayDetails();
		Book obj2 = new Book("Girl in 105", "Chetan Bhagat" , 300.0);
		obj2.displayDetails();
		

	}

}
