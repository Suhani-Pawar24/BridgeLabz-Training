package com.day4.petpal;

public abstract class Pet 
{
	protected String name;
	protected String type;
	protected int age;
	
	private int hunger;
	private int energy;
	
	public Pet(String name,String type,int age)
	{
		this.name = name;
		this.type = type;
		this.age = age;
	}
	
	public Pet(String name,String type,int age, int hunger, int energy)
	{
		this.name = name;
		this.type = type;
		this.age = age;
		this.hunger = (int) (Math.random() * 50); 
        this.energy = 100;
	}
	
	public abstract void makeSound();
	  
	protected void adjustEnergy(int amount) 
	{
        this.energy += amount;
        if (this.energy > 100) 
        	this.energy = 100;
    }
	
	protected void adjustHunger(int amount) {
	    this.hunger += amount;
	    if (this.hunger < 0) this.hunger = 0;
	    if (this.hunger > 100) this.hunger = 100;
	}

	public void displayStats()
	{
        System.out.println("\n--- " + name + "'s Status ---");
        System.out.println("Type: " + type + " | Age: " + age);
        System.out.println("Hunger: " + hunger + "/100 | Energy: " + energy + "/100");
    }

}
