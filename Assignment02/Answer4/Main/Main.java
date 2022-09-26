package co.Assignment02.Answer4.Main;

import java.io.IOException;
import java.util.List;

import co.Assignment02.Answer4.Operations.Operations;
import co.Assignment02.Answer4.Student.Student;
import co.Assignment02.Answer4.studentMapper.StudentMapper;

public class Main {

	public static void main(String[] args) throws IOException {
		try {
			StudentMapper inputParser = new StudentMapper();
			String path = "/home/mohds/java/JavaAssignments/src/co/Assignment02/Answer4/inputFile/input";
			List<Student> input = inputParser.parseFile(path);	
			
			Operations op = new Operations(input);
			
			Integer minimumIdInList = op.findMinimumInList();
			
			Float average =  op.findAverage(minimumIdInList);
			op.printOutput(average,minimumIdInList);
			
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		
	}

}
 