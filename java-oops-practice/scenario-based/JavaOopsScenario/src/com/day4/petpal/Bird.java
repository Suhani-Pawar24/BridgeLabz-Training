package com.day4.petpal;

public class Bird extends Pet implements IInteractable 
{
	    
	    public Bird(String name,String type, int age) 
	    {
	       super(name,type,age);
	    }

	    @Override
	    public void makeSound()
	    {
	        
	        System.out.println(name + " says: Chirp! Chirp!");
	    }

	    @Override
	    public void feed()
	    {
	        System.out.println("Giving seeds and water to " + name + "...");
	        adjustHunger(-10); 
	    }

	    @Override
	    public void play()
	    {
	        System.out.println(name + " is flying around the room!");
	        adjustEnergy(-25); 
	        adjustHunger(15);  
	    }

	    @Override
	    public void sleep() 
	    {
	        System.out.println(name + " is resting on its perch...");
	        adjustEnergy(50);
	    }
}


