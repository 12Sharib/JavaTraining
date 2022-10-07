package co.Assignment03.Answer3.Question06.InputParser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import co.Assignment03.Answer3.Question06.Mapper.CandidateMapper.MapInput;
import co.Assignment03.Answer3.Question06.Model.Candidate;

public class CandidateInputParser {
		public List<Candidate> InputParser(String path){
			
			List<Candidate> Candidates =  new ArrayList<>();
			File file = new File(path);
			BufferedReader bufferReader = null;
			try {
				bufferReader = new BufferedReader(new FileReader(file));
				String st;
				while((st = bufferReader.readLine()) != null) {
					Candidate candidate = MapInput.map(st);
					
					Candidates.add(candidate);
				}
			}catch(IOException ioException) {
				throw new RuntimeException(ioException);
			}catch(Exception ex) {
				throw new RuntimeException(ex);
			}
			return Candidates;
			
		}
	}


