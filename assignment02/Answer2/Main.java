package assignment02.Answer2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Operations op = new Operations();
		
		Scanner sc = new Scanner(System.in);
		List<Customer> list = new ArrayList<Customer>();
		
		list.add(new Customer("Rajan Patil", "Aundh", 1, "Phone Cover", 170, "Cash"));
		list.add(new Customer( "Gupta", "Baner", 1, "Samsung Battery", 900, "Credit Card"));
		list.add(new Customer(" Patil", "Aundh", 3, "Samsung Battery", 1000, "Cash"));
		list.add(new Customer(" Kothari", "Baner", 4, "Earphones", 500, "Credit Card"));
		list.add(new Customer("T Sunitha", "Shivajinagar", 5, "Earphones",550, "Credit Card"));
		list.add(new Customer("Rohan Gade", "Aundh", 10, "Motorola Battery", 1000, "Credit Card"));
		list.add(new Customer("Rajan Patil", "Shivajinagar", 21, "Earphones", 550, "Credit Card"));
		list.add(new Customer("Rajan Patil", "Aundh", 22, "USB Cable",150, "UPI"));
		list.add(new Customer("Meena Kothari", "Baner", 23, "USB Cable",100, "Cash"));
		list.add(new Customer("Nina Kothari", "Baner", 24, "USB Cable",200, "UPI"));
		list.add(new Customer("Mohit Gupta", "Baner", 25, "USB Cable",50, "UPI"));
	
		System.out.print("Enter the productName for find which person buy on discounted price : ");
		String productName = sc.nextLine();
		
		Integer discountedPrice = op.productPrice(list, productName);
		//System.out.println(discountedPrice);
		
		op.printOperations(list, discountedPrice);
	
	}

}
