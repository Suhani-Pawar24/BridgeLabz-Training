package com.inheritance.basicproblems.animalhierarchy;

public class Animal {
	
		private String name;
		private int age;
		
		public Animal(String name, int age )
		{
			this.name = name;
			this.age = age;
		}
		
		public void makeSound()
		{
			System.out.println("Animals make generic sound ");
		}
	
	

}
