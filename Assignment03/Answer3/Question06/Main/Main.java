package co.Assignment03.Answer3.Question06.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import co.Assignment03.Answer3.Question06.InputParser.CandidateInputParser;
import co.Assignment03.Answer3.Question06.Model.Candidate;
import co.Assignment03.Answer3.Question06.Services.CandidateServices;

public class Main {
	public static void main(String[] args) {
		try {
			String path = "/home/mohds/java/CollectionAssingnment03/src/co/Assignment03/Answer3/Question06/InputFile/CandidateInput";
			CandidateInputParser inputParse = new  CandidateInputParser();
			List<Candidate> Candidates = inputParse.InputParser(path);
			
			CandidateServices services = new CandidateServices(Candidates);
			Map<Object,Candidate> result =  services.HighestVotes();
			
			services.printResult(result);
			
		}
		catch(Exception ex) {
			throw new RuntimeException(ex);
		}
	}

}
