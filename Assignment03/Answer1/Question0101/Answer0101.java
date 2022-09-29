package co.Assignment03.Answer1.Question0101;

import java.util.List;

import co.Assignment03.Answer1.InputParser.StudentInputParser;
import co.Assignment03.Answer1.Model.Students;
import co.Assignment03.Answer1.StudentInformation.StudentsInformation;

public class Answer0101 {
	public static void main(String[] args) {
		try {
			String []studentsInformation = StudentsInformation.studentsInformation();
			
			StudentInputParser inputParser = new StudentInputParser();
			List<Students> input = inputParser.parseInput(studentsInformation);
			System.out.println(input);
			
		}catch(Exception ex) {
			throw new RuntimeException(ex);
		}
	}
}
