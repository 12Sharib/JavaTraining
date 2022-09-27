package com.Assignment02.Answer6.Main;


import java.util.List;

import com.Assignment02.Answer6.Candidate.Candidate;
import com.Assignment02.Answer6.Services.CandidateService;
import com.Assignment02.Answer6.inputMapper.InputMapper;

public class Main {
	public static void main(String[] args) {
		try {
			String path ="/home/mohds/java/JavaAssignments/src/com/Assignment02/Answer6/inputFile/input";
			
			InputMapper parseFile = new InputMapper();
			
			List<Candidate> input = parseFile.parseInput(path);
			CandidateService service = new CandidateService(input);
			service.getAllPlaces();
			
		}catch(Exception ex) {
			throw new RuntimeException(ex);
		}

	}

}
