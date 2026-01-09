package com.day7.skillforge;

public abstract class Course implements ICertifiable 
{
    protected String title;
    protected Instructor instructor;
    protected String[] modules;
    
    private double rating;
    private int reviewCount;
    
    private String[] internalReviews = {"Great content", "Excellent pace"};

    public Course(String title, Instructor instructor) 
    {
        this.title = title;
        this.instructor = instructor;
        this.modules = new String[]{"Introduction", "Basics", "Conclusion"};
        this.rating = 0.0;
    }

    public Course(String title, Instructor instructor, String[] customModules)
    {
        this(title, instructor);
        this.modules = customModules;
    }

    // Encapsulated rating logic
    protected void addRating(double score)
    {
        this.reviewCount++;
        this.rating = (this.rating + score) / reviewCount;
    }

    public String getTitle()
    {
    	return title;
    }
    public int getModuleCount() 
    {
    	return modules.length;
    }
}


