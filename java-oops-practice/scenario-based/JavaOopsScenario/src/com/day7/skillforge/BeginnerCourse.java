package com.day7.skillforge;

public class BeginnerCourse extends Course
{
	    public BeginnerCourse(String title, Instructor instructor)
	    {
	        super(title, instructor);
	    }

	    @Override
	    public void generateCertificate(Student s)
	    {
	        System.out.println("\n[Basic Certificate]");
	        System.out.println("Awarded to: " + s.getName());
	        System.out.println("Course: " + title + " (Introductory Level)");
	    }
	}

	class ProfessionalCourse extends Course 
	{
	    public ProfessionalCourse(String title, Instructor instructor, String[] modules) 
	    {
	        super(title, instructor, modules);
	    }

	    @Override
	    public void generateCertificate(Student s) 
	    {
	     
	        System.out.println("\n[PROFESSIONAL CERTIFICATION]");
	        System.out.println("This certifies that " + s.getName() + " has mastered " + title);
	        System.out.println("Verified by Instructor: " + instructor.name);
	    }
}


