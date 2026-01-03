package com.inheritance.heirarchicalinheritance.schoolsystem;

public class TestSchoolSystem 
{
	    public static void main(String[] args) 
	    {
	        Teacher teacher = new Teacher("Mr. Sharma", 45, "Mathematics");
	        Student student = new Student("Aryan", 16, "10th Grade");
	        Staff staff = new Staff("Mrs. Verma", 38, "Administration");

	        System.out.println("--- School Directory ---\n");
	        
	        teacher.displayRole();
	        System.out.println("------------------------");
	        
	        student.displayRole();
	        System.out.println("------------------------");
	        
	        staff.displayRole();
	    }
}


