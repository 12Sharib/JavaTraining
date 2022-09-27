package com.Assignment02.Answer4.Main;

import java.io.IOException;
import java.util.List;

import com.Assignment02.Answer4.Services.StudentService;
import com.Assignment02.Answer4.Student.Student;
import com.Assignment02.Answer4.studentMapper.StudentMapper;

public class Main {

	public static void main(String[] args) throws IOException {
		try {
			StudentMapper inputParser = new StudentMapper();
			String path = "/home/mohds/java/JavaAssignments/src/com/Assignment02/Answer4/inputFile/input";
			List<Student> input = inputParser.parseFile(path);	
			
			StudentService service = new StudentService(input);
			
			Integer minimumIdInList = service.findMinimumInList();
			
			Float average =  service.findAverage(minimumIdInList);
			service.printOutput(average,minimumIdInList);
			
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		
	}

}
 