package co.Assignment03.Answer3.Question05.Services;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;

import co.Assignment03.Answer3.Question05.Model.HighestSalary;

public class HighestSalaryServices {
	private List<HighestSalary> student = new ArrayList<>();
	public HighestSalaryServices(List<HighestSalary> student) {	
		this.student = student;
	}
//	public Set<String> getDepartment(){
//		
//		Set<String> getDepartment = student.stream().map(value -> value.getDepartment()).collect(Collectors.toSet());
//		return getDepartment;
//	}
//	public void findMaxSalary(Set<String> getDepartment){
//		for(HighestSalary values: student) {
//			String dep = values.getDepartment();
//			for(String oneDep : getDepartment) {
//				if(dep.equals(oneDep)) {
//					
//				}
//			}
//		}
//		Map<Object,Object> find = student.stream().sorted((valueFirst,valueSecond) -> valueSecond.getSalary().compareTo(valueFirst.getSalary()))
//		//Collect key and value(value in sorted order)
//		.collect(Collectors.toMap(key->key.getDepartment(), value->value.getSalary().max(value.getSalary(), value.getSalary()),
//		//If duplicate key and values		
//		(duplicateKey,duplicatevalue) -> duplicateKey + " "+duplicatevalue)));
				
		public Map<String,HighestSalary> findMaxSalary() {
		
			Map<String,HighestSalary> result =student.stream()
					.collect(Collectors.groupingBy(HighestSalary::getDepartment,Collectors.collectingAndThen
							(Collectors.maxBy(Comparator.comparingInt(HighestSalary::getSalary)), Optional::get)));
			return result;
		}
		public void printResult(Map<String,HighestSalary> result ) {
			for (Map.Entry<String, HighestSalary> value : result.entrySet()) {
				System.out.println(value.getValue().getDepartment() + " " + value.getValue().getSalary() );
			 
			}
		}
	}
