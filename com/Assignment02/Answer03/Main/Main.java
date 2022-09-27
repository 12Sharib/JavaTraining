package com.Assignment02.Answer03.Main;

import java.util.List;

import com.Assignment02.Answer03.Library.Library;
import com.Assignment02.Answer03.Services.LibraryServices;
import com.Assignment02.Answer03.inputMapper.InputMapper;


public class Main {
	public static void main(String[] args) {
		
		try {
			String path = "/home/mohds/java/JavaAssignments/src/com/Assignment02/Answer03/inputFile/input";
			
			InputMapper parseInput = new InputMapper();
			List<Library> input = parseInput.parseFile(path);
		
			LibraryServices service = new LibraryServices(input);
			service.getLibrary();
	
		}catch(Exception ex) {
			System.out.println(ex);
			ex.printStackTrace();
		}	
	}
}
