package com.day3.campusconnect;
import java.util.ArrayList;
import java.util.List;
public class Course
{
	    String courseName;
	    Faculty instructor;
	    List<Student> enrolledStudents;

	    Course(String courseName, Faculty instructor)
	    {
	        this.courseName = courseName;
	        this.instructor = instructor;
	        this.enrolledStudents = new ArrayList<>();
	    }

	    void addStudent(Student student) 
	    {
	        enrolledStudents.add(student);
	    }
}

	
