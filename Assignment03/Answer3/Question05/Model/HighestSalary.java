package co.Assignment03.Answer3.Question05.Model;

public class HighestSalary {
	private Integer studentId;
	private String studentName;
	private String department;
	private Integer Salary;
	public HighestSalary(Integer studentId, String studentName, String department, Integer salary) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.department = department;
		this.Salary = salary;
	}
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Integer getSalary() {
		return Salary;
	}
	public void setSalary(Integer salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return "HighestSalary [studentId=" + studentId + ", studentName=" + studentName + ", department=" + department
				+ ", Salary=" + Salary + "]\n";
	}

}
