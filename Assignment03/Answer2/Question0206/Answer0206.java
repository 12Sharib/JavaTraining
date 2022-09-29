package co.Assignment03.Answer2.Question0206;

import java.util.List;
import java.util.Set;

import co.Assignment03.Answer2.InputParser.ServerInputParser;
import co.Assignment03.Answer2.Model.Servers;
import co.Assignment03.Answer2.ServerInformation.ServerInformation;
import co.Assignment03.Answer2.Services.ServerServices;

public class Answer0206 {
	public static void main(String[] args) {
		try {
			String [] serversInformation = ServerInformation.serverInformation();
			ServerInputParser inputParser = new ServerInputParser();
			List<Servers> input = inputParser.parseInput(serversInformation);
			
		 ServerServices services = new ServerServices(input);
		 
		 List<Servers> filterRecords = services.filterRecords();
		 System.out.println(filterRecords);
		 
		
		}catch(Exception ex) {
			throw new RuntimeException(ex);
		}
	}
}
