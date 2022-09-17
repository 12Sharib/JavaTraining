package assignment02.Answer6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
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
		String city = sc.next();
		
		
		Operations op = new Operations();
		Integer maxVotes = op.getMaxVotes(list,city);
		
		op.printDetails(list,maxVotes);

	}

}
