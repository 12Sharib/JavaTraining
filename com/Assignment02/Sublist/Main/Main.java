package assignment02.Sublist.Main;

import java.util.Arrays;
import java.util.List;

import assignment02.Sublist.Services.sublistService;

public class Main {
	public static void main(String[] args) {
		try {
			sublistService ans = new sublistService();
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
