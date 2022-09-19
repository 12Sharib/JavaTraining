package assignment02.Answer6.Operations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import assignment02.Answer6.Candidate.Candidate;

public class Operations {
	public Integer getMaxVotes(List list, String city) {
		List<Integer> votes = new ArrayList<>();
		Iterator<Candidate> it = list.iterator();
		while(it.hasNext()) {
			Candidate values = it.next();
			String getPlace = values.getPlace();
			
			if(city.equals(getPlace)) {
				votes.add(values.getCandidateVotes());
			}
		}
		Integer maxVotes = Collections.max(votes);
		return maxVotes;
	}

	public void printDetails(List<Candidate> list, Integer maxVotes) {
		Iterator<Candidate> it2 = list.iterator();
		while(it2.hasNext()) {
			Candidate values = it2.next();
			Integer getVotes = values.getCandidateVotes();
			
			if(maxVotes == getVotes) {
				System.out.println(values.getCandidateId() + ", "+values.getCandidateName() + " has got maxVotes in " + values.getPlace() + ", maxVotes are " + maxVotes);
			}
		}
		
	}
}
