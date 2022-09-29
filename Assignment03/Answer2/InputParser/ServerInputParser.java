package co.Assignment03.Answer2.InputParser;

import java.util.ArrayList;
import java.util.List;

import co.Assignment03.Answer2.Mapper.ServerMapper;
import co.Assignment03.Answer2.Model.Servers;

public class ServerInputParser {
	public List<Servers> parseInput(String [] serverInformation){
		List<Servers> servers = new ArrayList<>();
		try {
			for(String data:serverInformation) {
				Servers server = ServerMapper.map(data);
				
				servers.add(server);
			}
		}catch(Exception ex) {
			throw new RuntimeException(ex);
		}
		return servers;
	}
}
