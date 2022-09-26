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
			for(Library values :list) {
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
		for(Library values :list) {
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
			for(Library valuesSecond :list) {
				Integer getVersion = valuesSecond.getVersion();
				
				if(minVersion == getVersion) {
					System.out.println(valuesSecond.getProductName());
					break;
			}
		}
	}		
}
	
	
	
	
	
	
	
	

