package co.Assignment03.Answer3.Question06.Model;

public class Candidate {
		private Integer candidateId;
		private String candidateName;
		private String place;
		private Integer candidateVotes;
		
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
		@Override
		public String toString() {
			return "Candidate [candidateId=" + candidateId + ", candidateName=" + candidateName + ", place=" + place
					+ ", candidateVotes=" + candidateVotes + "]\n";
		}

	}

