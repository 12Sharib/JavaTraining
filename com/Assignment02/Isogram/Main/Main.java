package assignment02.Isogram.Main;


import java.util.Arrays;
import java.util.List;

import assignment02.Isogram.Services.IsogramService;

public class Main {
	public static void main(String[] args) {
		try {
			IsogramService ans = new IsogramService ();
			String []inputArray = {"lumberjaacks","background","isograam"};
			List<String> Inputlist = Arrays.asList(inputArray);
			
			ans.printDetails(Inputlist);
		}catch(Exception ex) {
			throw new RuntimeException(ex);
		}
	}
}
