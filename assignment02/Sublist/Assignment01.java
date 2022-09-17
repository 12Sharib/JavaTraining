package assignment02.Sublist;

import java.util.ArrayList;
import java.util.List;

public class Assignment01 {
	static void printDetails(List listFirst,List listSecond){
		Integer sizeFirst = listFirst.size();
		Integer sizeSecond = listSecond.size();
		
		if(sizeFirst == sizeSecond && listFirst.containsAll(listSecond) ==true && listSecond.containsAll(listFirst) ==true) {
			System.out.println("Both List are Equal");
		}
		else if(sizeFirst < sizeSecond && listSecond.containsAll(listFirst )==true) {
			System.out.println("listFirst  is a Sublist of listSecond");
		}
		else if(sizeSecond > sizeFirst && listSecond.contains(listFirst) == true ) {
			System.out.println("listFirst is superlist of listSecond");
		}
		else {
			System.out.println("None");
		}
	}
	public static void main(String[] args) {
		List<Integer> listFirst = new ArrayList<>();
		List<Integer> listSecond = new ArrayList<>();
		
		listFirst.add(1);
		listFirst.add(2);
		listFirst.add(3);
		
		listSecond.add(1);
		listSecond.add(2);
		listSecond.add(3);
		listSecond.add(4);
		
		
		printDetails(listFirst,listSecond);
		
	
	}
}
