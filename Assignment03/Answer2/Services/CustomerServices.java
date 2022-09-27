package co.Assignment03.Answer2.Services;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import co.Assignment03.Answer2.Servers.Servers;

public class CustomerServices {
	 List<Servers> serverList = new ArrayList<>();

	public void MakeList(String []serversInformation) {
		for(String data :serversInformation) {
			String split[] = data.split(", ");
			String serverName = split[0];
			String serverDatabaseName = split[1];
			String serverOperatingSystem = split[2];
			String serverVersion = split[3];
			
			Servers server = new Servers(serverName, serverDatabaseName, serverOperatingSystem, serverVersion);
			
			serverList.add(server);
		}
	}
	
	public void sortOnServerName() {
		System.out.println("\nsort by server Name\n");
		serverList.stream().sorted((valueFirst,valueSecond) -> valueFirst.getServerName().compareTo(valueSecond.getServerName()))
		.forEach(value -> System.out.println(value));
	}
	public void sortOnVersionNumber() {
		System.out.println("\nsortOnVersionNumber\n");
		serverList.stream().sorted((valueFirst,valueSecond) -> valueFirst.getServerVersions().compareTo(valueSecond.getServerVersions()))
		.forEach(value -> System.out.println(value));
	}
	public void sortOnSoftware() {
		System.out.println("\nsortOnSoftware\n");
		serverList.stream().sorted((valueFirst,valueSecond) -> valueFirst.getServerOperatingSystem().compareTo(valueSecond.getServerOperatingSystem()))
		.forEach(value -> System.out.println(value));
	}
	
	public void distinct() {
		System.out.println("\ndistinct Server Values\n");

		Set<String> distinctServerSet = new HashSet<>();
		for(Servers server : serverList) {
			distinctServerSet.add(server.getServerName());
		}
		System.out.println(distinctServerSet);
		filterRecords(distinctServerSet);
	}
	public void filterRecords(Set<String> distinctServerSet) {
		System.out.println("\n filterd");
		Set<Servers> filteredList = new HashSet<>();
		//filteredList = serverList.stream().collect(Collectors.toSet());
//		
//		filteredList.addAll(serverList);
//		serverList.clear();
//		serverList.addAll(filteredList);
		
	//	serverList.stream().filter(value -> !(value.getServerName()).equals(value.getServerName())).forEach(value -> System.out.println(value));
		System.out.println(serverList);
		
	}

}
