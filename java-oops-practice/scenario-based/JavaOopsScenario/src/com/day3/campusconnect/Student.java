package com.day3.campusconnect;

public class Student extends Person implements ICourseActions
{
	private double[] grades;
	
	Student(String name,String email,String id,double[] grades)
	{
		super(name, email, id);
		this.grades = grades;
	}
	
	public double calculateGPA()
	{
		double sum = 0;
		for (double grade : grades)
		{
			sum += grade;
		}
		return grades.length > 0 ? sum / grades.length : 0.0;
	}
	@Override
    public void enrollCourse(String courseName) 
	{
        System.out.println(name + " enrolled in " + courseName);
    }

    @Override
    public void dropCourse(String courseName)
    {
        System.out.println(name + " dropped " + courseName);
    }

    @Override
    void printDetails() 
    {
        System.out.println("[Student] " + name + " | ID: " + id + " | GPA: " + calculateGPA());
    }
}
