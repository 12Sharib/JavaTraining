package assignment02.Isogram.Main;


import java.util.Arrays;
import java.util.List;

import assignment02.Isogram.Operations.Assignment02;

public class Main {
	public static void main(String[] args) {
		try {
			Assignment02 ans = new Assignment02 ();
			String []inputArray = {"lumberjaacks","background","isograam"};
			List<String> list = Arrays.asList(inputArray);
			
			ans.printDetails(list);
		}catch(Exception ex) {
			throw new RuntimeException(ex);
		}
	}
}
