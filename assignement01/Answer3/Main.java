package assignement01.Answer3;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> values = new ArrayList<String>();
		
		values.add("Sharib");
		values.add("Saifi");
		
		Operations ans = new Operations();
		ans.printAll(values);
	}
}
