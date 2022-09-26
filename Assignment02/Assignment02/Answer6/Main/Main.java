package co.Assignment02.Answer6.Main;


import java.util.List;

import co.Assignment02.Answer6.Candidate.Candidate;
import co.Assignment02.Answer6.Operations.Operations;
import co.Assignment02.Answer6.inputMapper.InputMapper;

public class Main {
	public static void main(String[] args) {

		
		String path ="/home/mohds/java/JavaAssignments/src/co/Assignment02/Answer6/inputFile/input";
		
		InputMapper parseFile = new InputMapper();
		
		List<Candidate> input = parseFile.parseInput(path);
	
		
		Operations op = new Operations(input);
		op.getAllPlaces();

	}

}
