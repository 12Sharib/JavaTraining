package assignement01.Answer3.Main;
import assignement01.Answer3.Operations.*;

import java.util.ArrayList;

import assignement01.Answer3.Operations.Operations;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> values = new ArrayList<String>();
		
		values.add("Sharib");
		values.add("Saifi");
		
		Operations ans = new Operations();
		ans.printAll(values);
	}
}
