package com.linkedList;

public class DeleteElementLinkedList {
	 
	    Node head; 
	    class Node 
	    { 
	        int data; 
	        Node next; 
	        Node(int d) 
	        { 
	            data = d; 
	            next = null; 
	        } 
	    } 
	  
	    public void insert(int new_data) 
	    { 
	      
	        Node newNode = new Node(new_data); 
	        newNode.next = head; 
	        head = newNode; 
	    } 
	  

	    void deleteNode(int position) 
	    { 
	       
	        if (head == null) 
	            return; 
	  
	        Node temp = head; 

	        if (position == 0) 
	        { 
	            head = temp.next;   
	            return; 
	        } 
	  
	        for (int i=0; temp!=null && i<position-1; i++) 
	            temp = temp.next; 
	
	        if (temp == null || temp.next == null) 
	            return; 
	  
	        Node next = temp.next.next; 
	  
	        temp.next = next;  
	    } 
	  
	
	    public void print() 
	    { 
	        Node node = head; 
	        while (node != null) 
	        { 
	            System.out.print(node.data+" "); 
	            node = node.next; 
	        } 
	    } 
	  
	    
	    public static void main(String[] args) 
	    { 
	    	DeleteElementLinkedList list = new DeleteElementLinkedList(); 
	  
	    	list.insert(7); 
	    	list.insert(1); 
	    	list.insert(3); 
	    	list.insert(2); 
	        list.insert(8); 
	        list.deleteNode(2);  
	  
	        System.out.println(" List after Deletion from index 2: "); 
	        list.print(); 
	    } 
	} 


