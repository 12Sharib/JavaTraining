package co.Assignment03.Answer3.Question05.Main;

import java.util.List;
import java.util.Map;
import java.util.Set;

import co.Assignment03.Answer3.Question05.InputParser.HighestSalaryParser;
import co.Assignment03.Answer3.Question05.Model.HighestSalary;
import co.Assignment03.Answer3.Question05.Services.HighestSalaryServices;

public class Main {
	public static void main(String[] args) {
		try {
			String path ="/home/mohds/java/CollectionAssingnment03/src/co/Assignment03/Answer3/Question05/InputFile/HighestSalaryInput";
			HighestSalaryParser highestSalaryParser = new HighestSalaryParser();
			List<HighestSalary> input = highestSalaryParser.parseFile(path);
			//System.out.println(input);
			HighestSalaryServices services = new HighestSalaryServices(input);
	
			Map<String,HighestSalary> result = services.findMaxSalary();
			
			services.printResult(result);
		}catch(Exception ex) {
			throw new RuntimeException(ex);
		}
	}
}
