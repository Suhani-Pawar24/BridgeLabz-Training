package com.objectmodeling.Libraryandbooks;

public class Books {
	
	    private String title;
	    private String author;

	    public Books(String title, String author) 
	    {
	        this.title = title;
	        this.author = author;
	    }

	    public String getDetails() {
	        return title + " by " + author;
	    }
	}
