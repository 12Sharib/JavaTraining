package assignment02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class HighestSalary{
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
}

public class Answer5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<HighestSalary> list = new ArrayList<>();
		list.add(new HighestSalary(22, "Rajan Anand", "Engineering", 1600000));
		list.add(new HighestSalary(23, "Swati Patil", "Testing", 800000));
		list.add(new HighestSalary(27, "Vijay Chawda", "Engineering", 800000));
		list.add(new HighestSalary(29, "Basant Mahapatra", "Engineering", 600000));
		list.add(new HighestSalary(32, "Ajay Patel", "Testing", 350000));
		list.add(new HighestSalary(34, "Swaraj Birla", "Testing", 350000));
		
		System.out.print("enter the department want to check highest salary: ");
		String dep = sc.next();
		
		Iterator<HighestSalary> it = list.iterator();
		List<Integer> salary = new ArrayList<>();
		
		while(it.hasNext()) {
			HighestSalary values = it.next();
			String getDepartment = values.getDepartment();
			
			if(dep.equals(getDepartment)) {
				Integer getSalary = values.getSalary();
				salary.add(getSalary);
			}
		}
		Integer maxSalary = Collections.max(salary);
		
		Iterator<HighestSalary> it2 = list.iterator();
		while(it2.hasNext()) {
			HighestSalary values = it2.next();
			Integer getSal = values.getSalary();
			if(maxSalary == getSal) {
				System.out.println(values.getStudentId() + ", " +values.getStudentName() +" has highest Salary in " + values.getDepartment() + ", Salary is " + maxSalary );
			}
		}

	}

}
