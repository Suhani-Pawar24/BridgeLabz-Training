package com.day3.campusconnect;

public class TestCampusConnect
{
	    public static void main(String[] args) 
	    {
	        double[] s1Grades = {3.5, 4.0, 3.8};
	        Student s1 = new Student("Alice", "alice@univ.edu", "F101", s1Grades);
	        Faculty f1 = new Faculty("Dr. Smith", "smith@univ.edu", "F202", "Computer Science");

	        s1.printDetails();
	        f1.printDetails();
	    }
}


