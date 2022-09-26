package co.Assignment02.Answer01.Operations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import co.Assignment02.Answer01.Software.Software;

public class Operations {
	private List<Software> list = new ArrayList<>();
	 
	public Operations(List<Software> list) {
		this.list = list;
	}
	public void getOperatingSystem() {
		List<String> getAllDatabases = new ArrayList<>();
			for(Software values:list) {
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
				for(Software values : list) {
					if(value.equals(values.getDataBase())) {
						getVersions.add(values.getVersion());
					}
				}
				Double minVersion = Collections.min(getVersions);
				printResult(minVersion);
			} 
		}
		public void printResult(Double minVersion) {
		
			for(Software values:list) {
				if(minVersion == values.getVersion()) {
					System.out.println(values.getOperatingSystem());
					break;
				}
			}
		}		
	}


