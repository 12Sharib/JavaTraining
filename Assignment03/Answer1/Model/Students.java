package co.Assignment03.Answer1.Model;

public class Students {
	
	public Students(Integer studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	@Override
	public String toString() {
		return "studentId = " + studentId + " studentName = " + studentName + "\n" ;
	}
	private Integer studentId;
	private String studentName;
	
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
}
