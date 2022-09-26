package co.Assignment02.Answer4.Operations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import co.Assignment02.Answer4.Mapper.InputMapper;
import co.Assignment02.Answer4.Student.Student;


public class Operations {
	private List<Student> studentArrayList;
	public Operations(List<Student> studentArrayList) {
		
		this.studentArrayList = studentArrayList;
	}

	public void printOutput(Float average,Integer minId) {
		System.out.println("Average for minId " + minId + " : " + average);
	}
	
	public Float findAverage(Integer minimumIdInList) {
		
		Integer sum = 0;
		Integer temp = 0;
		
		for(Student values:studentArrayList) {
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
		
		for(Student values:studentArrayList) {
			 minId.add(values.getStudentId());
		}
		Integer minimumIdInList = Collections.min(minId);
		return minimumIdInList;
		
	}
}
