package co.Assignment03.Answer2.Servers;

public class Servers {
	private String serverName;
	private String serverDatabase;
	private String serverOperatingSystem;
	private String serverVersions;
	
	public Servers(String serverName, String serverDatabase, String serverOperatingSystem, String serverVersions) {
		this.serverName = serverName;
		this.serverDatabase = serverDatabase;
		this.serverOperatingSystem = serverOperatingSystem;
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
	public String getServerOperatingSystem() {
		return serverOperatingSystem;
	}
	public void setServerOperatingSystem(String serverOperatingSystem) {
		this.serverOperatingSystem = serverOperatingSystem;
	}
	public String getServerVersions() {
		return serverVersions;
	}
	public void setServerVersions(String serverVersions) {
		this.serverVersions = serverVersions;
	}
	@Override
	public String toString() {
		return String.format("serverName : %s \t serverDataBase :   %s \t serverOperatingSystem : %s \t serverVersion : %s \n",serverName,serverDatabase,serverOperatingSystem,serverVersions );
	}
	
}
