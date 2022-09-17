package assignment02.Answer5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		
		Operations op = new Operations();
		Scanner sc = new Scanner(System.in);
		
		List<HighestSalary> list = new ArrayList<>();
		list.add(new HighestSalary(22, "Rajan Anand", "Engineering", 1600000));
		list.add(new HighestSalary(23, "Swati Patil", "Testing", 800000));
		list.add(new HighestSalary(27, "Vijay Chawda", "Engineering", 800000));
		list.add(new HighestSalary(29, "Basant Mahapatra", "Engineering", 600000));
		list.add(new HighestSalary(32, "Ajay Patel", "Testing", 350000));
		list.add(new HighestSalary(34, "Swaraj Birla", "Testing", 350000));
		
		System.out.print("enter the department want to check highest salary: ");
		String department = sc.next();
		
		Integer maxSalary = op.getMaxSalary(list,department);
		
		op.printOperation(list,maxSalary);
		

	}

}
