package com.Assignment02.Answer5.Services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.Assignment02.Answer5.HighestSalary.HighestSalary;
import com.Assignment02.Answer5.Mapper.MapInput;

public class CandidateServices {
	private List<HighestSalary> Candidatelist = new ArrayList<>();
	public CandidateServices(List<HighestSalary> Candidatelist) {
			
			this.Candidatelist = Candidatelist;
		}
	
	public void getAllDepartment() {
		  Set<String> departmentName = new HashSet<>();
		  
	        for(HighestSalary hs:Candidatelist) {
	        	departmentName.add(hs.getDepartment());
	        }
	        maxSalary(departmentName);
//	        System.out.println(departmentName);
	        
	}
	public void maxSalary(Set<String> departmentName) {
		
	       for (String dep : departmentName) {
	            List<Integer> salary = new ArrayList<>();

	            for(HighestSalary values:Candidatelist) {
	                String getDepartment = values.getDepartment();

	                if (dep.equals(getDepartment)) {
	                    Integer getSalary = values.getSalary();
	                    salary.add(getSalary);
	                }
	            }
	            printResult(Collections.max(salary));
	            
	        }
	}
	public void printResult(Integer maxSalary) {
        	for(HighestSalary values:Candidatelist) {
	            Integer getSal = values.getSalary();
	            if (maxSalary == getSal) {
	                System.out.println(values.getDepartment() + " : " + values.getSalary());
	            }
        }
	}
}
