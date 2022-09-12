package assignementCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class employee{
	int empId;
	String empName;
	String empAddress;
	float empSalary;
	public employee(int empId, String empName, String empAddress, float empSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
		this.empSalary = empSalary;
	}
}


public class Answer5 {

	public static void main(String[] args) {
		
		ArrayList<employee> list = new ArrayList<employee>();
		Scanner sc = new Scanner(System.in);
		String req = "y";
		
		while(req.equalsIgnoreCase("y")) {
		
		System.out.print("enter the employeeId: ");
		int empId = sc.nextInt();
		
		System.out.print("enter the empoyleeName: ");
		String empName = sc.next();
		
		System.out.print("enter the employeeEmail: ");
		String empAddress = sc.next();
		
		System.out.print("enter the employeeSalary: ");
		float empSalary = sc.nextFloat();
		
		list.add(new employee(empId,empName,empAddress,empSalary));
		
			System.out.print("want to add more[Y/N]: ");
			req = sc.next();
		}
		
		System.out.print("enter the empId for Search: ");
		Integer id = sc.nextInt();
		for(employee st : list) {
			if(id == st.empId) {
				System.out.println("Employee : " + st.empId + " " + st.empName +" " +  st.empAddress + " " +  st.empSalary);
				System.out.println("--------*********---------");
			}
		}
	}
	

}
