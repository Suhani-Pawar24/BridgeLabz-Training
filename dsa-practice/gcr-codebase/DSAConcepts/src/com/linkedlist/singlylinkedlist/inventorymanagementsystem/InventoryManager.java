package com.linkedlist.singlylinkedlist.inventorymanagementsystem;

public class InventoryManager 
{

	    // 1. Node Structure
	    static class ItemNode 
	    {
	        String itemName;
	        int itemId;
	        int quantity;
	        double price;
	        ItemNode next;

	        public ItemNode(String itemName, int itemId, int quantity, double price) 
	        {
	            this.itemName = itemName;
	            this.itemId = itemId;
	            this.quantity = quantity;
	            this.price = price;
	            this.next = null;
	        }
	    }

	    private ItemNode head = null;

	    // 2. Add Item at the End
	    public void addItem(String name, int id, int qty, double price)
	    {
	        ItemNode newNode = new ItemNode(name, id, qty, price);
	        if (head == null)
	        {
	            head = newNode;
	        }
	        else 
	        {
	            ItemNode temp = head;
	            while (temp.next != null) temp = temp.next;
	            temp.next = newNode;
	        }
	    }

	    // 3. Remove Item by ID
	    public void removeItem(int id)
	    {
	        if (head == null) return;
	        if (head.itemId == id)
	        {
	            head = head.next;
	            return;
	        }
	        ItemNode temp = head;
	        while (temp.next != null && temp.next.itemId != id) 
	        {
	            temp = temp.next;
	        }
	        if (temp.next != null) temp.next = temp.next.next;
	    }

	    // 4. Calculate Total Inventory Value
	    public void calculateTotalValue() 
	    {
	        double totalValue = 0;
	        ItemNode temp = head;
	        while (temp != null) 
	        {
	            totalValue += (temp.price * temp.quantity);
	            temp = temp.next;
	        }
	        System.out.println("Total Inventory Value: ₹" + totalValue);
	    }

	    // 5. Sorting by Item Name (Bubble Sort Logic for Linked List)
	    public void sortByName() 
	    {
	        if (head == null || head.next == null) return;
	        boolean swapped;
	        do {
	            swapped = false;
	            ItemNode current = head;
	            while (current.next != null) 
	            {
	                if (current.itemName.compareToIgnoreCase(current.next.itemName) > 0) 
	                {
	                    // Swap Data
	                    String tempName = current.itemName;
	                    int tempId = current.itemId;
	                    int tempQty = current.quantity;
	                    double tempPrice = current.price;

	                    current.itemName = current.next.itemName;
	                    current.itemId = current.next.itemId;
	                    current.quantity = current.next.quantity;
	                    current.price = current.next.price;

	                    current.next.itemName = tempName;
	                    current.next.itemId = tempId;
	                    current.next.quantity = tempQty;
	                    current.next.price = tempPrice;
	                    swapped = true;
	                }
	                current = current.next;
	            }
	        } while (swapped);
	        System.out.println("Inventory Sorted by Name.");
	    }

	    // 6. Display All Items
	    public void displayInventory() 
	    {
	        ItemNode temp = head;
	        System.out.println("\n--- Current Inventory ---");
	        while (temp != null)
	        {
	            System.out.println("ID: " + temp.itemId + " | Name: " + temp.itemName + 
	                               " | Qty: " + temp.quantity + " | Price: ₹" + temp.price);
	            temp = temp.next;
	        }
	    }

	    public static void main(String[] args) 
	    {
	        InventoryManager im = new InventoryManager();

	        im.addItem("Laptop", 101, 10, 55000);
	        im.addItem("Mouse", 105, 50, 800);
	        im.addItem("Keyboard", 103, 30, 1500);

	        im.displayInventory();
	        im.calculateTotalValue();

	        im.sortByName();
	        im.displayInventory();

	        System.out.println("\nRemoving Item 105 (Mouse)...");
	        im.removeItem(105);
	        im.displayInventory();
	        im.calculateTotalValue();
	    }
}


