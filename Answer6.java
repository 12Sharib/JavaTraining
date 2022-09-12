package assignment02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Candidate{
	private Integer candidateId;
	private String candidateName;
	private String place;
	private Integer candidateVotes;
	public Candidate(Integer candidateId, String candidateName, String place, Integer candidateVotes) {
		this.candidateId = candidateId;
		this.candidateName = candidateName;
		this.place = place;
		this.candidateVotes = candidateVotes;
	}
	public Integer getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(Integer candidateId) {
		this.candidateId = candidateId;
	}
	public String getCandidateName() {
		return candidateName;
	}
	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public Integer getCandidateVotes() {
		return candidateVotes;
	}
	public void setCandidateVotes(Integer candidateVotes) {
		this.candidateVotes = candidateVotes;
	}
}

public class Answer6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Candidate> list = new ArrayList<>();
		
		list.add(new Candidate(22, "Ravi Pawar", "Aundh", 1603));
		list.add(new Candidate(23, "Suvarna Kale", "Baner", 803));
		list.add(new Candidate(	27, "Vinod Chavan", "Aundh", 809));
		list.add(new Candidate(29, "Vasant Mahajan", "Aundh", 617));
		list.add(new Candidate(	32, "Aarti Patil", "Baner", 351));
		list.add(new Candidate(34, "Swaran Bijur", "Baner", 352));
		
		System.out.print("enter the place for check maximumVotes: ");
		String place = sc.next();
		
		List<Integer> votes = new ArrayList<>();
		Iterator<Candidate> it = list.iterator();
		while(it.hasNext()) {
			Candidate values = it.next();
			String getPlace = values.getPlace();
			
			if(place.equals(getPlace)) {
				votes.add(values.getCandidateVotes());
			}
		}
		Integer maxVotes = Collections.max(votes);
		
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
