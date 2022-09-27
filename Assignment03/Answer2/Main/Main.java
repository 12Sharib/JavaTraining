package co.Assignment03.Answer2.Main;

import java.util.List;

import co.Assignment03.Answer2.Servers.Servers;
import co.Assignment03.Answer2.Services.CustomerServices;

public class Main {
	public static void main(String[] args) {
		try {
		String[] serversInformation = {
				"Server1, Database, MySQL, 5.5",
				"Server2, Database, MySQL, 5.1",
				"Server3, OS, Ubuntu, 12.04",
				"Server1, OS, Ubuntu, 12.04",
				"Server2, OS, Ubuntu, 18.04",
				"Server3, Language, Python, 2.6.3",
				"Server4, Language, Python, 3.9.14",
				"Server4, Language, Python, 3.10.4"
			};
		
		 CustomerServices services = new CustomerServices();
		 
		 services.MakeList(serversInformation);
		 services.sortOnServerName();
		 services.sortOnVersionNumber();
		 services.sortOnSoftware();
		 services.distinct();
		
//		 services.filterRecords();
		}catch(Exception ex) {
			throw new RuntimeException(ex);
		}
	}
}
