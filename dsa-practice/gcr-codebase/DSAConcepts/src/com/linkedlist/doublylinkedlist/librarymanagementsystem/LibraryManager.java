package com.linkedlist.doublylinkedlist.librarymanagementsystem;

public class LibraryManager 
{

    // 1. Node Structure with Previous and Next pointers
    static class BookNode 
    {
        String title;
        String author;
        String genre;
        int bookId;
        boolean isAvailable;

        BookNode next;
        BookNode prev;

        public BookNode(int bookId, String title, String author, String genre, boolean isAvailable) 
        {
            this.bookId = bookId;
            this.title = title;
            this.author = author;
            this.genre = genre;
            this.isAvailable = isAvailable;
        }
    }

    private BookNode head = null;
    private BookNode tail = null;

    // 2. Add Book at the End
    public void addBook(int id, String title, String author, String genre, boolean available)
    {
        BookNode newNode = new BookNode(id, title, author, genre, available);
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
        System.out.println("Book Added: " + title);
    }

    // 3. Remove Book by ID
    public void removeBook(int id)
    {
        if (head == null) return;

        BookNode current = head;
        while (current != null) 
        {
            if (current.bookId == id) 
            {
                if (current == head)
                {
                    head = head.next;
                    if (head != null) head.prev = null;
                    else tail = null; // List became empty
                } 
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
                System.out.println("Book ID " + id + " removed.");
                return;
            }
            current = current.next;
        }
        System.out.println("Book ID " + id + " not found.");
    }

    // 4. Update Availability
    public void updateStatus(int id, boolean status)
    {
        BookNode current = head;
        while (current != null)
        {
            if (current.bookId == id) 
            {
                current.isAvailable = status;
                System.out.println("Status updated for: " + current.title);
                return;
            }
            current = current.next;
        }
    }

    // 5. Display Forward and Reverse
    public void displayBooks(boolean reverse) 
    {
        if (head == null) 
        {
            System.out.println("Library is empty.");
            return;
        }
        BookNode current = reverse ? tail : head;
        System.out.println(reverse ? "\n--- Books (Reverse Order) ---" : "\n--- Books (Forward Order) ---");
        
        while (current != null) 
        {
            String status = current.isAvailable ? "Available" : "Borrowed";
            System.out.println("ID: " + current.bookId + " | Title: " + current.title + " | Status: " + status);
            current = reverse ? current.prev : current.next;
        }
    }

    // 6. Count Total Books
    public int countBooks() 
    {
        int count = 0;
        BookNode temp = head;
        while (temp != null) 
        {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void main(String[] args) 
    {
        LibraryManager library = new LibraryManager();

        library.addBook(101, "The Alchemist", "Paulo Coelho", "Fiction", true);
        library.addBook(102, "Java Programming", "E. Balagurusamy", "Education", true);
        library.addBook(103, "The Hobbit", "J.R.R. Tolkien", "Fantasy", false);

        library.displayBooks(false); // Forward

        System.out.println("\nTotal Books: " + library.countBooks());

        System.out.println("\nUpdating Status of ID 102...");
        library.updateStatus(102, false);

        library.displayBooks(true); // Reverse

        System.out.println("\nRemoving Book ID 101...");
        library.removeBook(101);
        library.displayBooks(false);
    }
}


