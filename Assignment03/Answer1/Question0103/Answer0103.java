package co.Assignment03.Answer1.Question0103;

import java.util.ArrayList;
import java.util.List;

import co.Assignment03.Answer1.InputParser.StudentInputParser;
import co.Assignment03.Answer1.Model.Students;
import co.Assignment03.Answer1.Services.StudentServices;
import co.Assignment03.Answer1.StudentInformation.StudentsInformation;

public class Answer0103 {
	public static void main(String[] args) {
		try {
			String[] studentsInformation = StudentsInformation.studentsInformation();
			StudentInputParser inputParser = new StudentInputParser();
			List<Students> input = inputParser.parseInput(studentsInformation);
			
			
			StudentServices service = new StudentServices(input);
			List<Students> sortById = service.sortById();
			System.out.println(sortById);
		}catch(Exception ex) {
			throw new RuntimeException(ex);
		}
		
		
	}

}
