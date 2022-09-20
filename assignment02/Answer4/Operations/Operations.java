package co.Assignment02.Answer4.Operations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import co.Assignment02.Answer4.Mapper.mapStudent;
import co.Assignment02.Answer4.Student.Student;


public class Operations {
	List studentArrayList = new ArrayList<>();
	
	public void mapInput(String input[] ) {
	
		for (String data : input) {
			
			Student student = mapStudent.map(data);
			studentArrayList.add(student);
		}
	}
	
	public void printOutput(Float average) {
		System.out.println("Average : " + average);
	}
	public Float findAverage(Integer minimumIdInList) {
		
		Iterator<Student> it2 = studentArrayList.iterator();
		Integer sum = 0;
		Integer temp = 0;
		while(it2.hasNext()) {
			Student values = it2.next();
			if(minimumIdInList ==  values.getStudentId()) {
				sum += values.getStudentMarks();
				temp++;
			}
		}
		Float average = (float) (sum / temp);
		return average;
	}
	
	public Integer findMinimumInList() {
		List<Integer> minId = new ArrayList<>();
		
		Iterator<Student> it = studentArrayList.iterator();

		while(it.hasNext()) {
			Student values = it.next();
			 minId.add(values.getStudentId());
		}
		Integer minimumIdInList = Collections.min(minId);
		return minimumIdInList;
		
	}
}
