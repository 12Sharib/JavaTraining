package co.Assignment03.Answer1.Services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import co.Assignment03.Answer1.Student.Students;

public class StudentServices {
	 List<Students> studentList = new ArrayList<>();

	public void MakeList(String []studentsInformation) {
		 for (String str : studentsInformation) {
             String[] arrData = str.split(", ");
             Integer studId = Integer.parseInt(arrData[0]);
             String studName = arrData[1];
             Students student = new Students(studId,studName);
             studentList.add(student);
         }
	}
	public void sortByName() {	
		System.out.println("\nsortByName \n");
		studentList.stream()
	        .sorted((valueFirst, valueSecond)->valueFirst.getStudentName().compareTo(valueSecond.getStudentName()))
	        .forEach(value -> System.out.println(value));
		 
		}
	public void sortById() {
		System.out.println("\nsortByID in descending order \n");
		studentList.stream()
	        .sorted((valueFirst, valueSecond)->valueSecond.getStudentId().compareTo(valueFirst.getStudentId()))
	        .forEach(value -> System.out.println(value));
	}
	public void filterFirst() {
		System.out.println("\nvalues greater than 23 \n");
		studentList.stream().filter(values -> values.getStudentId() > 23).forEach(value -> System.out.println(value));
	}
	public void filterSecond() {
		System.out.println("\nvalues less than 23 \n");
		studentList.stream().filter(values -> values.getStudentId() < 23).forEach(value -> System.out.println(value));
	}
	public void lengthLessThanFive() {
		System.out.println("\nlengthLessThanFive \n");
		
		for(Students values : studentList) {
			for(int i=0;i<studentList.size();i++) {
				if(values.getStudentName().length() <= 5) {
					System.out.println(values.getStudentName() + " " + values.getStudentId());
					break;
				}
			}
		}
	}
}

