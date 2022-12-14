package co.Assignment03.Answer3.Question01.Mapper;

import co.Assignment03.Answer3.Question01.Model.Software;

public class SoftwareMapper {
		public static Software map(String data) {
			String[] splitArray = data.split(", ");
			Software software = new Software();
			try {
				String server = splitArray[0];
				String dataBase = splitArray[1];
				String operatingSystem = splitArray[2];
				Double version = Double.parseDouble(splitArray[3]);

				software.setServer(server);
				software.setDataBase(dataBase);
				software.setOperatingSystem(operatingSystem);
				software.setVersion(version);
				
			}catch (NumberFormatException numberFormat) {
				throw new RuntimeException(numberFormat);
			}catch (Exception ex) {
				throw new RuntimeException(ex);
			}
			return software;
			
		}
	}


