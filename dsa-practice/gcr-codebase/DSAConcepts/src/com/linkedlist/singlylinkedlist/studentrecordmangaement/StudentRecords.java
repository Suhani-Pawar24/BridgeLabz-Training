package com.linkedlist.singlylinkedlist.studentrecordmangaement;
import java.util.Scanner;
public class StudentRecords 
{

	    // 1. Node Structure (Data + Pointer)
	    static class StudentNode
	    {
	        int rollNumber;
	        String name;
	        int age;
	        String grade;
	        StudentNode next;

	        public StudentNode(int rollNumber, String name, int age, String grade) 
	        {
	            this.rollNumber = rollNumber;
	            this.name = name;
	            this.age = age;
	            this.grade = grade;
	            this.next = null;
	        }
	    }

	    private StudentNode head = null;

	    // 2. Add Student at the End
	    public void addStudent(int roll, String name, int age, String grade) 
	    {
	        StudentNode newNode = new StudentNode(roll, name, age, grade);
	        if (head == null)
	        {
	            head = newNode;
	        }
	        else
	        {
	            StudentNode temp = head;
	            while (temp.next != null)
	            {
	                temp = temp.next;
	            }
	            temp.next = newNode;
	        }
	        System.out.println("Record added successfully.");
	    }

	    // 3. Delete Student by Roll Number
	    public void deleteStudent(int roll) 
	    {
	        if (head == null)
	        {
	            System.out.println("List is empty.");
	            return;
	        }
	        if (head.rollNumber == roll) 
	        {
	            head = head.next;
	            System.out.println("Record deleted.");
	            return;
	        }
	        StudentNode temp = head;
	        while (temp.next != null && temp.next.rollNumber != roll) 
	        {
	            temp = temp.next;
	        }
	        if (temp.next != null) 
	        {
	            temp.next = temp.next.next;
	            System.out.println("Record deleted.");
	        } else 
	        {
	            System.out.println("Roll Number not found.");
	        }
	    }

	    // 4. Update Student Grade
	    public void updateGrade(int roll, String newGrade) 
	    {
	        StudentNode temp = head;
	        while (temp != null)
	        {
	            if (temp.rollNumber == roll) 
	            {
	                temp.grade = newGrade;
	                System.out.println("Grade updated.");
	                return;
	            }
	            temp = temp.next;
	        }
	        System.out.println("Roll Number not found.");
	    }

	    // 5. Display All Records
	    public void displayAll() 
	    {
	        if (head == null) 
	        {
	            System.out.println("No records found.");
	            return;
	        }
	        StudentNode temp = head;
	        System.out.println("\n--- Student List ---");
	        while (temp != null)
	        {
	            System.out.println("Roll: " + temp.rollNumber + " | Name: " + temp.name + 
	                               " | Age: " + temp.age + " | Grade: " + temp.grade);
	            temp = temp.next;
	        }
	    }

	    // 6. Main Method with Menu
	    public static void main(String[] args) 
	    {
	        StudentRecords manager = new StudentRecords();
	        
	        // Sample Data for testing
	        manager.addStudent(101, "Rahul", 20, "A");
	        manager.addStudent(102, "Sana", 21, "B");
	        manager.addStudent(103, "Aryan", 19, "A+");

	        System.out.println("\nInitial Records:");
	        manager.displayAll();

	        System.out.println("\nUpdating Grade for Roll 101 to 'O'...");
	        manager.updateGrade(101, "O");

	        System.out.println("\nDeleting Roll 102...");
	        manager.deleteStudent(102);

	        manager.displayAll();
	    }
}


