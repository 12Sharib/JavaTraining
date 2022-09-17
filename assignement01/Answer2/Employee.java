package assignement01.Answer2;

import java.util.ArrayList;
import java.util.Iterator;

class Employee implements Comparable<Employee>{
	private Integer empId;
	private String empName;
	private String empEmail;
	private Character empGender;
	private Float empSalary;
	private ArrayList<Employee> newEmp;
	
	
	Employee(Integer empId, String empName, String empEmail, Character empGender, Float empSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empEmail= empEmail;
		this.empGender = empGender;
		this.empSalary = empSalary;
	}


	public Employee(ArrayList<Employee> newEmp) {
		this.newEmp = newEmp;
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(Integer empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getEmpEmail() {
		return empEmail;
	}


	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}


	public char getEmpGender() {
		return empGender;
	}


	public void setEmpGender(Character empGender) {
		this.empGender = empGender;
	}


	public float getEmpSalary() {
		return empSalary;
	}


	public void setEmpSalary(Float empSalary) {
		this.empSalary = empSalary;
	}
		
		
	@Override
	public String toString() {
		return "Employee [empId: " + empId + ", empName: " + empName + ", empEmail: " + empEmail + ", empGender: "
				+ empGender + ", empSalary: " + empSalary + "]";
	}

	void printDetails() {
		Iterator<Employee> it = newEmp.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}		
	}
	boolean addEmployee(Integer empId,String empName, String empEmail, Character empGender,Float empSalary) {
		newEmp.add(new Employee (empId, empName, empEmail, empGender,empSalary));
		return true;
	}
	boolean removeEmployee(Integer id) {
		Iterator<Employee> it = newEmp.iterator();
		while(it.hasNext()) {
			Employee emp = it.next();
			Integer id1 = emp.empId;
			if(id == id1) {
				newEmp.remove(emp);
			}
		}
		return true;
	}
	boolean showSlip(Integer id) {
		Iterator<Employee> it = newEmp.iterator();
		while(it.hasNext()) {
			Employee emp = it.next();
			Integer id2 = emp.empId;
			if(id == id2) {
				System.out.println("Salary Slip:  "  + emp.empSalary );
			}
			
		}		
		return true;
	}

	@Override
	public int compareTo(Employee emp) {
			if(this.empId == emp.getEmpId())
				return 0;
			else if(this.empId > emp.getEmpId())
				return 1;
			else {
				return -1;
			}
	}

}
