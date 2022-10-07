package co.Assignment03.Answer3.Question03.Mapper;

import co.Assignment03.Answer3.Question03.Model.OutdatedLibrary;

public class LibraryMapper {
		public static OutdatedLibrary map(String data) {
			String [] splitArray = data.split(",");
			OutdatedLibrary library = new OutdatedLibrary();
			try {
				String server = splitArray[0];
				String serverLibrary = splitArray[1];
				Integer version = Integer.parseInt(splitArray[2]);
				
				library.setProductName(server);
				library.setLibraryName(serverLibrary);
				library.setVersion(version);
					
			}catch(NumberFormatException numberFormat) {
				throw new RuntimeException(numberFormat);
			}catch(Exception ex) {
				throw new RuntimeException(ex);
			}
			return library;
		}
	}



