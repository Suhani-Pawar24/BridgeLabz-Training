package com.day4.edumentor;

public class Learner extends User implements ICertifiable
{
	public Learner(String name, String email, String userId)
	{
		super(name, email, userId);
	}
	
	public void generateCertificate(String courseType)
	{
		if (courseType.equalsIgnoreCase("Full-Time"))
		{
			System.out.println("Certificated Generated : "+name);
		}
		else
		{
			System.out.println("Ceritificate Generated for Short-courses : "+name);
		}
	}

}

