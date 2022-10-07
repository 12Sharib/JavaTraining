package co.Assignment03.Answer3.Question04.Mapper;

import co.Assignment03.Answer3.Question04.Model.Subject;

public class SubjectMapper {
	public static Subject map(String data) {
		String split[] = data.split(", ");
		try {
			Integer subjectId = Integer.parseInt(split[0]);
			String subjectName = split[1];
			Integer subjectMarks = Integer.parseInt(split[2]);
			Subject subject = new Subject(subjectId, subjectName, subjectMarks);
			return subject;
		}catch(NumberFormatException numberFormatException) {
			throw new RuntimeException(numberFormatException);
		}
	}
}
