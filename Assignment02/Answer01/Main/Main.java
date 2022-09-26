package co.Assignment02.Answer01.Main;

import java.util.List;

import co.Assignment02.Answer01.Operations.Operations;
import co.Assignment02.Answer01.Software.Software;
import co.Assignment02.Answer01.inputMapper.inputMapper;

public class Main {

	public static void main(String[] args) {
		try {
			String path = "/home/mohds/java/JavaAssignments/src/co/Assignment02/Answer01/inputFile/input";
			inputMapper parseInput = new inputMapper();
			
			List<Software> input = parseInput.parseFile(path);
			Operations op = new Operations(input);
			
			op.getOperatingSystem();
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}

