package co.Assignment02.Answer5.Operations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import co.Assignment02.Answer5.HighestSalary.HighestSalary;
import co.Assignment02.Answer5.Mapper.mapInput;

public class Operations {
	List<HighestSalary> list = new ArrayList<>();
	public void mapData(String [] input) {
		for (String data : input) {
			HighestSalary sal = mapInput.map(data);
			list.add(sal);
		}
	}
	
	public Integer maxSalary() {
		List getAllSalaryInList = new ArrayList<>();	
		Iterator it = list.iterator();
		while(it.hasNext()) {
			HighestSalary values = (HighestSalary) it.next();
			
			getAllSalaryInList.add(values.getSalary());
			
		}
		Integer maxSalary = (Integer) Collections.max(getAllSalaryInList);
		return maxSalary;
	}
	
	public void printData(Integer maxSalary) {
		Iterator it2 = list.iterator();
		while(it2.hasNext()) {
			HighestSalary values = (HighestSalary) it2.next();
			Integer getSalary = values.getSalary();
			if(maxSalary == getSalary) {
				System.out.println("Maximum Salary : " + maxSalary + " in " + values.getDepartment());
			}
		}
	}
}
