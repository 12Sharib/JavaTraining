package assignment02.Answer4.Student;

public class Student {
	private Integer studentId;
	private String subjectName;
	private Integer studentMarks;
	public Student(Integer studentId, String subjectName, Integer studentMarks) {
		this.studentId = studentId;
		this.subjectName = subjectName;
		this.studentMarks = studentMarks;
	}
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public Integer getStudentMarks() {
		return studentMarks;
	}
	public void setStudentMarks(Integer studentMarks) {
		this.studentMarks = studentMarks;
	}

}
