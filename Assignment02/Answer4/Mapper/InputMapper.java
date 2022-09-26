package co.Assignment02.Answer4.Mapper;


import co.Assignment02.Answer4.Student.Student;

public class InputMapper {
	public static Student map(String data) {
		String [] splitArray = data.split(",");
		try {
			Integer studentId = Integer.parseInt(splitArray[0]);
			Integer studentMarks = Integer.parseInt(splitArray[2]);
			
			Student student = new Student();
			student.setStudentId(studentId);
			student.setStudentMarks(studentMarks);
			
			return student;
		}catch(NumberFormatException numberFormat) {
			throw new RuntimeException(numberFormat);
		}catch(Exception ex) {
			throw new RuntimeException(ex.getMessage());
		}
	}
}
