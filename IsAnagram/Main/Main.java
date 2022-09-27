package assignment02.IsAnagram.Main;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import assignment02.IsAnagram.Services.*;

public class Main {
	public static void main(String[] args) {
		IsanagramService assign = new IsanagramService();

		String[] inputArray = { "enlists", "google", "inlets", "banana" };
		List<String> Inputlist = Arrays.asList(inputArray);
		
		String word="listen";
		List<String> ans = assign.listAnagrams(Inputlist, word);
		    System.out.print(ans);
	}
}
