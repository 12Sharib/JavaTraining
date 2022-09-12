package assignment02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Library{
	private String productName;
	private String libraryName;
	private String version;
	public Library(String productName, String libraryName, String version) {
		this.productName = productName;
		this.libraryName = libraryName;
		this.version = version;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getLibraryName() {
		return libraryName;
	}
	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	
}

public class Answer3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Library> list = new ArrayList<Library>();
		list.add(new Library("Mail Server", "Authentication Library", "v6"));
		list.add(new Library("Video Call Server", "Authentication Library", "v7"));
		list.add(new Library("Mail Server", "Data Storage Library", "v10"));
		list.add(new Library( "Server", "Data Storage Library", "v11"));
		list.add(new Library("Mail Server", "Search Library", "v6"));
		list.add(new Library("Chat Server", "Authentication Library", "v8"));
		list.add(new Library("Chat Server", "Presence Library", "v2"));
		list.add(new Library("Video Call Server", "Data Storage Library", "v10"));
		list.add(new Library("Video Call Server", "Video Compression Library", "v3"));
		
		System.out.print("Enter the Product Name to Check OutDated version: ");
		String productName = sc.nextLine();
		
		Iterator<Library> it = list.iterator();
		List<String> version = new ArrayList<String>();
		while(it.hasNext()) {
			Library values = it.next();
			String getProductName = values.getProductName();
			
			if(productName.equals(getProductName)) {
				String ver = values.getVersion();
				version.add(ver);
			}
		}
	//	System.out.println(version);
		
		String minVersion = Collections.min(version);
		
		Iterator<Library> it2 = list.iterator();
		while(it2.hasNext()) {
			Library values = it2.next();
			String getVersion = values.getVersion();
			if(minVersion.equals(getVersion)) {
				System.out.println(values.getProductName() + " use " + values.getLibraryName() + " or use outdated version " + minVersion + " ;");
			}
		}
	}

}
