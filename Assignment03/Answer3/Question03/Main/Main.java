package co.Assignment03.Answer3.Question03.Main;

import java.util.List;
import java.util.Map;
import java.util.Set;

import co.Assignment03.Answer3.Question03.InputParser.LibraryInputParser;
import co.Assignment03.Answer3.Question03.Model.OutdatedLibrary;
import co.Assignment03.Answer3.Question03.Services.LibraryServices;

public class Main {
	public static void main(String[] args) {
		try {
			String path = "//home/mohds/java/CollectionAssingnment03/src/co/Assignment03/Answer3/Question03/InputFile/LibraryInput";
			LibraryInputParser libraryInputParser = new LibraryInputParser();
			List<OutdatedLibrary> input = libraryInputParser.parseFile(path);
			
			LibraryServices services = new LibraryServices(input);
			Map<String, Set<Integer>> libraryVersionsList = services.OutdatedLibrary();
			services.printResult(libraryVersionsList);
		}catch(Exception ex) {
			throw new RuntimeException(ex);
		}
	}
}
