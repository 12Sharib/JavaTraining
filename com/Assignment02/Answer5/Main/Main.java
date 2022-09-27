package com.Assignment02.Answer5.Main;

import java.util.List;

import com.Assignment02.Answer5.HighestSalary.HighestSalary;
import com.Assignment02.Answer5.HighestSalaryMapper.InputMapper;
import com.Assignment02.Answer5.Services.CandidateServices;


public class Main {
	public static void main(String[] args) {
		try {
			String path = "/home/mohds/java/JavaAssignments/src/com/Assignment02/Answer5/InputFile/input";
			InputMapper mapInput = new InputMapper();
			
			List<HighestSalary> input = mapInput.parseFile(path);
		
			CandidateServices service = new CandidateServices(input);
			
			service.getAllDepartment();
		}catch(Exception ex) {
			throw new RuntimeException(ex);
		}
	}
}
