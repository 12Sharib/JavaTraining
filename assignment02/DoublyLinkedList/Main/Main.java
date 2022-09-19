package assignment02.DoublyLinkedList.Main;

import assignment02.DoublyLinkedList.Operations.Assignment04;

public class Main {
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
