package com.objectmodeling.Libraryandbooks;
import java.util.ArrayList;
class Library
{
    private String name;
    private ArrayList<Books> books;

    public Library(String name)
    {
        this.name = name;
        books = new ArrayList<>();
    }

    public void addBook(Books book) 
    {
        books.add(book);
    }

    public void showBooks()
    {
        System.out.println("Library: " + name);
        for (Books b : books) 
        {
            System.out.println(" - " + b.getDetails());
        }
    }
}
