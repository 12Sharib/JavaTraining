package co.Assignment03.Answer1.Question0104;

import java.util.List;

import co.Assignment03.Answer1.InputParser.StudentInputParser;
import co.Assignment03.Answer1.Model.Students;
import co.Assignment03.Answer1.Services.StudentServices;
import co.Assignment03.Answer1.StudentInformation.StudentsInformation;

public class Answer0104 {
	public static void main(String[] args) {
		try {
			String[] studentsInformation = StudentsInformation.studentsInformation();
			
			StudentInputParser studentInputParser = new StudentInputParser();
			List<Students> input = studentInputParser.parseInput(studentsInformation);
			
			StudentServices service = new StudentServices(input);
			List<Students> studentsGreaterThan23 = service.filterFirst();
			System.out.println(studentsGreaterThan23);
		}catch(Exception ex) {
			throw new RuntimeException(ex);
		}
	}

}
