package assignement01.Answer6.Operations;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Operations {
	static	Scanner sc = new Scanner(System.in);
	
	public void saveEvenNumbers(Integer number)  {
		List<Integer> even = new LinkedList<Integer>();
		
		for(int i=2;i<number;i++) {
			if(i%2==0) {
				even.add(i);
			}
		}
		
	
	multiplyBytwo(even);
	searchNumber(even);
		
	}
	void multiplyBytwo(List even) {
		LinkedList<Integer> mul = new LinkedList<Integer>();
		Iterator it = even.iterator();
		while(it.hasNext()) {
			Object value = it.next();
			Integer xy = (Integer)value * 2;
			mul.add(xy);
		}
		printEvenNumbers(mul);
	}
	void printEvenNumbers(List even)  {
		Iterator it = even.iterator();
	
		System.out.print("Multiply By Two : ");
		while(it.hasNext()) {
			Object value = it.next();
			System.out.print(value + " ");
			
		}
		System.out.println();
	}
	void searchNumber(List even) {
		System.out.print("Enter the Number want to search in Array1: ");
		Integer searchingNumber = sc.nextInt();
		
		Iterator it = even.iterator();
		Integer temp = 0;
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
