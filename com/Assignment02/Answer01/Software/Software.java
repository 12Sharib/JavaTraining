package com.Assignment02.Answer01.Software;

public class Software {
		private String server;
		private String dataBase;
		private String operatingSystem;
		private Double version;
		
//		public Software(String server, String dataBase, String operatingSystem,double version) {
//			this.server = server;
//			this.dataBase = dataBase;
//			this.operatingSystem = operatingSystem;
//			this.version = version;
//		}
		
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

		@Override
		public String toString() {
			return "Software [server=" + server + ", dataBase=" + dataBase + ", operatingSystem=" + operatingSystem
					+ ", version=" + version + "]";
		}
}

