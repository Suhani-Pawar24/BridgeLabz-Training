package com.encapsulation.librarymanagement;

public class LibraryTest 
{
	
		public static void main(String [] args)
		{
		LibraryItem[] lib = new LibraryItem[3];
		
		lib[0] = new Book(101,"Wings of fire","apj abdul kalam");
		lib[1] = new Magazine(102,"Tech Monthly","Tech team");
		lib[2] = new DVD(103,"Inception","Christopher Nolan");
		
		for(LibraryItem l: lib) 
		{
			l.display();
			System.out.println("Loan Duration :"+ l.getLoanDuration());
			
			if(((Reservable) l).checkAvailability()) 
			{
				System.out.println("Available");
			}
			else 
			{
				System.out.println("Not available");
			}
			System.out.println("");
			System.out.println("__________________________________________");
		}
		
		}
		
}


