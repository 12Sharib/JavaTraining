package com.Assignment02.Answer4.Services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.Assignment02.Answer4.Mapper.InputMapper;
import com.Assignment02.Answer4.Student.Student;


public class StudentService {
	private List<Student> studentArrayList;
	public StudentService(List<Student> studentArrayList) {
		
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
