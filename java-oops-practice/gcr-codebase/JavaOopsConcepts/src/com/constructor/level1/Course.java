package com.constructor.level1;

public class Course {
	
	String courseName;
	int duration;
	double fee;
	static String instituteName = "TIT Institute";
	
	
	Course(String courseName, int duration, double fee)
	{
		this.courseName = courseName;
		this.duration = duration;
		this.fee = fee;
	}
	
	void displayCourseDetails()
	{
		System.out.println(courseName + "|" + duration + "weeks | " + fee);
	}
	
	static void updateInstitueName(String name)
	{
		instituteName = name;
	}
	
	public static void main(String[] args)
	{
		Course obj = new Course("B.SC",3,30000.0);
		obj.displayCourseDetails();
		Course.updateInstitueName("RICR Institute");
	}
	

}
