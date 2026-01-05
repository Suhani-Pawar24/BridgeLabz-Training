package com.linkedlist.doublylinkedlist.moviemanagementsystem;

public class MovieManagement 
{
	
	    static class MovieNode 
	    {
	        String title;
	        String director;
	        int year;
	        double rating;
	        
	        MovieNode next;
	        MovieNode prev;

	        public MovieNode(String title, String director, int year, double rating)
	        {
	            this.title = title;
	            this.director = director;
	            this.year = year;
	            this.rating = rating;
	        }
	    }

	    private MovieNode head = null;
	    private MovieNode tail = null;

	   
	    public void addMovie(String title, String director, int year, double rating) 
	    {
	        MovieNode newNode = new MovieNode(title, director, year, rating);
	        if (head == null) 
	        {
	            head = tail = newNode;
	        } 
	        else
	        {
	            tail.next = newNode;
	            newNode.prev = tail;
	            tail = newNode;
	        }
	        System.out.println("Movie added: " + title);
	    }

	    
	    public void removeMovie(String title) 
	    {
	        MovieNode current = head;
	        while (current != null) 
	        {
	            if (current.title.equalsIgnoreCase(title)) 
	            {
	                // If it's the only node
	                if (current == head && current == tail)
	                {
	                    head = tail = null;
	                } 
	                // If it's the head node
	                else if (current == head)
	                {
	                    head = head.next;
	                    head.prev = null;
	                } 
	                // If it's the tail node
	                else if (current == tail)
	                {
	                    tail = tail.prev;
	                    tail.next = null;
	                } 
	                
	                else 
	                {
	                    current.prev.next = current.next;
	                    current.next.prev = current.prev;
	                }
	                System.out.println("Removed: " + title);
	                return;
	            }
	            current = current.next;
	        }
	        System.out.println("Movie not found: " + title);
	    }

	   
	    public void updateRating(String title, double newRating) 
	    {
	        MovieNode current = head;
	        while (current != null) 
	        {
	            if (current.title.equalsIgnoreCase(title)) 
	            {
	                current.rating = newRating;
	                System.out.println("Updated rating for " + title);
	                return;
	            }
	            current = current.next;
	        }
	    }

	   
	    public void displayForward() 
	    {
	        System.out.println("\n--- Movies (Forward) ---");
	        MovieNode current = head;
	        while (current != null)
	        {
	            System.out.println(current.title + " | " + current.director + " | " + current.rating);
	            current = current.next;
	        }
	    }

	    
	    public void displayReverse() 
	    {
	        System.out.println("\n--- Movies (Reverse) ---");
	        MovieNode current = tail;
	        while (current != null) 
	        {
	            System.out.println(current.title + " | " + current.director + " | " + current.rating);
	            current = current.prev;
	        }
	    }

	    public static void main(String[] args) 
	    {
	        MovieManagement list = new MovieManagement();

	        list.addMovie("Inception", "Christopher Nolan", 2010, 8.8);
	        list.addMovie("The Matrix", "Wachowskis", 1999, 8.7);
	        list.addMovie("Interstellar", "Christopher Nolan", 2014, 8.6);

	        list.displayForward();
	        
	        System.out.println("\nUpdating 'The Matrix' rating...");
	        list.updateRating("The Matrix", 9.0);

	        list.displayReverse();

	        System.out.println("\nDeleting 'Inception'...");
	        list.removeMovie("Inception");

	        list.displayForward();
	    }
}


