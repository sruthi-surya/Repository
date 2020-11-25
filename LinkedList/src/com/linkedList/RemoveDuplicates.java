package com.linkedList;

public class RemoveDuplicates { 

Node head = null;  
class Node 
{ 
    
  int val;  
  Node next; 
  Node(int v) 
  { 
      val = v; 
      next = null; 
  } 
} 

public void insert(int data) 
{ 
  Node new_node = new Node(data); 
  new_node.next = head; 
  head = new_node; 
} 

public void removeAllDuplicates() 
{ 

  Node dummy = new Node(0); 
  dummy.next = head; 
  Node prev = dummy; 
  Node current = head; 

  while (current != null) 
  { 
      
      while (current.next != null && 
             prev.next.val == current.next.val) 
             current = current.next; 

      
      if (prev.next == current) 
          prev = prev.next; 

      else
          prev.next = current.next; 

      current = current.next; 
  } 

 
  head = dummy.next; 
} 

public void printList() 
{ 
  Node elems = head; 
  while (elems != null) 
  { 
      System.out.print(elems.val + " "); 
      elems = elems.next; 
  } 
} 


public static void main(String[] args) 
{ 
  RemoveDuplicates ll = new RemoveDuplicates(); 
  ll.insert(1); 
  ll.insert(2); 
  ll.insert(3); 
  ll.insert(3); 
  ll.insert(4); 
  ll.insert(4); 
  ll.insert(5); 
  
  System.out.println("Before"); 
  ll.printList(); 

  ll.removeAllDuplicates(); 

  System.out.println("Removed duplicates"); 
  ll.printList(); 
} 
} 