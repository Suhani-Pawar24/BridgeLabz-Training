package com.linkedlist.doublylinkedlist.undoredofunctionality;

public class TextEditor
{
	
	    // Node representing a version of the text
	    static class StateNode 
	    {
	        String content;
	        StateNode prev;
	        StateNode next;

	        public StateNode(String content) 
	        {
	            this.content = content;
	        }
	    }

	    private StateNode head = null;
	    private StateNode tail = null;
	    private StateNode currentState = null;
	    private int historySize = 0;
	    private final int MAX_HISTORY = 10;

	    // 1. Save a new state (Triggered on typing)
	    public void saveState(String text) 
	    {
	        // If we type something after an undo, discard the 'redo' history
	        if (currentState != null && currentState.next != null) 
	        {
	            currentState.next = null;
	            tail = currentState;
	            updateHistorySize();
	        }

	        StateNode newNode = new StateNode(text);

	        if (head == null) 
	        {
	            head = tail = currentState = newNode;
	        } 
	        else
	        {
	            tail.next = newNode;
	            newNode.prev = tail;
	            tail = newNode;
	            currentState = newNode;
	        }
	        historySize++;

	        // 2. Limit history size to 10
	        if (historySize > MAX_HISTORY) 
	        {
	            head = head.next;
	            head.prev = null;
	            historySize--;
	        }
	        System.out.println("Saved State: " + text);
	    }

	    // 3. Undo Operation
	    public void undo() 
	    {
	        if (currentState != null && currentState.prev != null) 
	        {
	            currentState = currentState.prev;
	            System.out.println("Action: Undo");
	        } 
	        else 
	        {
	            System.out.println("Error: No more actions to undo.");
	        }
	    }

	    // 4. Redo Operation
	    public void redo() 
	    {
	        if (currentState != null && currentState.next != null) 
	        {
	            currentState = currentState.next;
	            System.out.println("Action: Redo");
	        } 
	        else
	        {
	            System.out.println("Error: No more actions to redo.");
	        }
	    }

	    // 5. Display Current Content
	    public void display() 
	    {
	        if (currentState != null)
	        {
	            System.out.println("Current Editor View: [" + currentState.content + "]");
	        } 
	        else
	        {
	            System.out.println("Editor is empty.");
	        }
	    }

	    private void updateHistorySize() 
	    {
	        int count = 0;
	        StateNode temp = head;
	        while (temp != null)
	        {
	            count++;
	            temp = temp.next;
	        }
	        historySize = count;
	    }

	    public static void main(String[] args) 
	    {
	        TextEditor editor = new TextEditor();

	        // Simulate typing
	        editor.saveState("H");
	        editor.saveState("He");
	        editor.saveState("Hello");
	        editor.saveState("Hello World");
	        
	        editor.display(); // Hello World

	        editor.undo();    // Reverts to "Hello"
	        editor.undo();    // Reverts to "He"
	        editor.display();

	        editor.redo();    // Back to "Hello"
	        editor.display();

	        // Branching: Type something new after undoing
	        editor.saveState("Hello Java"); 
	        editor.redo();    // Error: Redo history was cleared by the new type action
	        editor.display();
	    }
}


