package assignement01.Answer5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
	
	List<Employee> list = new ArrayList<Employee>();
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
		
		list.add(new Employee(empId,empName,empAddress,empSalary));
		
			System.out.print("want to add more[Y/N]: ");
			req = sc.next();
	}
	System.out.print("enter the empId for Search: ");
		Integer id = sc.nextInt();
		Operations op = new Operations();
		
		op.searchEmp(list,id);
	}
}


