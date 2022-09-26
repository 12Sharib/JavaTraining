package co.Assignment02.Answer03.Mapper;


import co.Assignment02.Answer03.Library.Library;

public class mapInput {
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
			System.out.println(ex);
		}
		return library;
	}

}
