package com.Assignment02.Answer03.Services;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.Assignment02.Answer03.Library.Library;


public class LibraryServices {
	private List<Library> libraryList = new ArrayList<>();
	public LibraryServices(List<Library> libraryList) {
		this.libraryList = libraryList;
	}

	public void getLibrary() {
		
		List<String> getAllLibrary = new ArrayList<>(); 
			for(Library values :libraryList) {
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
		for(Library values :libraryList) {
		Integer version = values.getVersion();
		String getOneLibrary = values.getLibraryName();
		
		if(lib.equals(getOneLibrary)) {
			minVersions.add(values.getVersion());
		}
	}
		
		printResult(Collections.min(minVersions));				
		//	System.out.println("singleVersion" + minVersion + " \n");
        }
	}
	public void printResult(Integer minVersion) {
			for(Library valuesSecond :libraryList) {
				Integer getVersion = valuesSecond.getVersion();
				
				if(minVersion == getVersion) {
					System.out.println(valuesSecond.getProductName());
					break;
			}
		}
	}		
}
	
	
	
	
	
	
	
	

