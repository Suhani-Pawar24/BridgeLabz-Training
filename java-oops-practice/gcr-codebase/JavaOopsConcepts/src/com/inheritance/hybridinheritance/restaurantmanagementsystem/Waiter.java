package com.inheritance.hybridinheritance.restaurantmanagementsystem;

public class Waiter extends Person implements Worker
{
		
		Waiter(String name, int id)
		{
			super(name, id);
			// TODO Auto-generated constructor stub
		}

		@Override
	    public void performDuties() 
		{
	        System.out.println("Waiter takes order and serves food");
	    }
}


