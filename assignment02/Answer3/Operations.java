package assignment02.Answer3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Operations {
	String getVersion(List list,String productName) {
		Iterator<Library> it = list.iterator();
		List<String> version = new ArrayList<String>();
		while(it.hasNext()) {
			Library values = it.next();
			String getProductName = values.getProductName();
			
			if(productName.equals(getProductName)) {
				String ver = values.getVersion();
				version.add(ver);
			}
		}
		String minVersion = Collections.min(version);
		return minVersion;
	}
	
	void printOperations(List list, String minVersion) {
		Iterator<Library> it2 = list.iterator();
		while(it2.hasNext()) {
			Library values = it2.next();
			String getVersion = values.getVersion();
			if(minVersion.equals(getVersion)) {
				System.out.println(values.getProductName() + " use " + values.getLibraryName() + " or use outdated version " + minVersion + " ;");
			}
		}
	}
}
