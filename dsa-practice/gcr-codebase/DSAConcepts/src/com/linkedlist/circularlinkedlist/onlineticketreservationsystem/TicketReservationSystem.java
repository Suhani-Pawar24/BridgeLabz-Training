package com.linkedlist.circularlinkedlist.onlineticketreservationsystem;

public class TicketReservationSystem
{

	    // 1. Node Structure
	    static class TicketNode 
	    {
	        int ticketId;
	        String customerName;
	        String movieName;
	        String seatNumber;
	        String bookingTime;
	        TicketNode next;

	        public TicketNode(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime)
	        {
	            this.ticketId = ticketId;
	            this.customerName = customerName;
	            this.movieName = movieName;
	            this.seatNumber = seatNumber;
	            this.bookingTime = bookingTime;
	        }
	    }

	    private TicketNode head = null;
	    private TicketNode tail = null;

	    // 2. Add New Ticket at the End
	    public void addTicket(int id, String customer, String movie, String seat, String time) 
	    {
	        TicketNode newNode = new TicketNode(id, customer, movie, seat, time);
	        if (head == null)
	        {
	            head = newNode;
	            tail = newNode;
	            newNode.next = head; // Pointing back to head to make it circular
	        }
	        else 
	        {
	            tail.next = newNode;
	            tail = newNode;
	            tail.next = head; // Last node always points to head
	        }
	        System.out.println("Ticket Booked: ID " + id + " for " + customer);
	    }

	    // 3. Remove Ticket by ID
	    public void removeTicket(int id) 
	    {
	        if (head == null) 
	        {
	            System.out.println("No tickets to cancel.");
	            return;
	        }

	        TicketNode curr = head;
	        TicketNode prev = tail;

	        do {
	            if (curr.ticketId == id)
	            {
	                if (curr == head && curr == tail) 
	                {
	                    // Only one node in the list
	                    head = tail = null;
	                } 
	                else
	                {
	                    prev.next = curr.next;
	                    if (curr == head) head = prev.next;
	                    if (curr == tail) tail = prev;
	                }
	                System.out.println("Ticket ID " + id + " cancelled successfully.");
	                return;
	            }
	            prev = curr;
	            curr = curr.next;
	        } while (curr != head);

	        System.out.println("Ticket ID " + id + " not found.");
	    }

	    // 4. Display All Tickets
	    public void displayTickets()
	    {
	        if (head == null) 
	        {
	            System.out.println("Reservation list is empty.");
	            return;
	        }
	        System.out.println("\n--- Current Ticket Reservations ---");
	        TicketNode temp = head;
	        do {
	            System.out.println("ID: " + temp.ticketId + " | Customer: " + temp.customerName + 
	                               " | Movie: " + temp.movieName + " | Seat: " + temp.seatNumber);
	            temp = temp.next;
	        } while (temp != head);
	    }

	    // 5. Search for Ticket (by Customer or Movie)
	    public void searchTicket(String query) 
	    {
	        if (head == null) return;
	        TicketNode temp = head;
	        boolean found = false;
	        do {
	            if (temp.customerName.equalsIgnoreCase(query) || temp.movieName.equalsIgnoreCase(query)) 
	            {
	                System.out.println("Found: ID " + temp.ticketId + " | Name: " + temp.customerName + " | Movie: " + temp.movieName);
	                found = true;
	            }
	            temp = temp.next;
	        } while (temp != head);
	        
	        if (!found) System.out.println("No reservation found for: " + query);
	    }

	    // 6. Calculate Total Tickets
	    public int getTotalCount()
	    {
	        if (head == null) return 0;
	        int count = 0;
	        TicketNode temp = head;
	        do {
	            count++;
	            temp = temp.next;
	        } while (temp != head);
	        return count;
	    }

	    public static void main(String[] args) 
	    {
	        TicketReservationSystem system = new TicketReservationSystem();

	        system.addTicket(1001, "Amit", "Avatar 2", "A12", "10:30 AM");
	        system.addTicket(1002, "Sana", "Inception", "B05", "01:00 PM");
	        system.addTicket(1003, "Rahul", "Avatar 2", "A13", "10:30 AM");

	        system.displayTickets();

	        System.out.println("\nSearching for 'Avatar 2':");
	        system.searchTicket("Avatar 2");

	        System.out.println("\nTotal Booked: " + system.getTotalCount());

	        System.out.println("\nCancelling Ticket 1002...");
	        system.removeTicket(1002);
	        
	        system.displayTickets();
	    }
}


