package assignement01.Answer2.partFirst;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import assignement01.Answer2.Employee.*;

public class partFirst {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	ArrayList<Employee>	newEmp = new ArrayList<Employee>();
	Employee emp = null;
	String req2 = "y";
	System.out.println("************************** Answer1 : (i) *******************");
	while(req2.equalsIgnoreCase("y")) {
		System.out.println("Enter the Method you Want to do: \n 1. Add Employee \n 2. Delete Employee \n 3. ShowPaySlip \n 4. ShowAll \n 5. Exit");
		int option = sc.nextInt();
		switch(option) {
			case 1:{
				String req3 = "y";
				while(req3.equalsIgnoreCase("y")) {
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
						
						System.out.print("want to continue [y/n]: ");
						req3 = sc.next();	
					}
				break;
				}
			case 2:{
				System.out.print("Enter the Employee Id you want to Delete: ");
				Integer id = sc.nextInt();
				
				emp.removeEmployee(id);
				System.out.println("************* Employee Deleted Succesfully ***********");
				break;
				
			}
			case 3:{
				System.out.print("Enter the Employee Id you want see Salary : ");
				Integer id = sc.nextInt();
				emp.showSlip(id);
				break;
			}
			case 4:{
				emp.printDetails();
				break;
			}
			case 5:{
				System.out.println("******************  Developed By Sharib Saifi *****************");
				System.exit(0);
			}
		}
	}
 }
}
	
 




