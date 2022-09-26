package assignment02.Sublist.Operations;

import java.util.List;

public class Assignment01 {
	public void printDetails(List<Integer> listFirst,List<Integer> listSecond){
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

}
