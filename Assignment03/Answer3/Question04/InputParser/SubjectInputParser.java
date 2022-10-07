package co.Assignment03.Answer3.Question04.InputParser;

import java.util.ArrayList;
import java.util.List;

import co.Assignment03.Answer3.Question04.Mapper.SubjectMapper;
import co.Assignment03.Answer3.Question04.Model.Subject;

public class SubjectInputParser {
	public List<Subject> inputParser(String[] subjectInformation){
		List<Subject> subjects = new ArrayList<>();
		try {
			for(String data:subjectInformation) {
				Subject subject = SubjectMapper.map(data);
				
				subjects.add(subject);
			}
		}catch(Exception ex) {
			throw new RuntimeException(ex);
		}
		return subjects;
	}

}
