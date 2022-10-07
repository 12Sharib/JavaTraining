package co.Assignment03.Answer3.Question04.Services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import co.Assignment03.Answer3.Question04.Model.Subject;

public class subjectServices {
	private List<Subject> subjects  = new ArrayList<>();
	public subjectServices(List<Subject> subjects) {	
		this.subjects = subjects;
	}
	
	public Integer findMinId() {
	//	List<Integer> minIdList = new ArrayList<>();
//		subjects.stream().sorted((valueFirst,valueSecond) -> valueFirst.getSubjectId().compareTo(valueSecond.getSubjectId()))
//				.forEach(value -> minIdList.add(value.getSubjectId()));
		
		return subjects.stream().mapToInt(value -> value.getSubjectId()).min().orElseThrow(NoSuchElementException::new);
	}
	public Double findAverage(Integer minId) {
		Double Average =  subjects.stream().filter(value -> value.getSubjectId() == minId)
				.mapToInt(value -> value.getSubjectMarks()).average().getAsDouble();
		// System.out.println(Average);
		
		//.collect(Collectors.toList());
//		
//		Integer sumOfValues = subjectMarks.stream()
//				  .reduce(0, (a, b) -> a + b);
//		
//		Integer totalNumberOfValues = subjectMarks.size();
//		
//		return (double) (sumOfValues / totalNumberOfValues); 
		 return Average;
	}

}
