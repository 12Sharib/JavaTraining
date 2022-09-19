package assignment02.Isogram.Main;

import java.util.ArrayList;
import java.util.List;

import assignment02.Isogram.Operations.Assignment02;

public class Main {
	public static void main(String[] args) {
		Assignment02 ans = new Assignment02 ();
		List<String> list = new ArrayList<>();
		
		list.add("lumberjaacks");
		list.add("background");
		list.add("isograam");
		
		ans.printDetails(list);
		}

}
