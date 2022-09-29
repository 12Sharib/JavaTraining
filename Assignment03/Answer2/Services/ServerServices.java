package co.Assignment03.Answer2.Services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import co.Assignment03.Answer2.Model.Servers;

public class ServerServices {
	 private List<Servers> servers = new ArrayList<>();
	 public ServerServices(List<Servers> servers) {
			this.servers = servers;
		}
	
	public List<Servers> sortOnServerName() {
		System.out.println("\n **************** sort by server Name ***************\n");
		List<Servers> sortOnServerName = new ArrayList<>();
		servers.stream().sorted((valueFirst,valueSecond) -> valueFirst.getServerName().compareTo(valueSecond.getServerName()))
		.forEach(value -> sortOnServerName.add(value));
		
		return sortOnServerName;
	}
	public List<Servers> sortOnServerAndVersionNumber() {
		System.out.println("\n*************** sortOnServerAndVersionNumber ***************\n");
		
		 Comparator<Servers> server = Comparator.comparing(Servers::getServerName);
		 
	      Comparator<Servers> Software = Comparator.comparing(Servers::getServerSoftware);
	      Comparator<Servers> version = Comparator.comparing(Servers::getServerVersions);
		  List<Servers> sortOnServerAndVersionNumber = servers.stream()
				  .sorted((server.thenComparing(Software).thenComparing(version)))
				  .collect(Collectors.toList());

		return sortOnServerAndVersionNumber;
	
	}
	public List<Servers> sortOnSoftware() {
		System.out.println("\n*************** sortOnSoftware **************\n");
		List<Servers> sortOnSoftwareList = new ArrayList<>();
		servers.stream().sorted((valueFirst,valueSecond) -> valueFirst.getServerSoftware().compareTo(valueSecond.getServerSoftware()))
		.forEach(value -> sortOnSoftwareList.add(value));
		
		return sortOnSoftwareList;
	}
	
	public Set<String> distinct() {
		System.out.println("\n*************** distinct Server Values ***************\n");
		
		Set<String> distinctServerSet = servers.stream().map(values -> values.getServerName()).collect(Collectors.toSet());
		
		return distinctServerSet;
	}
	public List<Servers> filterRecords() {
		System.out.println("\n ****************** filterdList *************");
		String serverName = "Server2";
		List<Servers> filterRecords = new ArrayList<>();
		servers.stream().filter(values -> values.getServerName().equals(serverName)).forEach(value -> filterRecords.add(value));
		return filterRecords;
	}
	
	public Map<String, String> mapServers() {
		System.out.println("\n************* mapservers *************** \n");
		Map<String, String> mapServers = 	
		
		//Sort the Versions
		servers.stream().sorted((valueFirst,valueSecond) -> valueFirst.getServerVersions().compareTo(valueSecond.getServerVersions()))
		//Collect key and value(value in sorted order)
		.collect(Collectors.toMap(key->key.getServerSoftware(), value->value.getServerVersions(),
		//If duplicate key and values		
		(duplicateKey,duplicateValue) -> duplicateKey +" , " +duplicateValue));
		//print the solution
		return mapServers;

		

	}

}
