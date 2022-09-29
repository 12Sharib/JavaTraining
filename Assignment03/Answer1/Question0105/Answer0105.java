package co.Assignment03.Answer1.Question0105;

import java.util.List;

import co.Assignment03.Answer1.InputParser.StudentInputParser;
import co.Assignment03.Answer1.Model.Students;
import co.Assignment03.Answer1.Services.StudentServices;
import co.Assignment03.Answer1.StudentInformation.StudentsInformation;

public class Answer0105 {
	public static void main(String[] args) {
		try {
			String [] studentsInformation = StudentsInformation.studentsInformation();
			StudentInputParser inputParser = new StudentInputParser();
			List<Students> input = inputParser.parseInput(studentsInformation);
			
			StudentServices service = new StudentServices(input);
			
			List<Students> studentLessThan23 = service.filterSecond();
			System.out.println(studentLessThan23);
		}catch(Exception ex) {
			
		}
	}
}
