package com.day4.petpal;

class Cat extends Pet implements IInteractable 
{

	public Cat(String name, String type, int age) 
	{
	    super(name, type, age);
	}

	    @Override
	    public void makeSound() 
	    {
	        System.out.println(name + " says: Meow~");
	    }

	    @Override
	    public void feed()
	    {
	        System.out.println(name + " is eating tuna...");
	        adjustHunger(-15); 
	    }

	    @Override
	    public void play() 
	    {
	        System.out.println(name + " is chasing a laser pointer!");
	        adjustEnergy(-10);
	    }

	    @Override
	    public void sleep() 
	    {
	        System.out.println(name + " is napping on the sofa...");
	        adjustEnergy(40);
	    }
}

