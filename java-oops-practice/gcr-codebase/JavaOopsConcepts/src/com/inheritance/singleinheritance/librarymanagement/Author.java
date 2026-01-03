package com.inheritance.singleinheritance.librarymanagement;

public class Author extends Book{
	
	protected String name;
	protected String bio;
	
	public Author(String title, int publicationYear, String name, String bio)
	{
		super(title,publicationYear);
		this.name = name;
		this.bio = bio;
	}
	
	public void displayInfo()
	{
		System.out.println("Title of the book : " + title);
		System.out.println("Publication Year of the book : " + publicationYear);
		System.out.println("Name of the Author : " +name);
		System.out.println("Bio of the book : "+bio);
	}	
}
