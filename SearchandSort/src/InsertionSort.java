


public class InsertionSort  
{ 
  Node head; 
  Node sort; 

  class Node  
  { 
      int val; 
      Node next; 

      public Node(int val)  
      { 
          this.val = val; 
      } 
  } 

  void push(int val)  
  { 
      
      Node newNode = new Node(val); 
      newNode.next = head; 
      head = newNode; 
  } 

 
  void insertionSort(Node headreference)  
  { 
      Node current = headreference; 
      while (current != null)  
      { 
          Node next = current.next; 
          sortInsert(current);  
          current = next; 
      } 
      head = sort; 
  } 

  void sortInsert(Node newNode)  
  { 

      if (sort == null || sort.val >= newNode.val)  
      { 
          newNode.next = sort; 
          sort = newNode; 
      } 
      else 
      { 
          Node current = sort; 
          while (current.next != null && current.next.val < newNode.val)  
          { 
              current = current.next; 
          } 
          newNode.next = current.next; 
          current.next = newNode; 
      } 
  } 

  void printlist(Node head)  
  { 
      while (head != null)  
      { 
          System.out.print(head.val + " "); 
          head = head.next; 
      } 
  } 
    
  public static void main(String[] args)  
  { 
      InsertionSort list = new InsertionSort(); 
      list.push(10); 
      list.push(25); 
      list.push(5); 
      list.push(2); 
      list.push(30); 
      System.out.println( "before Sorting.."); 
      list.printlist(list.head); 
      list.insertionSort(list.head); 
      System.out.println("After sorting"); 
      list.printlist(list.head); 
  } 
} 
