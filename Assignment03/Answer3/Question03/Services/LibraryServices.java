package co.Assignment03.Answer3.Question03.Services;

import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;
import java.util.stream.Collectors;
import co.Assignment03.Answer3.Question03.Model.OutdatedLibrary;
import co.Assignment03.Answer3.Question06.Model.Candidate;

public class LibraryServices {
	private List<OutdatedLibrary> library = new ArrayList<>();

	public LibraryServices(List<OutdatedLibrary> library) {
		this.library = library;
	}
	public Map<String, Set<Integer>> OutdatedLibrary() {
		/* In this, we are taking many versions of the whole library
		 *  to check how many versions are there because 
		 *  if there is a single version then there is no 
		 *  meaning of outdated in it.*/
			Map<String, Set<Integer>> libraryVersionsList = library.stream().collect(Collectors.groupingBy(OutdatedLibrary::getLibraryName,
				Collectors.mapping(OutdatedLibrary::getVersion, Collectors.toSet())));
			return libraryVersionsList;
		}
		public void printResult(Map<String, Set<Integer>> libraryVersionsList) {
		
	    	for(Entry<String, Set<Integer>> m : libraryVersionsList.entrySet()) {
	    			Integer x = m.getValue().size();
	    			if(x>=2)
	    				System.out.println(m.getKey()); 
		    	} 
		}
}

