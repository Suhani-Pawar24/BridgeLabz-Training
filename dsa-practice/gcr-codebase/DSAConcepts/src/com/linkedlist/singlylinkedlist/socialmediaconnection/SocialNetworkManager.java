package com.linkedlist.singlylinkedlist.socialmediaconnection;
import java.util.ArrayList;
import java.util.List;
public class SocialNetworkManager 
{

	    // 1. Node for the Friend List (Nested Linked List)
	    static class FriendNode 
	    {
	        int friendId;
	        FriendNode next;

	        public FriendNode(int friendId)
	        {
	            this.friendId = friendId;
	            this.next = null;
	        }
	    }

	    // 2. Node for the User (Main Linked List)
	    static class UserNode 
	    {
	        int userId;
	        String name;
	        int age;
	        FriendNode friendsHead; // Head of the nested friend list
	        UserNode next;

	        public UserNode(int userId, String name, int age)
	        {
	            this.userId = userId;
	            this.name = name;
	            this.age = age;
	            this.friendsHead = null;
	            this.next = null;
	        }
	    }

	    private UserNode head = null;

	    // 3. Add a new user to the network
	    public void addUser(int id, String name, int age) 
	    {
	        UserNode newUser = new UserNode(id, name, age);
	        if (head == null) 
	        {
	            head = newUser;
	        } 
	        else 
	        {
	            UserNode temp = head;
	            while (temp.next != null) temp = temp.next;
	            temp.next = newUser;
	        }
	    }

	    // 4. Find a User Node by ID (Helper Method)
	    private UserNode findUser(int id)
	    {
	        UserNode temp = head;
	        while (temp != null) 
	        {
	            if (temp.userId == id) return temp;
	            temp = temp.next;
	        }
	        return null;
	    }

	    // 5. Add Friend Connection (Bidirectional)
	    public void addFriendship(int id1, int id2) 
	    {
	        UserNode u1 = findUser(id1);
	        UserNode u2 = findUser(id2);

	        if (u1 != null && u2 != null) 
	        {
	            u1.friendsHead = addFriendToList(u1.friendsHead, id2);
	            u2.friendsHead = addFriendToList(u2.friendsHead, id1);
	            System.out.println("Friendship added between " + u1.name + " and " + u2.name);
	        }
	    }

	    private FriendNode addFriendToList(FriendNode head, int friendId)
	    {
	        FriendNode newNode = new FriendNode(friendId);
	        if (head == null) return newNode;
	        FriendNode temp = head;
	        while (temp.next != null) temp = temp.next;
	        temp.next = newNode;
	        return head;
	    }

	    // 6. Display Friends of a User
	    public void displayFriends(int userId) 
	    {
	        UserNode user = findUser(userId);
	        if (user == null) return;

	        System.out.print("Friends of " + user.name + ": ");
	        FriendNode temp = user.friendsHead;
	        if (temp == null) System.out.print("No friends yet.");
	        while (temp != null)
	        {
	            UserNode friendInfo = findUser(temp.friendId);
	            System.out.print((friendInfo != null ? friendInfo.name : "Unknown") + " ");
	            temp = temp.next;
	        }
	        System.out.println();
	    }

	    // 7. Find Mutual Friends
	    public void findMutualFriends(int id1, int id2) 
	    {
	        UserNode u1 = findUser(id1);
	        UserNode u2 = findUser(id2);

	        if (u1 == null || u2 == null) return;

	        System.out.print("Mutual Friends of " + u1.name + " and " + u2.name + ": ");
	        FriendNode f1 = u1.friendsHead;
	        boolean found = false;

	        while (f1 != null)
	        {
	            FriendNode f2 = u2.friendsHead;
	            while (f2 != null)
	            {
	                if (f1.friendId == f2.friendId) 
	                {
	                    UserNode mutual = findUser(f1.friendId);
	                    System.out.print(mutual.name + " ");
	                    found = true;
	                }
	                f2 = f2.next;
	            }
	            f1 = f1.next;
	        }
	        if (!found) System.out.print("None");
	        System.out.println();
	    }

	    public static void main(String[] args) 
	    {
	        SocialNetworkManager sn = new SocialNetworkManager();

	        // Adding Users
	        sn.addUser(1, "Suhani", 25);
	        sn.addUser(2, "Neha", 28);
	        sn.addUser(3, "Aditya", 24);
	        sn.addUser(4, "David", 26);

	        // Establishing Connections
	        sn.addFriendship(1, 2);
	        sn.addFriendship(1, 3);
	        sn.addFriendship(4, 2); 
	        sn.addFriendship(4, 3); 

	        System.out.println();
	        sn.displayFriends(1);
	        sn.displayFriends(4);

	      
	        sn.findMutualFriends(1, 4);
	    }
}


