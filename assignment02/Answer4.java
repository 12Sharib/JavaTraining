package assignment02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Student{
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

public class Answer4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the subjectName for get average: ");
		String subjectName = sc.nextLine();
		
		List<Student> list = new ArrayList<>();
		list.add(new Student(22, "Data Structures", 45));
		list.add(new Student(23, "English", 52));
		list.add(new Student(22, "English", 51));
		list.add(new Student(26, "Data Structures", 72));
		list.add(new Student(23, "Data Structures", 61));
		list.add(new Student(24, "English", 81));
		
		Iterator<Student> it = list.iterator();
		Integer temp = 0;
		Integer Sum = 0;
		while(it.hasNext()) {
			Student values = it.next();
			String getSubjectName = values.getSubjectName();
			
			if(subjectName.equals(getSubjectName)) {
				Sum = Sum + values.getStudentMarks();
				temp ++;
			}
		}
		Float average =  ((float) Sum / (Integer)temp);
		System.out.println("Average : " + average);
	}

}
