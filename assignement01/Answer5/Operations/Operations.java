package assignement01.Answer5.Operations;

import java.util.Iterator;
import java.util.List;

import assignement01.Answer5.Employee.Employee;

public class Operations {
	public void searchEmp(List list,Integer searchId){
		Iterator it =  list.iterator();
		while(it.hasNext()) {
			Employee values = (Employee) it.next();
			Integer value = values.getEmpId();
			if(searchId == value) {
				System.out.println("Employee : " + values.getEmpId() + " " + values.getEmpName() +" " +  values.getEmpAddress() + " " +  values.getEmpSalary());
				System.out.println("--------*********---------");
			}
		}
	}
}
