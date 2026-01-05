package com.day1.universitycourseenrollment;

public class UnderGraduate extends Student
{
		
	public UnderGraduate(String id, String name)
	{
	        super(id, name);
	        this.studentType = "UG";
	}

	    @Override
	    public void displayRole() 
	    {
	        System.out.println("[Undergraduate] " + getName());
	    }
}


