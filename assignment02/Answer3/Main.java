package assignment02.Answer3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Operations op = new Operations();
		
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
		
	//	System.out.println(version);
		
		String minVersion = op.getVersion(list,productName);
		
		op.printOperations(list, minVersion);
		
		
	}



	}
