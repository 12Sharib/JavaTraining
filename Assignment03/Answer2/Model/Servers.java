package co.Assignment03.Answer2.Model;

public class Servers {
	private String serverName;
	private String serverDatabase;
	private String serverSoftware;
	private String serverVersions;
	
	public Servers(String serverName, String serverDatabase, String serverSoftware, String serverVersions) {
		this.serverName = serverName;
		this.serverDatabase = serverDatabase;
		this.serverSoftware = serverSoftware;
		this.serverVersions = serverVersions;
	}
	public void setServerName(String serverName) {
		this.serverName = serverName;
	}
	public String getServerName() {
		return serverName;
	}
	public String getServerDatabase() {
		return serverDatabase;
	}
	public void setServerDatabase(String serverDatabase) {
		this.serverDatabase = serverDatabase;
	}
	public String getServerSoftware() {
		return serverSoftware;
	}
	public void setServerSoftware(String serverSoftware) {
		this.serverSoftware = serverSoftware;
	}
	public String getServerVersions() {
		return serverVersions;
	}
	public void setServerVersions(String serverVersions) {
		this.serverVersions = serverVersions;
	}
	@Override
	public String toString() {
		return String.format("serverName : %s \t serverDataBase :   %s \t serverSoftware : %s \t serverVersion : %s \n",serverName,serverDatabase,serverSoftware,serverVersions );
	}
	
}
