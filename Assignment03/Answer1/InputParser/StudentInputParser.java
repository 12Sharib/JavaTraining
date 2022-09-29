package co.Assignment03.Answer1.InputParser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import co.Assignment03.Answer1.Mapper.StudentMapper;
import co.Assignment03.Answer1.Model.Students;

public class StudentInputParser {
	public List<Students> parseInput(String [] studentsInforamtion){
		List<Students> students = new ArrayList<>();
		try {
			for(String data : studentsInforamtion) {
				Students student = StudentMapper.map(data);
				
				students.add(student);
			}
		}
		catch(Exception ex) {
			throw new RuntimeException(ex);
		}
		return students;
	}
}
