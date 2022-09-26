package assignment02.Sublist.Main;

import java.util.Arrays;
import java.util.List;

import assignment02.Sublist.Operations.Assignment01;

public class Main {
	public static void main(String[] args) {
		try {
			Assignment01 ans = new Assignment01();
			Integer firstList [] = {1,2,3};
			Integer SecondList [] = {1,2,3,4};
			List<Integer> listFirst = Arrays.asList(firstList);
			List<Integer> listSecond = Arrays.asList(SecondList);
			
			ans.printDetails(listFirst,listSecond);
		}catch(Exception ex) {
			throw new RuntimeException(ex);
		}
		
	
	}

}
