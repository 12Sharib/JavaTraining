package assignment02.Answer4.Main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import assignment02.Answer4.Operations.Operations;
import assignment02.Answer4.Student.Student;


public class Main {
	public static void main(String[] args) {
		Operations op = new Operations();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the subjectName for get average: ");
		String subjectName = sc.nextLine();
		
		List<Student> list = new ArrayList<>();
		list.add(new Student(22, "Data Structures", 45));
		list.add(new Student(23, "English", 52));
		list.add(new Student(22, "English", 51));
		list.add(new Student(26, "Data Structures", 72));
		list.add(new Student(23, "Data Structures", 61));
		list.add(new Student(24, "English", 81));
		
		op.CalculateAverage(list, subjectName);
		

	}

}
