package co.Assignment03.Answer1.Question0107;

import java.util.List;
import java.util.Map;

import co.Assignment03.Answer1.InputParser.StudentInputParser;
import co.Assignment03.Answer1.Model.Students;
import co.Assignment03.Answer1.Services.StudentServices;
import co.Assignment03.Answer1.StudentInformation.StudentsInformation;

public class Answer0107 {
	public static void main(String[] args) {
		try {
			String []studentsInformation = StudentsInformation.studentsInformation();
			StudentInputParser inputParser = new StudentInputParser();
			List<Students> input = inputParser.parseInput(studentsInformation);
			
			StudentServices service = new StudentServices(input);
			Map<Integer, String> mapStudents = service.Map();
			System.out.println(mapStudents);
		}catch(Exception ex) {
			throw new RuntimeException(ex);
		}
	}

}
