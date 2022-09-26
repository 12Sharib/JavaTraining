package co.Assignment02.Answer6.inputMapper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import co.Assignment02.Answer6.Candidate.Candidate;
import co.Assignment02.Answer6.Mapper.MapInput;

public class InputMapper {
	public List<Candidate> parseInput(String path){
		List<Candidate> list = new ArrayList<>();
		File file = new File(path);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(file));
			String st;
			while((st = bufferReader.readLine()) != null) {
				Candidate candidate = MapInput.map(st);
				
				list.add(candidate);
			}
		}catch(IOException ioException) {
			throw new RuntimeException(ioException);
		}catch(Exception ex) {
			throw new RuntimeException(ex);
		}
		return list;
		
	}
}
