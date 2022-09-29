package co.Assignment03.Answer1.Mapper;

import co.Assignment03.Answer1.Model.Students;

public class StudentMapper {
	public static Students map(String data) {
		if(data == null || data.length() == 0) {
			throw new RuntimeException("Invalid Input");
		}
		String split[] = data.split(", ");
		Students student = null;
		try {
			Integer studentId = Integer.parseInt(split[0]);
			String studentName = split[1];
			
			student = new Students(studentId, studentName);
		}catch(NumberFormatException numberFormatException) {
			throw new RuntimeException(numberFormatException);
		}catch(Exception ex) {
			throw new RuntimeException(ex); 
		}
		return student;
	}
}
