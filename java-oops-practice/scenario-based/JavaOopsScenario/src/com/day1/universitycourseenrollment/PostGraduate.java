package com.day1.universitycourseenrollment;

public class PostGraduate extends Student
{
		private String researchTopic;

	    public PostGraduate(String id, String name, String topic) 
	    {
	        super(id, name);
	        this.researchTopic = topic;
	        this.studentType = "PG";
	    }

	    @Override
	    public void displayRole() 
	    {
	        System.out.println("[Postgraduate] " + getName() + " | Research: " + researchTopic);
	    }
}


