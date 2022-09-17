package assignement01.Answer2;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class partSecondTreeSet {
	public static void main(String[] args) {
//		************************* Answer 2 (ii) Adding Employee using TreeSet ***********************************
		
		Scanner sc = new Scanner(System.in);
		System.out.println("**************************** Answer 2 (ii) Adding Employee using TreeSet ***********");
		Set<Employee> newEmpSet = new TreeSet<Employee>();
		
			String req4 = "y";
			while(req4.equalsIgnoreCase("y")) {
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
			

	}
}
