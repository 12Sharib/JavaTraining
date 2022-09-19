package assignement01.Answer7.Operations;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class Answer7 {
	static	Scanner sc = new Scanner(System.in);
	
	public void saveEvenNumbers(int number)  {
		Vector<Integer> even = new Vector<Integer>();
		
		for(int i=2;i<number;i++) {
			if(i%2==0) {
				even.add(i);
			}
		}
		
	
	multiplyBytwo(even);
	searchNumber(even);
		
	}
	void multiplyBytwo(Vector even) {
		Vector<Integer> mul = new Vector<Integer>();
		Iterator it = even.iterator();
		while(it.hasNext()) {
			Object value = it.next();
			int xy = (Integer)value * 2;
			mul.add(xy);
		}
		printEvenNumbers(mul);
	}
	void printEvenNumbers(Vector even)  {
		Iterator it = even.iterator();
	
		System.out.print("Multiply By Two : ");
		while(it.hasNext()) {
			Object value = it.next();
			System.out.print(value + " ");
			
		}
		System.out.println();
	}
	void searchNumber(Vector even) {
		System.out.print("Enter the Number want to search in Array1: ");
		Integer searchingNumber = sc.nextInt();
		
		Iterator it = even.iterator();
		int temp = 0;
		while(it.hasNext()) {
			Integer value = (Integer)it.next();
			
			if(value == searchingNumber) {
				temp++;
				break;
			}
		}
		if(temp > 0) {	System.out.println("Number is found: " + searchingNumber);	}
		else {	System.out.println("not found");	}
		
		System.out.println(even);
	}
	
}
