package com.constructor.level1;

public class Circle {
	
	private double radius;
	
	Circle()
	{
		this(1.0);
	}
	
	Circle(double radius)
	{
		this.radius = radius;
	}
	
	void display()
	{
		System.out.println("Radius :" + radius);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle obj1 = new Circle();
		obj1.display();
		
		Circle obj2 = new Circle(5.0);
		obj2.display();

	}

}
