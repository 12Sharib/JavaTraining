package co.Assignment03.Answer3.Question04.Main;

import java.util.List;

import co.Assignment03.Answer1.StudentInformation.StudentsInformation;
import co.Assignment03.Answer3.Question04.InputParser.SubjectInputParser;
import co.Assignment03.Answer3.Question04.Model.Subject;
import co.Assignment03.Answer3.Question04.Services.subjectServices;

public class Main {
	public static void main(String[] args) {
		try {
			String [] subjectInformation  = {"22, Data Structures, 45",
					"23, English, 52",
					"22, English, 51",
					"26, Data Structures, 72",
					"23, Data Structures, 61",
					"24, English, 81",};
			SubjectInputParser inputParse = new SubjectInputParser();
			List<Subject> input = inputParse.inputParser(subjectInformation);
			subjectServices service = new subjectServices(input);
			
			Integer minId = service.findMinId();
			
			Double average = service.findAverage(minId);
			System.out.println("Average : " + average);
		}catch(Exception ex) {
			throw new RuntimeException(ex);
		}
	}

}
