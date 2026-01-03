package com.inheritance.multilevelinheritance.coursedetails;

public class TestCourse 
{
	public static void main(String[] args)
	{
		Course obj1 = new Course("Java",4);
		Course obj2 = new OnlineCourse("C++",3,"online",false);
		Course obj3 = new PaidOnlineCourse("C",2,"offline",true,1000.0,100);
		
		System.out.println("\n---Course Details---");
		obj1.courseDetails();
		
		System.out.println("\n---Course Details---");
		obj2.courseDetails();
		
		System.out.println("\n---Course Details---");
		obj3.courseDetails();
		
	}

}
