package assignment02;

public class Assignment04 {
	Node head; 
	class Node {
	  int data;
	  Node prev;
	  Node next;
	  Node(int d) { data = d; }
	}
	// Adding a node at the front of the list
	public void unshift(int new_data)
	{
	  Node new_Node = new Node(new_data);
	  new_Node.next = head;
	  new_Node.prev = null;
	  if (head != null)
	      head.prev = new_Node;
	  head = new_Node;
	}
	// Add a node at the end of the list
	void push(int new_data)
	{
	  Node new_node = new Node(new_data);
	
	  Node last = head;
	  new_node.next = null;
	  if (head == null) {
	      new_node.prev = null;
	      head = new_node;
	      return;
	  }
	  while (last.next != null)
	      last = last.next;
	  last.next = new_node;
	  new_node.prev = last;
	}
	public void printlist(Node node)
	{
	  Node last = null;
	  while (node != null) {
	      System.out.print(node.data + " ");
	      last = node;
	      node = node.next;
	  }
	  System.out.println();
	}
	void shift(){
	  head=head.next;
	}
	
	void pop(){
	  
	  if(head.next==null){
	      head = null;
	      return;
	  }
	  Node temp = head;
	  while(temp.next.next!=null){
	      temp =temp.next;
	  }
	  temp.next = null;
	}
	
	  public static void main(String[] args)
	{
	  Assignment04 list = new Assignment04();
	  list.push(6);
	  list.unshift(7);
	  list.unshift(1);
	  list.push(4);
	  System.out.println(" Doubly Linkedlist is: ");
	  list.printlist(list.head);
	 
	   list.shift();
	   list.pop();
	  System.out.println("Deleted List");
	  list.printlist(list.head);
	}
}

