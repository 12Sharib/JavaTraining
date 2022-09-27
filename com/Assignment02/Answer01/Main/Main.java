package com.Assignment02.Answer01.Main;

import java.util.List;

import com.Assignment02.Answer01.Services.SoftwareServices;
import com.Assignment02.Answer01.Software.Software;
import com.Assignment02.Answer01.inputMapper.InputMapper;

public class Main {

	public static void main(String[] args) {
		try {
			String path = "/home/mohds/java/JavaAssignments/src/com/Assignment02/Answer01/inputFile/input";
			InputMapper parseInput = new InputMapper();
			
			List<Software> input = parseInput.parseFile(path);
			SoftwareServices service = new SoftwareServices(input);
			
			service.getOperatingSystem();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}

