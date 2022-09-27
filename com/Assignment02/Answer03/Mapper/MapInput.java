package com.Assignment02.Answer03.Mapper;

import com.Assignment02.Answer03.Library.Library;

public class MapInput {
	public static Library map(String data) {
		String [] splitArray = data.split(",");
		Library library = new Library();
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
