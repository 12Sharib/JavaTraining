package co.Assignment03.Answer3.Question06.Mapper;

import co.Assignment03.Answer3.Question06.Model.Candidate;

public class CandidateMapper {
	public class MapInput {
		public static Candidate map(String data) {
			String split[] = data.split(", ");
			Candidate candidate = new Candidate();
			
			try {
				Integer candidateId = Integer.parseInt(split[0]);
				String candidateName = split[1];
				String candidatePlace = split[2];
				Integer candidateVotes = Integer.parseInt(split[3]);
				
				candidate.setCandidateId(candidateId);
				candidate.setCandidateName(candidateName);
				candidate.setPlace(candidatePlace);
				candidate.setCandidateVotes(candidateVotes);
				
			}catch(NumberFormatException numberFormat) {
				throw new RuntimeException(numberFormat);
			}catch(Exception ex) {
				throw new RuntimeException(ex);
			}
			return candidate;
		}
	}

}
