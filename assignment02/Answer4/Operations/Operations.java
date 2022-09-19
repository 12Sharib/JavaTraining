package assignment02.Answer4.Operations;

import java.util.Iterator;
import java.util.List;

import assignment02.Answer4.Student.Student;

public class Operations {
	public void CalculateAverage(List list,String subjectName) {
		Iterator<Student> it = list.iterator();
		Integer temp = 0;
		Integer Sum = 0;
		while(it.hasNext()) {
			Student values = it.next();
			String getSubjectName = values.getSubjectName();
			
			if(subjectName.equals(getSubjectName)) {
				Sum = Sum + values.getStudentMarks();
				temp ++;
			}
		}
		Float average =  ((float) Sum / (Integer)temp);
		System.out.println("Average : " + average);		
		
	}
}
