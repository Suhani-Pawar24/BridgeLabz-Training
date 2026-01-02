package com.objectmodeling.universityproblem;
import java.util.ArrayList;

public class University
{
	    private String universityName;
	    private ArrayList<Department> departments;
	    private ArrayList<Faculty> faculties;

	    public University(String universityName) 
	    {
	        this.universityName = universityName;
	        this.departments = new ArrayList<>();
	        this.faculties = new ArrayList<>();
	    }

	    public void addDepartment(String deptName) 
	    {
	        departments.add(new Department(deptName));
	    }

	    public void addFaculty(Faculty faculty)
	    {
	        faculties.add(faculty);
	    }

	    public void showUniversityDetails() 
	    {
	        System.out.println("University: " + universityName);

	        System.out.println("\nDepartments:");
	        for (Department d : departments)
	        {
	            d.showDepartment();
	        }

	        System.out.println("\nFaculty Members:");
	        for (Faculty f : faculties)
	        {
	            f.showFaculty();
	        }
	    }

	 
	    public void deleteUniversity() {
	        departments.clear();  
	        System.out.println("\nUniversity deleted. All departments removed.");
	    }
}

