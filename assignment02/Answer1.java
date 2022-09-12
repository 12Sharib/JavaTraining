package assignment02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Software{
	private String server;
	private String dataBase;
	private String operatingSystem;
	private Double version;
	
	public String getServer() {
		return server;
	}

	public void setServer(String server) {
		this.server = server;
	}

	public String getDataBase() {
		return dataBase;
	}

	public void setDataBase(String dataBase) {
		this.dataBase = dataBase;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public Double getVersion() {
		return version;
	}

	public void setVersion(Double version) {
		this.version = version;
	}

	public Software(String server, String dataBase, String operatingSystem,double version) {
		this.server = server;
		this.dataBase = dataBase;
		this.operatingSystem = operatingSystem;
		this.version = version;
	}

}

public class Answer1 {

	public static void main(String[] args) {
		List<Software> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

	
		list.add(new Software("Server1", "Database", "MySQL", 5.5));
		list.add(new Software("Server2", "dataBase", "MySQL", 5.1));
		list.add(new Software("Server3", "OS", "Ubuntu", 12.04));
		list.add(new Software("Server1", "OS", "Ubuntu", 18.04));
		list.add(new Software("Server2", "OS", "Ubuntu", 12.04));
		list.add(new Software("Server3", "Language", "Python", 2.6));
		
		Iterator<Software> it = list.iterator();
		System.out.print("enter the which operatingSystem you want to work: ");
		String value = sc.next();
			
		List<Double> ver = new ArrayList<Double>();
		List<String> ser = new ArrayList<>();
		
		Integer temp = 0;
		while(it.hasNext()) {
			Software values = it.next();
			String getOS = values.getOperatingSystem();
		
		
			
			if(value.equals(getOS)) {
				double x =  values.getVersion();
				String getServer = values.getServer();
				//System.out.println(x);
				temp++;
				ver.add(x);
				ser.add(getServer);
			}
			
		}
		String maxServer = Collections.max(ser);
		String minServer = Collections.min(ser);
	//	System.out.println(ver);
					
		double maxVersion = Collections.max(ver);
		double minVersion = Collections.min(ver);
		
//		System.out.println(maxVersion);
//		System.out.println(minVersion);
//		System.out.println(temp);
		
		Iterator<Software> it2 = list.iterator();
		while(it2.hasNext()) {
			Software values = it2.next();
			String getOS = values.getOperatingSystem();
			
			if(value.equals(getOS)) {
				
				System.out.println("Because "+ values.getOperatingSystem() +" " + minVersion +" is an out-of-date version" +  
						"(the latest version is " + maxVersion + " ),  and it is installed on two servers ("+ maxServer +", and "+ minServer + ")");
					break;
					
			}
			if (temp == 1){
				System.out.println("Only One Version is in Database " + "i.e on " + maxServer + " Version "  + maxVersion);
					break;
			}
		}
	}

}
