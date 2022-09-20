package co.Assignment02.Answer4.Mapper;

import co.Assignment02.Answer4.Student.Student;

public class mapStudent {
	public static Student map(String data) {
		String [] splitArray = data.split(",");
		Integer studentId = Integer.parseInt(splitArray[0]);
		Integer studentMarks = Integer.parseInt(splitArray[2]);
		
		Student student = new Student();
		student.setStudentId(studentId);
		student.setStudentMarks(studentMarks);
		return student;
	}
}
