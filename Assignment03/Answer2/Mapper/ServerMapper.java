package co.Assignment03.Answer2.Mapper;

import java.util.List;

import co.Assignment03.Answer2.Model.Servers;

public class ServerMapper {
	public static Servers map(String data){
		try {
			String split[] = data.split(", ");
			String serverName = split[0];
			String serverDatabaseName = split[1];
			String serverSoftware = split[2];
			String serverVersion = split[3];
			
			Servers server = new Servers(serverName, serverDatabaseName, serverSoftware, serverVersion);
			return server;
		}catch(NumberFormatException numberFormatException) {
			throw new RuntimeException(numberFormatException);
		}catch(Exception ex) {
			throw new RuntimeException(ex);
		}
	}
}
