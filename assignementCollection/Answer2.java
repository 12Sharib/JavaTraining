package assignementCollection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class Employee implements Comparable<Employee>{
	private int empId;
	private String empName;
	private String empEmail;
	private char empGender;
	private float empSalary;
	private ArrayList<Employee> newEmp;
	
	
	Employee(int empId, String empName, String empEmail, char empGender, float empSalary) {
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


	public void setEmpId(int empId) {
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


	public void setEmpGender(char empGender) {
		this.empGender = empGender;
	}


	public float getEmpSalary() {
		return empSalary;
	}


	public void setEmpSalary(float empSalary) {
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
	boolean addEmployee(int empId,String empName, String empEmail, char empGender,float empSalary) {
		newEmp.add(new Employee (empId, empName, empEmail, empGender,empSalary));
		return true;
	}
	boolean removeEmployee(int id) {
		Iterator<Employee> it = newEmp.iterator();
		while(it.hasNext()) {
			Employee emp = it.next();
			int id1 = emp.empId;
			if(id == id1) {
				newEmp.remove(emp);
			}
		}
		return true;
	}
	boolean showSlip(int id) {
		Iterator<Employee> it = newEmp.iterator();
		while(it.hasNext()) {
			Employee emp = it.next();
			int id2 = emp.empId;
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

public class Answer2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Employee>	newEmp = new ArrayList<Employee>();
		Employee emp = null;
	
		String req = "y";
		System.out.println("****************************** Answer 1 ****************");
		while(req.equalsIgnoreCase("y")) {
			System.out.print("enter the employeeId: ");
			int empId = sc.nextInt();
			
			System.out.print("enter the empoyleeName: ");
			String empName = sc.next();
			
			System.out.print("enter the employeeEmail: ");
			String empEmail = sc.next();
			
			System.out.print("enter the employeeGender: ");
			char empGender = sc.next().charAt(0);
			
			System.out.print("enter the employeeSalary: ");
				float empSalary = sc.nextFloat();
			
				newEmp.add(new Employee(empId, empName, empEmail, empGender,empSalary));
				emp = new Employee(newEmp);
				
				System.out.println("********** Employee added successfully ***********");
				
				System.out.println("want to continue [y/n]: ");
			req = sc.next();	
		}
					
		emp.printDetails();
	
// -------------------------------------Answer1 : ( i ) end---------------************************************--------------------------------------------------------------
	
		String req2 = "y";
		System.out.println("************************** Answer1 : (i) *******************");
		while(req2.equalsIgnoreCase("y")) {
			System.out.println("Enter the Method you Want to do: \n 1. Add Employee \n 2. Delete Employee \n 3. ShowPaySlip \n 4. ShowAll \n 5.InsertEmployee using TreeSet then Exit");
			int option = sc.nextInt();
			switch(option) {
				case 1:{
					String req3 = "y";
					while(req3.equalsIgnoreCase("y")) {
						System.out.print("enter the employeeId: ");
						int empId = sc.nextInt();
						
						System.out.print("enter the empoyleeName: ");
						String empName = sc.next();
						
						System.out.print("enter the employeeEmail: ");
						String empEmail = sc.next();
						
						System.out.print("enter the employeeGender: ");
						char empGender = sc.next().charAt(0);
						
						System.out.print("enter the employeeSalary: ");
							float empSalary = sc.nextFloat();
						
						
							emp.addEmployee(empId, empName, empEmail, empGender,empSalary);
							System.out.println("********** Employee added successfully ***********");
							
							System.out.print("want to continue [y/n]: ");
							req3 = sc.next();	
						}
					break;
					}
				case 2:{
					System.out.print("Enter the Employee Id you want to Delete: ");
					int id = sc.nextInt();
					
					emp.removeEmployee(id);
					System.out.println("************* Employee Deleted Succesfully ***********");
					break;
					
				}
				case 3:{
					System.out.print("Enter the Employee Id you want see Salary : ");
					int id = sc.nextInt();
					emp.showSlip(id);
					break;
				}
				case 4:{
					emp.printDetails();
					break;
				}
				case 5:{
				//	************************* Answer 2 (ii) Adding Employee using TreeSet ***********************************
					System.out.println("**************************** Answer 2 (ii) Adding Employee using TreeSet ***********");
					Set<Employee> newEmpSet = new TreeSet<Employee>();
					
						String req4 = "y";
						while(req4.equalsIgnoreCase("y")) {
							System.out.print("enter the employeeId: ");
							int empId = sc.nextInt();
							
							System.out.print("enter the empoyleeName: ");
							String empName = sc.next();
							
							System.out.print("enter the employeeEmail: ");
							String empEmail = sc.next();
							
							System.out.print("enter the employeeGender: ");
							char empGender = sc.next().charAt(0);
							
							System.out.print("enter the employeeSalary: ");
								float empSalary = sc.nextFloat();
							
								Employee emp1 = new Employee(empId, empName, empEmail, empGender,empSalary);
								newEmpSet.add(emp1);
								System.out.println("********** Employee added successfully ***********");
								
								System.out.print("want to continue [y/n]: ");
								req4 = sc.next();	
							}
						///Enumeration<Employee> em = ((Object) newEmpSet).elements();
						Iterator<Employee> xyz = newEmpSet.iterator();
						while(xyz.hasNext()) {
							Employee values = xyz.next();
							System.out.println(values.toString());
						}
						

					System.out.println("******************  Developed By Sharib Saifi *****************");
					System.exit(0);
				}
			}
		}
		
	}

}
