package com.day4.petpal;

 class Dog extends Pet implements IInteractable 
{
	    public Dog(String name,String type, int age) 
	    {
	       super(name,type,age);
	    }

	    @Override
	    public void makeSound() 
	    {
	        System.out.println(name + " says: Woof! Woof!");
	    }

	    @Override
	    public void feed() 
	    {
	        System.out.println("Feeding " + name + " some dog treats...");
	        adjustHunger(-20); 
	    }

	    @Override
	    public void play()
	    {
	        System.out.println(name + " is fetching the ball!");
	        adjustEnergy(-15); 
	        adjustHunger(10); 
	    }

	    @Override
	    public void sleep() 
	    {
	        System.out.println(name + " is sleeping in the kennel...");
	        adjustEnergy(30);
	    }
}




