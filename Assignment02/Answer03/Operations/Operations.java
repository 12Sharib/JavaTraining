package co.Assignment02.Answer03.Operations;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import co.Assignment02.Answer03.Library.Library;


public class Operations {
	private List<Library> list = new ArrayList<>();
	public Operations(List<Library> list) {
		this.list = list;
	}

	public void getLibrary() {
		
		List<String> getAllLibrary = new ArrayList<>(); 
		Iterator it = list.iterator();
		while(it.hasNext()) {
			Library values = (Library) it.next();
			String getLibrary = values.getLibraryName();
			getAllLibrary.add(getLibrary);
			
		}
		//find duplicates
		Set<String> duplicates = new HashSet<>();
        Set<String> seen = new HashSet<>();
 
        for (String value : getAllLibrary) {
            if (!seen.add(value)) {
                duplicates.add(value);
            }
        }
       // System.out.println(duplicates);
        
    Set<Integer> minVersions = new HashSet<>();
    
    for (String lib : duplicates) {
		Iterator<Library> it2 = list.iterator();
		
		while(it2.hasNext()) {
			Library values = (Library) it2.next();
			Integer version = values.getVersion();
			String getOneLibrary = values.getLibraryName();
			
			if(lib.equals(getOneLibrary)) {
				minVersions.add(values.getVersion());
			}
		}
		Integer minVersion = Collections.min(minVersions);
		printResult(minVersion);				
		//	System.out.println("singleVersion" + minVersion + " \n");
        }
	}
	public void printResult(Integer minVersion) {
		Iterator<Library> it3 = list.iterator();
		while(it3.hasNext()) {
			Library valuesSecond = (Library) it3.next();
			Integer getVersion = valuesSecond.getVersion();
			
			if(minVersion == getVersion) {
				System.out.println(valuesSecond.getProductName());
				break;
			}
		}
	}		
}
	
	
	
	
	
	
	
	

