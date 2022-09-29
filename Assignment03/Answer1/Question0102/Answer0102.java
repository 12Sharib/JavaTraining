package co.Assignment03.Answer1.Question0102;

import java.util.List;

import co.Assignment03.Answer1.InputParser.StudentInputParser;
import co.Assignment03.Answer1.Model.Students;
import co.Assignment03.Answer1.Services.StudentServices;
import co.Assignment03.Answer1.StudentInformation.StudentsInformation;

public class Answer0102 {
	public static void main(String[] args) {
		try {
			String[] studentsInformation = StudentsInformation.studentsInformation();
			
			StudentInputParser studentInputParser = new StudentInputParser();
			List<Students> input = studentInputParser.parseInput(studentsInformation);
			
			StudentServices services = new StudentServices(input);
			
			List<Students> sortByName = services.sortByName();
			System.out.println(sortByName);
			
			
		}catch(Exception ex) {
			throw new RuntimeException(ex);
		}
	}
}
