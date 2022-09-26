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
		  
	        for(HighestSalary hs:list) {
	        	departmentName.add(hs.getDepartment());
	        }
	        maxSalary(departmentName);
//	        System.out.println(departmentName);
	        
	}
	public void maxSalary(Set<String> departmentName) {
		
	       for (String dep : departmentName) {
	            List<Integer> salary = new ArrayList<>();

	            for(HighestSalary values:list) {
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
        	for(HighestSalary values:list) {
	            Integer getSal = values.getSalary();
	            if (maxSalary == getSal) {
	                System.out.println(values.getDepartment() + " : " + values.getSalary());
	            }
        }
	}
}
