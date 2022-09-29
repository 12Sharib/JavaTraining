package co.Assignment03.Answer2.Question0207;

import java.util.List;
import java.util.Map;

import co.Assignment03.Answer2.InputParser.ServerInputParser;
import co.Assignment03.Answer2.Model.Servers;
import co.Assignment03.Answer2.ServerInformation.ServerInformation;
import co.Assignment03.Answer2.Services.ServerServices;

public class Answer0207 {
	public static void main(String[] args) {
		try {
			String [] serversInformation = ServerInformation.serverInformation();
			ServerInputParser inputParser = new ServerInputParser();
			List<Servers> input = inputParser.parseInput(serversInformation);

		 ServerServices services = new ServerServices(input);
		 
		 Map<String, String> mapServers =  services.mapServers();
		 System.out.println(mapServers);
		}catch(Exception ex) {
			throw new RuntimeException(ex);
		}
	}
}
