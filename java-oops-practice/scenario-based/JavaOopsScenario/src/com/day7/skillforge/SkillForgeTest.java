package com.day7.skillforge;

public class SkillForgeTest 
{
	    public static void main(String[] args) 
	    {
	        
	        Instructor prof = new Instructor("Dr. Aris", "aris@skillforge.com");
	        Student suhani = new Student("Suhani", "suhani@learning.com");

	       
	        BeginnerCourse javaBasics = new BeginnerCourse("Java 101", prof);
	        suhani.updateProgress(3, javaBasics.getModuleCount());
	        
	        if (suhani.getProgress() == 100.0)
	        {
	            javaBasics.generateCertificate(suhani);
	        } 
	        else
	        {
	            System.out.println(suhani.getName() + " is " + suhani.getProgress() + "% complete.");
	        }

	        System.out.println("----------------------------------");

	      
	        String[] advancedModules = {"Spring Boot", "Microservices", "Docker", "Security"};
	        ProfessionalCourse advJava = new ProfessionalCourse("FullStack Masterclass", prof, advancedModules);
	        
	       
	        suhani.updateProgress(4, advJava.getModuleCount());
	        advJava.generateCertificate(suhani);
	    }
}


