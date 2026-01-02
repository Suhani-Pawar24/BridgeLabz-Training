package com.objectmodeling.Libraryandbooks;

public class AgreegationDemo {
	public static void main(String[] args) {

	        // Independent Book objects
	        Books b1 = new Books("Clean Code", "Robert Martin");
	        Books b2 = new Books("Effective Java", "Joshua Bloch");

	        // Two libraries
	        Library lib1 = new Library("Central Library");
	        Library lib2 = new Library("College Library");

	        // Aggregation: same books added to libraries
	        lib1.addBook(b1);
	        lib1.addBook(b2);

	        lib2.addBook(b1);   // same book, different library

	        lib1.showBooks();
	        lib2.showBooks();
	    }
	}