package co.Assignment02.Answer6.Operations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import co.Assignment02.Answer6.Candidate.Candidate;


public class Operations {
	private List<Candidate> list = new ArrayList<>();
	
	public Operations(List<Candidate> list) {
		this.list = list;
	}
	public void getAllPlaces() {
		Iterator<Candidate> it = list.iterator();
		Set<String> getAllPlaces = new HashSet<>();
		while(it.hasNext()) {
			Candidate values =  it.next();
			String places = values.getPlace();
			
			getAllPlaces.add(places);
		}
		getAllVotes(getAllPlaces);
	}
	//	System.out.println(getAllPlaces);
	public void getAllVotes(Set<String> getAllPlaces) {
		List<Integer> getAllVotes = new ArrayList<>();
		for (String place : getAllPlaces) {
			Iterator<Candidate> it2 = list.iterator();
			while(it2.hasNext()) {
				Candidate values = it2.next();
				
				if(place.equals(values.getPlace())) {
					getAllVotes.add(values.getCandidateVotes());
				}
			}
			Integer maxVote = Collections.max(getAllVotes);
			printSolution(maxVote);
			
		}
	}
	public void printSolution(Integer maxVote) {
		Iterator<Candidate> it = list.iterator();
		while(it.hasNext()) {
			Candidate values = it.next();
			Integer vote = values.getCandidateVotes();
			
			if(vote == maxVote) {
				System.out.println(values.getCandidateId() + " : " + values.getPlace());
			}
		}
	}
	
}
