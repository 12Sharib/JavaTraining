package co.Assignment03.Answer3.Question06.Services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import co.Assignment03.Answer3.Question06.Model.Candidate;

public class CandidateServices {
	private List<Candidate> Candidates = new ArrayList<>();

	public CandidateServices(List<Candidate> candidates) {
		Candidates = candidates;
	}
	public Map<Object, Candidate> HighestVotes(){
		
//		Map<Object, Object> list = Candidates.stream()
//				.sorted(Comparator.comparing(Candidate::getCandidateVotes).reversed())
//				.collect(Collectors.toMap(key->key.getCandidateId(), 
//						value->Candidates.stream().collect(Collectors.maxBy(Comparator.comparingInt(Candidates::)))
//				,(dup,d) -> dup + " " +d));
			
		Map<Object,Candidate> result= Candidates.stream().collect(Collectors.groupingBy(value->value.getPlace()
				,Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(Candidate::getCandidateVotes))
						,Optional::get)));
		return result;
	}
	public void printResult(Map<Object, Candidate> result) {
		for (Entry<Object, Candidate> ans : result.entrySet()) {
			System.out.println(ans.getValue().getPlace() + " " + ans.getValue().getCandidateId());
		}
	}

}
