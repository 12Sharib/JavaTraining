package co.Assignment02.Answer5.Operations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import co.Assignment02.Answer5.HighestSalary.HighestSalary;
import co.Assignment02.Answer5.Mapper.mapInput;

public class Operations {
	private List<HighestSalary> list = new ArrayList<>();
	public Operations(List<HighestSalary> list) {
			
			this.list = list;
		}
	
	public void getAllDepartment() {
		  Set<String> departmentName = new HashSet<>();
	        Iterator<HighestSalary> it1 =list.iterator();
	        while (it1.hasNext()) {
	        	HighestSalary hs = it1.next();
	        	departmentName.add(hs.getDepartment());
	        }
	        maxSalary(departmentName);
//	        System.out.println(departmentName);
	        
	}
	public void maxSalary(Set<String> departmentName) {
		
	       for (String dep : departmentName) {
	            Iterator<HighestSalary> it =list.iterator();
	            List<Integer> salary = new ArrayList<>();

	            while (it.hasNext()) {
	            	HighestSalary values = it.next();
	                String getDepartment = values.getDepartment();

	                if (dep.equals(getDepartment)) {
	                    Integer getSalary = values.getSalary();
	                    salary.add(getSalary);
	                }
	            }
	            Integer maxSalary = Collections.max(salary);
	            printResult(maxSalary);
	            
	        }
	}
	public void printResult(Integer maxSalary) {
		Iterator<HighestSalary> it2 =list.iterator();
        while (it2.hasNext()) {
        	HighestSalary values = it2.next();
            Integer getSal = values.getSalary();
            if (maxSalary == getSal) {
                System.out.println(values.getDepartment() + " : " + values.getSalary());
            }
        }
	}
}
