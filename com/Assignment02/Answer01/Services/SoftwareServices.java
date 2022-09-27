package com.Assignment02.Answer01.Services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.Assignment02.Answer01.Software.Software;

public class SoftwareServices {
	private List<Software> softwareList = new ArrayList<>();
	 
	public SoftwareServices(List<Software> softwareList) {
		this.softwareList = softwareList;
	}
	public void getOperatingSystem() {
		List<String> getAllDatabases = new ArrayList<>();
			for(Software values:softwareList) {
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
				for(Software values : softwareList) {
					if(value.equals(values.getDataBase())) {
						getVersions.add(values.getVersion());
					}
				}
				
				printResult(Collections.min(getVersions));
			} 
		}
		public void printResult(Double minVersion) {
		
			for(Software values:softwareList) {
				if(minVersion == values.getVersion()) {
					System.out.println(values.getOperatingSystem());
					break;
				}
			}
		}		
	}


