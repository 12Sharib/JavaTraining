package co.Assignment03.Answer2.Question0201;

import java.util.List;
import java.util.Set;

import co.Assignment03.Answer2.InputParser.ServerInputParser;
import co.Assignment03.Answer2.Model.Servers;
import co.Assignment03.Answer2.ServerInformation.ServerInformation;
import co.Assignment03.Answer2.Services.ServerServices;

public class Answer0201 {
	public static void main(String[] args) {
		try {
			String [] serversInformation = ServerInformation.serverInformation();
			ServerInputParser inputParser = new ServerInputParser();
			List<Servers> input = inputParser.parseInput(serversInformation);
			
			System.out.println(input);
		 ServerServices services = new ServerServices(input);
		 
		}catch(Exception ex) {
			throw new RuntimeException(ex);
		}
	}
}
