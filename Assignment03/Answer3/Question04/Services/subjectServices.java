package co.Assignment03.Answer3.Question04.Services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

import co.Assignment03.Answer3.Question04.Model.Subject;

public class subjectServices {
	private List<Subject> subjects  = new ArrayList<>();
	public subjectServices(List<Subject> subjects) {	
		this.subjects = subjects;
	}
	
	public Integer findMinId() {
		List<Integer> minIdList = new ArrayList<>();
		subjects.stream().sorted((valueFirst,valueSecond) -> valueFirst.getSubjectId().compareTo(valueSecond.getSubjectId()))
				.forEach(value -> minIdList.add(value.getSubjectId()));
		
		return minIdList.stream().min((first,Second)->first.compareTo(Second)).get();
	}
	public Double findAverage(Integer minId) {
		List<Integer> subjectMarks = subjects.stream().filter(value -> value.getSubjectId() == minId).map(value -> value.getSubjectMarks())
		.collect(Collectors.toList());
		
		Integer sumOfValues = subjectMarks.stream()
				  .reduce(0, (a, b) -> a + b);
		
		Integer totalNumberOfValues = subjectMarks.size();
		
		return (double) (sumOfValues / totalNumberOfValues); 
	}

}
