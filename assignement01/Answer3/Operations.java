package assignement01.Answer3;

import java.util.ArrayList;
import java.util.Iterator;

public class Operations {
	void printAll(ArrayList values) {
		Iterator it = values.iterator();
		while(it.hasNext()) {
			Object value = it.next();
			System.out.print(value + " ");
		}
	}
}
