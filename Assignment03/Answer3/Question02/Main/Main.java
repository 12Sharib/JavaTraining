package co.Assignment03.Answer3.Question02.Main;

import java.util.List;
import java.util.Map;
import java.util.Set;

import co.Assignment03.Answer3.Question02.InputParser.CustomerParser;
import co.Assignment03.Answer3.Question02.Model.Customer;
import co.Assignment03.Answer3.Question02.Services.CustomerServices;

public class Main {
	public static void main(String[] args) {
		try {
			String path ="/home/mohds/java/CollectionAssingnment03/src/co/Assignment03/Answer3/Question02/InputFile/CustomerInput";
			CustomerParser inputParser = new CustomerParser();
			List<Customer> Customers = inputParser.parseInput(path);
			
			CustomerServices services = new CustomerServices(Customers);
			//duplicateProducts
			Set<String> duplicateProducts = services.duplicateProducts();
			
			//Collect All Customer with min discount
			Map<String, Customer> CustomesWithMinimumDiscount = services.CustomesWithMinimumDiscount();
			//print result
			services.printResult(CustomesWithMinimumDiscount,duplicateProducts);
		}catch(Exception ex) {
			throw new RuntimeException(ex);
		}
	}

}
