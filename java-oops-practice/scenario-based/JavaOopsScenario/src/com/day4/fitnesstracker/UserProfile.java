package com.day4.fitnesstracker;

public class UserProfile 
{
	 String name;
	 int age;
	 private double weight;
	 double dailyTarget;
	
	public UserProfile(String name, int age, double weight, double  dailyTarget)
	{
		this.name = name;
		this.age = age;
		this.weight = weight;
		this. dailyTarget =  dailyTarget;
	}
	
	UserProfile(String name , int age, double weight)
	{
		this(name,age,weight,2000.0);
	}
	public double getWeight()
	{
		return weight;
	}
	
}
