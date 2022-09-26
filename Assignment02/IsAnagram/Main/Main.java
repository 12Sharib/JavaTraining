package assignment02.IsAnagram.Main;
import assignment02.IsAnagram.Operations.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Assignment03 assign = new Assignment03();

		String[] inputArray = { "enlists", "google", "inlets", "banana" };
		List<String> list = Arrays.asList(inputArray);
		
		String word="listen";
		List<String> ans = assign.listAnagrams(list, word);
		    System.out.print(ans);
	}
}
