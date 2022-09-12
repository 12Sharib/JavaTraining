package assignementCollection;

import java.util.ArrayList;
import java.util.Iterator;

public class Answer3 {
	void printAll(ArrayList values) {
		Iterator it = values.iterator();
		while(it.hasNext()) {
			Object value = it.next();
			System.out.print(value + " ");
		}
	}
	public static void main(String[] args) {
		ArrayList<String> values = new ArrayList<String>();
		
		
		values.add("Sharib");
		values.add("Saifi");
		
		Answer3 ans = new Answer3();
		ans.printAll(values);
	}
}
