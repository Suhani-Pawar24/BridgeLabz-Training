package com.objectmodeling.universityproblem;

public class Department {

	    private String deptName;

	    Department(String deptName)
	    {
	        this.deptName = deptName;
	    }

	    public void showDepartment() 
	    {
	        System.out.println("Department: " + deptName);
	    }
}


