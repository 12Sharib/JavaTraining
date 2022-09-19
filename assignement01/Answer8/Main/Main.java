package assignement01.Answer8.Main;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

import assignement01.Answer8.Emp.Emp;

public class Main {
public static void main(String[] args) {
		
		Vector<Emp> list = new Vector<>();
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
		
		list.add(new Emp(empId,empName,empAddress,empSalary));
		
			System.out.print("want to add more[Y/N]: ");
			req = sc.next();
		}

		for(Emp st : list) {
			
				System.out.println("Employee : " + st.getEmpId()+ " " + st.getEmpName() +" " +  st.getEmpAddress() + " " +  st.getEmpSalary());
				System.out.println("--------*********---------");
			
		}
	

		Iterator<Emp> it = list.iterator();
		while(it.hasNext()) {
			Emp value = it.next();
		System.out.println(" id : " +  value.getEmpId()+ " Name : " + value.getEmpName() + " Address : " + value.getEmpAddress() + " Salary : " + value.getEmpSalary());
		}
		
		Enumeration<Emp> em = list.elements();
		while(em.hasMoreElements()) {
			Emp values = em.nextElement();

			System.out.println(values.getEmpId() + "  " + values.getEmpName());
		}
	}

}
