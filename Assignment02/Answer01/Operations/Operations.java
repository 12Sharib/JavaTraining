package co.Assignment02.Answer01.Operations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import co.Assignment02.Answer01.Software.Software;
import co.Assignment02.Answer02.Customer.Customer;


public class Operations {
	private List<Software> list = new ArrayList<>();
	 
	public Operations(List<Software> list) {
		this.list = list;
	}
	public void getOperatingSystem() {
		Iterator it = list.iterator();
		List<String> getAllDatabases = new ArrayList<>();
		while(it.hasNext()) {
			Software values = (Software) it.next();
			
			String operatingSytem = values.getDataBase();
			getAllDatabases.add(operatingSytem);
			
		}
		findCopyOperatingSystem(getAllDatabases);
	}

		public void findCopyOperatingSystem(List<String> getAllDatabases) {
		Set<String> seen = new HashSet<>();
		Set<String> duplicates = new HashSet<>();

		for(String value : getAllDatabases) {
			if(!seen.add(value)) {
				duplicates.add(value);
			}
		}
		getOutdatedVersion(duplicates);
		
	}
		public void getOutdatedVersion(Set<String> duplicates) {
			Set<Double> getVersions = new HashSet<>();
			for (String value : duplicates) {
				Iterator<Software> it = list.iterator();
				while(it.hasNext()) {
					Software values = it.next();
					if(value.equals(values.getDataBase())) {
						getVersions.add(values.getVersion());
					}
				}
				Double minVersion = Collections.min(getVersions);
				printResult(minVersion);
			} 
		}
		public void printResult(Double minVersion) {
		
			Iterator<Software> it = list.iterator();
			while(it.hasNext()) {
				Software values = it.next();
				if(minVersion == values.getVersion()) {
					System.out.println(values.getOperatingSystem());
					break;
				}
			}
		}
		
		
		
	}

