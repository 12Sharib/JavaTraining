package co.Assignment02.Answer03.Main;

import java.util.List;

import co.Assignment02.Answer03.Library.Library;
import co.Assignment02.Answer03.Operations.Operations;
import co.Assignment02.Answer03.inputMapper.inputMapper;


public class Main {

	public static void main(String[] args) {
		
		try {
			String path = "/home/mohds/java/JavaAssignments/src/co/Assignment02/Answer03/inputFile/input";
			
			inputMapper parseInput = new inputMapper();
			List<Library> input = parseInput.parseFile(path);
		
			Operations op = new Operations(input);
			op.getLibrary();
	
		}catch(Exception ex) {
			System.out.println(ex);
			ex.printStackTrace();
		}
		
		
	}



	}
