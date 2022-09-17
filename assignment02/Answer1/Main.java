package assignment02.Answer1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		List<Software> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		Operations op = new Operations();
	
		list.add(new Software("Server1", "Database", "MySQL", 5.5));
		list.add(new Software("Server2", "dataBase", "MySQL", 5.1));
		list.add(new Software("Server3", "OS", "Ubuntu", 12.04));
		list.add(new Software("Server1", "OS", "Ubuntu", 18.04));
		list.add(new Software("Server2", "OS", "Ubuntu", 12.04));
		list.add(new Software("Server3", "Language", "Python", 2.6));
		
		
		System.out.print("enter the which operatingSystem you want to work: ");
		String value = sc.next();
			
		List serverPlusVersion = op.findVersionAndServer(list,value);
		
		String minServer = (String)  serverPlusVersion.get(0);
		String maxServer = (String)  serverPlusVersion.get(1);
		Double maxVersion =  (Double) serverPlusVersion.get(2);
		Double minVersion =  (Double) serverPlusVersion.get(3);
		
		
		op.printOperation(list,value,maxServer,minServer,maxVersion,minVersion);

		
	}
}
