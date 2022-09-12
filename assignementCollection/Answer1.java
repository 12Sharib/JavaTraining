package assignementCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Answer1 {
	static	Scanner sc = new Scanner(System.in);
	
	void saveEvenNumbers(int number)  {
		ArrayList<Integer> even = new ArrayList<Integer>();
		for(int i=2;i<number;i++) {
			if(i%2==0) {
				even.add(i);
			}
		}
		
	
	multiplyBytwo(even);
	searchNumber(even);
		
	}
	void multiplyBytwo(ArrayList even) {
		ArrayList<Integer> mul = new ArrayList<Integer>();
		Iterator it = even.iterator();
		while(it.hasNext()) {
			Object value = it.next();
			int xy = (Integer)value * 2;
			mul.add(xy);
		}
		printEvenNumbers(mul);
	}
	void printEvenNumbers(ArrayList even)  {
		Iterator it = even.iterator();
	
		System.out.print("Multiply By Two : ");
		while(it.hasNext()) {
			Object value = it.next();
			System.out.print(value + " ");
			
		}
		System.out.println();
	}
	void searchNumber(ArrayList even) {
		System.out.print("Enter the Number want to search in Array1: ");
		Integer searchingNumber = sc.nextInt();
		
		
		boolean x =true;
		boolean y = even.contains(searchingNumber);
		if(x == y) {
			System.out.println("Number is Found");
		}
		else System.out.println("Not found");
		
		System.out.println(even);
	}
	public static void main(String[] args) {
	
		Answer1 save = new Answer1();
			System.out.print("Enter the number for evenNumbers : ");
			int number = sc.nextInt();
			save.saveEvenNumbers(number);
		
	}
}
