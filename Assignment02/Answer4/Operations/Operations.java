package co.Assignment02.Answer4.Operations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import co.Assignment02.Answer4.Mapper.inputMapper;
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
