package assignementCollection;


import java.util.Enumeration;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

class emp{
	int empId;
	String empName;
	String empAddress;
	float empSalary;
	public emp(int empId, String empName, String empAddress, float empSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return "emp [empId=" + empId + ", empName=" + empName + ", empAddress=" + empAddress + ", empSalary="
				+ empSalary + "]";
	}
}


public class Answer8 {

	public static void main(String[] args) {
		
		Vector<emp> list = new Vector<emp>();
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
		
		list.add(new emp(empId,empName,empAddress,empSalary));
		
			System.out.print("want to add more[Y/N]: ");
			req = sc.next();
		}

		for(emp st : list) {
			
				System.out.println("Employee : " + st.empId + " " + st.empName +" " +  st.empAddress + " " +  st.empSalary);
				System.out.println("--------*********---------");
			
		}
	

		Iterator<emp> it = list.iterator();
		while(it.hasNext()) {
			emp value = it.next();
		System.out.println(" id : " +  value.empId + " Name : " + value.empName + " Address : " + value.empAddress + " Salary : " + value.empSalary);
		}
		
		Enumeration<emp> em = list.elements();
		while(em.hasMoreElements()) {
//			int id1 = em.nextElement().empId;
//			String name = em.nextElement().empName;
//			String address = em.nextElement().empAddress;
//			float sal = em.nextElement().empSalary;
//			System.out.println(id1 + " " + name + " " + address + " " +sal);
//			System.out.println(em.nextElement().empId + " " + em.nextElement().empName + " " + em.nextElement().empAddress + " " + em.nextElement().empSalary);
			System.out.println(em.nextElement().empId + "  " + em.toString());
		}
	}
}

