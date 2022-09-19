package assignment02.IsAnagram.Main;
import assignment02.IsAnagram.Operations.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Assignment03 assign = new Assignment03();
		List<String>list=new ArrayList<String>();
		list.add("enlists");
		list.add("google");
		list.add("inlets");
		list.add("banana");
		String word="listen";
		List<String> ans = assign.listAnagrams(list, word);
		    System.out.print(ans);
	}
}
