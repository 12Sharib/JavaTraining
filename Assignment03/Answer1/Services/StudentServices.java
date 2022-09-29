package co.Assignment03.Answer1.Services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import co.Assignment03.Answer1.Model.Students;

public class StudentServices {
	 private List<Students> Student = new ArrayList<>();
	public StudentServices(List<Students> Student) {
		
		this.Student = Student;
	}
	public List<Students>  sortByName() {	
		System.out.println("\nsortByName \n");
		List<Students> sortByNameList =
			Student.stream()
	        .sorted((valueFirst, valueSecond)->valueFirst.getStudentName().compareTo(valueSecond.getStudentName()))
	        .collect(Collectors.toList());
			
			return sortByNameList;
		}
	public List<Students> sortById() {
		System.out.println("\nsortByID in descending order \n");
		
		List<Students> sortByIdList = 
		Student.stream()
	        .sorted((valueFirst, valueSecond)->valueSecond.getStudentId().compareTo(valueFirst.getStudentId()))
	        .collect(Collectors.toList());
		
		return sortByIdList;
	}
	public List<Students> filterFirst() {
		System.out.println("\nvalues greater than 23 \n");
		List<Students> studentsGreaterThan23 = new ArrayList<>();
		Student.stream().filter(values -> values.getStudentId() > 23).forEach(value -> studentsGreaterThan23.add(value));
		return studentsGreaterThan23;
	}
	
	public List<Students> filterSecond() {
		System.out.println("\nvalues less than 23 \n");
		List<Students> studentLessThan23 =
		Student.stream().filter(values -> values.getStudentId() < 23).collect(Collectors.toList());
		return studentLessThan23;
	}
	public List<Students> lengthLessThanFive() {
		System.out.println("\nlengthLessThanFive \n");

		List<Students> lengthLessThanFive = Student.stream().filter(values-> (values.getStudentName().length() <=5) ).collect(Collectors.toList());
		
		return lengthLessThanFive;
	}
	public Map<Integer, String> Map() {
	//	Map<Integer, String> mapper = new HashMap<>();
		
//		for(Students value : Student) {
//			Integer Ids = value.getStudentId();
//			String names = value.getStudentName();
//			mapper.put(Ids, names);
//		}
		 
		Map<Integer, String> mapStudents = Student.stream().collect(Collectors.toMap(key -> key.getStudentId(), value -> value.getStudentName(), 
			 (duplicateKey,duplicateValue ) -> duplicateKey +" , "+duplicateValue));
		return mapStudents;
	}
}

