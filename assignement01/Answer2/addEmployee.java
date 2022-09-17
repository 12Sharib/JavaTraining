package assignement01.Answer2;

import java.util.ArrayList;
import java.util.Scanner;

public class addEmployee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Employee>	newEmp = new ArrayList<Employee>();
		Employee emp = null;
	
		String req = "y";
		System.out.println("****************************** Answer 1 ****************");
		while(req.equalsIgnoreCase("y")) {
			System.out.print("enter the employeeId: ");
			Integer empId = sc.nextInt();
			
			System.out.print("enter the empoyleeName: ");
			String empName = sc.next();
			
			System.out.print("enter the employeeEmail: ");
			String empEmail = sc.next();
			
			System.out.print("enter the employeeGender: ");
			Character empGender = sc.next().charAt(0);
			
			System.out.print("enter the employeeSalary: ");
				Float empSalary = sc.nextFloat();
			
				newEmp.add(new Employee(empId, empName, empEmail, empGender,empSalary));
				emp = new Employee(newEmp);
				
				System.out.println("********** Employee added successfully ***********");
				
				System.out.println("want to continue [y/n]: ");
			req = sc.next();	
		}
					
		emp.printDetails();
	
	}
}
