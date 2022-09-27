package com.Assignment02.Answer6.Services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.Assignment02.Answer6.Candidate.Candidate;


public class CandidateService {
	private List<Candidate> candidateList = new ArrayList<>();
	
	public CandidateService(List<Candidate> candidateList) {
		this.candidateList = candidateList;
	}
	public void getAllPlaces() {
		Set<String> getAllPlaces = new HashSet<>();
		
		for(Candidate values :candidateList) {
			String places = values.getPlace();
			
			getAllPlaces.add(places);
		}
		getAllVotes(getAllPlaces);
	}
	//	System.out.println(getAllPlaces);
	public void getAllVotes(Set<String> getAllPlaces) {
		List<Integer> getAllVotes = new ArrayList<>();
		for (String place : getAllPlaces) {
				for(Candidate values:candidateList) {
					if(place.equals(values.getPlace())) {
						getAllVotes.add(values.getCandidateVotes());
					}
			}
			Integer maxVote = Collections.max(getAllVotes);
			printSolution(maxVote);
			
		}
	}
	public void printSolution(Integer maxVote) {
			for(Candidate values:candidateList) {
				Integer vote = values.getCandidateVotes();
			
				if(vote == maxVote) {
					System.out.println(values.getCandidateId() + " : " + values.getPlace());
				}
		}
	}
	
}
