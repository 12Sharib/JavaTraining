package assignment02.Answer1.Operations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import assignment02.Answer1.Software.Software;

public class Operations {
	public List findVersionAndServer(List list,String value) {
		Iterator<Software> it = list.iterator();
		List<Double> ver = new ArrayList<Double>();
		List<String> ser = new ArrayList<>();
		
		List verPlusSer = new ArrayList();
 		Integer temp = 0;
		while(it.hasNext()) {
			Software values = it.next();
			String getOS = values.getOperatingSystem();
			
			if(value.equals(getOS)) {
				Double getVersion =  values.getVersion();
				String getServer = values.getServer();
				//System.out.println(x);
				temp++;
				ver.add(getVersion);
				ser.add(getServer);
			}
			
		}
		String maxServer = (String) Collections.max(ser);
		String minServer = (String) Collections.min(ser);
	//	System.out.println(ver);
					
		Double maxVersion = Collections.max(ver);
		Double minVersion = Collections.min(ver);
		
		verPlusSer.add(minServer);
		verPlusSer.add(maxServer);
		verPlusSer.add(minVersion);
		verPlusSer.add(maxVersion);
		
		return verPlusSer;
	}
	
	public void printOperation(List list,String value,String maxServer,String minServer,Double maxVersion,Double minVersion) {
		Integer temp=0;
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


