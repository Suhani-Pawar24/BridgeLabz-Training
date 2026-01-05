package com.linkedlist.circularlinkedlist.roundrobinschedulingalgorithm;

public class RoundRobinScheduler 
{
	 static class ProcessNode 
	 {
	        int pid;
	        int burstTime;
	        int remainingTime;
	        int priority;
	        int arrivalTime;
	        int completionTime, turnAroundTime, waitingTime;
	        ProcessNode next;

	        public ProcessNode(int pid, int burstTime, int priority) 
	        {
	            this.pid = pid;
	            this.burstTime = burstTime;
	            this.remainingTime = burstTime;
	            this.priority = priority;
	        }
	    }

	    private ProcessNode head = null;
	    private ProcessNode tail = null;
	    private int size = 0;

	    // 1. Add Process to Circular List
	    public void addProcess(int pid, int burstTime, int priority) 
	    {
	        ProcessNode newNode = new ProcessNode(pid, burstTime, priority);
	        if (head == null)
	        {
	            head = tail = newNode;
	            newNode.next = head;
	        } 
	        else 
	        {
	            tail.next = newNode;
	            tail = newNode;
	            tail.next = head; // Circular link
	        }
	        size++;
	    }

	    // 2. Simulate Round Robin Scheduling
	    public void simulate(int timeQuantum) 
	    {
	        if (head == null) return;

	        int currentTime = 0;
	        int completedCount = 0;
	        ProcessNode current = head;
	        ProcessNode prev = tail;

	        System.out.println("\n--- Execution Timeline ---");
	        
	        while (completedCount < size)
	        {
	            if (current.remainingTime > 0) 
	            {
	                int executeTime = Math.min(current.remainingTime, timeQuantum);
	                System.out.println("Time " + currentTime + ": Process P" + current.pid + " executing for " + executeTime + "ms");
	                
	                current.remainingTime -= executeTime;
	                currentTime += executeTime;

	                // If process finishes
	                if (current.remainingTime == 0) 
	                {
	                    completedCount++;
	                    current.completionTime = currentTime;
	                    current.turnAroundTime = current.completionTime; // Assuming Arrival Time = 0
	                    current.waitingTime = current.turnAroundTime - current.burstTime;
	                    System.out.println(">> Process P" + current.pid + " Finished at " + currentTime + "ms");
	                }
	            }
	            // Move to next process in circle
	            prev = current;
	            current = current.next;
	        }
	        displayStats();
	    }

	    // 3. Display Average Waiting and Turn-around Time
	    public void displayStats() 
	    {
	        double totalWT = 0, totalTAT = 0;
	        ProcessNode temp = head;
	        System.out.println("\n--- Process Statistics ---");
	        System.out.println("PID\tBurst\tWaiting\tTurnaround");
	        
	        for (int i = 0; i < size; i++)
	        {
	            totalWT += temp.waitingTime;
	            totalTAT += temp.turnAroundTime;
	            System.out.println("P" + temp.pid + "\t" + temp.burstTime + "\t" + temp.waitingTime + "\t" + temp.turnAroundTime);
	            temp = temp.next;
	        }

	        System.out.println("\nAverage Waiting Time: " + (totalWT / size) + "ms");
	        System.out.println("Average Turnaround Time: " + (totalTAT / size) + "ms");
	    }

	    public static void main(String[] args)
	    {
	        RoundRobinScheduler scheduler = new RoundRobinScheduler();

	        // Adding sample processes (PID, Burst Time, Priority)
	        scheduler.addProcess(1, 10, 1);
	        scheduler.addProcess(2, 5, 2);
	        scheduler.addProcess(3, 8, 1);

	        int timeQuantum = 3;
	        System.out.println("Time Quantum: " + timeQuantum + "ms");
	        
	        scheduler.simulate(timeQuantum);
	    }
}


