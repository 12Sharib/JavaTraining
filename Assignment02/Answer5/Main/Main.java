package co.Assignment02.Answer5.Main;

import java.util.List;

import co.Assignment02.Answer5.HighestSalary.HighestSalary;
import co.Assignment02.Answer5.HighestSalaryMapper.InputMapper;
import co.Assignment02.Answer5.Operations.Operations;


public class Main {
	public static void main(String[] args) {
		try {
			String path = "/home/mohds/java/JavaAssignments/src/co/Assignment02/Answer5/InputFile/input";
			InputMapper mapInput = new InputMapper();
			
			List<HighestSalary> input = mapInput.parseFile(path);
		
			Operations op = new Operations(input);
			
			op.getAllDepartment();
		}catch(Exception ex) {
			throw new RuntimeException(ex);
		}
	}
}
