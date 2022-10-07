package co.Assignment03.Answer3.Question01.Main;

import java.util.List;
import java.util.Map;
import java.util.Set;

import co.Assignment03.Answer3.Question01.InputParser.SoftwareInputParser;
import co.Assignment03.Answer3.Question01.Model.Software;
import co.Assignment03.Answer3.Question01.Services.SoftwareServices;

public class Main {
	public static void main(String[] args) {
		try {
			String path = "/home/mohds/java/CollectionAssingnment03/src/co/Assignment03/Answer3/Question01/InputFile/SoftwareInput";
			
			SoftwareInputParser inputParser = new SoftwareInputParser();
			List<Software> Softwares = inputParser.parseFile(path);
			
			SoftwareServices services = new SoftwareServices(Softwares);
			Map<String, Set<Double>> SoftwareVersions = services.SoftwareVersions();
			services.printResult(SoftwareVersions);
		}catch(Exception ex) {
			throw new RuntimeException(ex);
		}
	}
}
