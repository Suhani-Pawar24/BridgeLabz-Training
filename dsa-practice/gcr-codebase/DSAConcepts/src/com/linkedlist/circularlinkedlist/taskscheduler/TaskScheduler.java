package com.linkedlist.circularlinkedlist.taskscheduler;

public class TaskScheduler 
{
	    static class TaskNode
	    {
	        int taskId;
	        String taskName;
	        int priority;
	        String dueDate;
	        TaskNode next;

	        public TaskNode(int taskId, String taskName, int priority, String dueDate)
	        {
	            this.taskId = taskId;
	            this.taskName = taskName;
	            this.priority = priority;
	            this.dueDate = dueDate;
	        }
	    }

	    private TaskNode head = null;
	    private TaskNode tail = null;
	    private TaskNode currentTask = null; // To track current task in execution

	    // 2. Add Task at the End
	    public void addTask(int id, String name, int priority, String date) 
	    {
	        TaskNode newNode = new TaskNode(id, name, priority, date);
	        if (head == null)
	        {
	            head = newNode;
	            tail = newNode;
	            newNode.next = head; // Circular link
	            currentTask = head;
	        }
	        else
	        {
	            tail.next = newNode;
	            tail = newNode;
	            tail.next = head; // Maintaining circularity
	        }
	        System.out.println("Task Added: " + name);
	    }

	    // 3. Remove Task by ID
	    public void removeTask(int id) 
	    {
	        if (head == null) return;

	        TaskNode curr = head, prev = tail;
	        do {
	            if (curr.taskId == id) 
	            {
	                if (curr == head && curr == tail)
	                { // Only one node
	                    head = tail = currentTask = null;
	                }
	                else 
	                {
	                    prev.next = curr.next;
	                    if (curr == head) head = prev.next;
	                    if (curr == tail) tail = prev;
	                    if (currentTask == curr) currentTask = curr.next;
	                }
	                System.out.println("Task ID " + id + " removed.");
	                return;
	            }
	            prev = curr;
	            curr = curr.next;
	        } while (curr != head);
	        
	        System.out.println("Task ID " + id + " not found.");
	    }

	    // 4. Move to Next Task (Scheduling logic)
	    public void executeNextTask() 
	    {
	        if (currentTask == null)
	        {
	            System.out.println("No tasks to execute.");
	            return;
	        }
	        System.out.println("Currently Executing: " + currentTask.taskName + " (Priority: " + currentTask.priority + ")");
	        currentTask = currentTask.next; // Move pointer to next task in circle
	    }

	    // 5. Display All Tasks
	    public void displayTasks()
	    {
	        if (head == null) 
	        {
	            System.out.println("Task list is empty.");
	            return;
	        }
	        TaskNode temp = head;
	        System.out.println("\n--- Current Task Cycle ---");
	        do {
	            System.out.println("ID: " + temp.taskId + " | Name: " + temp.taskName + " | Priority: " + temp.priority);
	            temp = temp.next;
	        } while (temp != head);
	    }

	    public static void main(String[] args) 
	    {
	        TaskScheduler scheduler = new TaskScheduler();

	        scheduler.addTask(1, "Database Backup", 1, "05-01-2026");
	        scheduler.addTask(2, "Email Notifications", 3, "05-01-2026");
	        scheduler.addTask(3, "Security Audit", 2, "06-01-2026");

	        scheduler.displayTasks();

	        System.out.println("\n--- Simulation: Rotating through Tasks ---");
	        scheduler.executeNextTask();
	        scheduler.executeNextTask();
	        scheduler.executeNextTask();
	        scheduler.executeNextTask(); // Will loop back to the first task

	        System.out.println("\nDeleting Task 2...");
	        scheduler.removeTask(2);
	        scheduler.displayTasks();
	    }
}


