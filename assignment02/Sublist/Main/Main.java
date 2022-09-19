package assignment02.Sublist.Main;

import java.util.ArrayList;
import java.util.List;

import assignment02.Sublist.Operations.Assignment01;

public class Main {
	public static void main(String[] args) {
		Assignment01 ans = new Assignment01();
		List<Integer> listFirst = new ArrayList<>();
		List<Integer> listSecond = new ArrayList<>();
		
		listFirst.add(1);
		listFirst.add(2);
		listFirst.add(3);
		
		listSecond.add(1);
		listSecond.add(2);
		listSecond.add(3);
		listSecond.add(4);
		
		
		ans.printDetails(listFirst,listSecond);
		
	
	}

}
