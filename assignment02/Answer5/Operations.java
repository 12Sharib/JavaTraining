package assignment02.Answer5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Operations {
	Integer getMaxSalary(List<HighestSalary> list, String department) {
		Iterator<HighestSalary> it = list.iterator();
		List<Integer> salary = new ArrayList<>();
		
		while(it.hasNext()) {
			HighestSalary values = it.next();
			String getDepartment = values.getDepartment();
			
			if(department.equals(getDepartment)) {
				Integer getSalary = values.getSalary();
				salary.add(getSalary);
			}
		}
		Integer maxSalary = Collections.max(salary);
		return maxSalary;
	}
	
	void printOperation(List<HighestSalary> list, Integer maxSalary) {
		Iterator<HighestSalary> it2 = list.iterator();
		while(it2.hasNext()) {
			HighestSalary values = it2.next();
			Integer getSal = values.getSalary();
			if(maxSalary == getSal) {
				System.out.println(values.getStudentId() + ", " +values.getStudentName() +" has highest Salary in " + values.getDepartment() + ", Salary is " + maxSalary );
			}
		}
	}
}
