package co.Assignment02.Answer5.Main;

import java.util.List;
import java.util.Set;

import co.Assignment02.Answer5.HighestSalary.HighestSalary;
import co.Assignment02.Answer5.HighestSalaryMapper.inputMapper;
import co.Assignment02.Answer5.Operations.Operations;


public class Main {
	public static void main(String[] args) {
		
		String path = "/home/mohds/java/JavaAssignments/src/co/Assignment02/Answer5/InputFile/input";
		inputMapper mapInput = new inputMapper();
		
		List<HighestSalary> input = mapInput.parseFile(path);
	
		Operations op = new Operations(input);
		
		op.getAllDepartment();
	

	}
}
