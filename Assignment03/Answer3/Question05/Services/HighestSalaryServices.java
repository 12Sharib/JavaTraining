package co.Assignment03.Answer3.Question05.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import co.Assignment03.Answer3.Question05.Model.HighestSalary;

public class HighestSalaryServices {
	private List<HighestSalary> student = new ArrayList<>();
	public HighestSalaryServices(List<HighestSalary> student) {	
		this.student = student;
	}
	public Set<String> getDepartment(){
		
		Set<String> getDepartment = student.stream().map(value -> value.getDepartment()).collect(Collectors.toSet());
		return getDepartment;
	}
	public Map<Object, Object> findMaxSalary(){
		Map<Object, Object> findMax = student.stream().collect(Collectors.toMap(key ->key.getDepartment(),value ->value.getSalary()
				,(key,value) -> key + " " + value));
		return findMax;
	}
	
}
