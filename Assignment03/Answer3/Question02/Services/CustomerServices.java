package co.Assignment03.Answer3.Question02.Services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import co.Assignment03.Answer3.Question02.Model.Customer;

public class CustomerServices {
	private List<Customer> Customers = new ArrayList<>();
	
	public CustomerServices(List<Customer> customers) {
		
		Customers = customers;
	}
	public Set<String> duplicateProducts(){

		Set<String> duplicateProducts = Customers.stream()
         .collect( 
             Collectors.groupingBy( 
                 Customer::getProduct, 
                 Collectors.counting())).entrySet().stream().filter(m -> m.getValue() > 1) 
		         .map(Map.Entry::getKey)
		         .collect(Collectors.toSet()); 
		return duplicateProducts;
	}
	public Map<String, Customer> CustomesWithMinimumDiscount() {
	
		Map<String, Customer> CustomesWithMinimumDiscount= Customers.stream().collect(Collectors.groupingBy(Customer::getProduct,
				Collectors.collectingAndThen(Collectors.minBy(Comparator.comparingInt(Customer::getPrice)), Optional::get)));
		return CustomesWithMinimumDiscount;
	}
		public void printResult(Map<String, Customer> CustomesWithMinimumDiscount,Set<String> duplicateProducts) {
		
		for (String values : duplicateProducts) {
			for (Entry<String, Customer> sc : CustomesWithMinimumDiscount.entrySet()) {
				if(values.equals(sc.getKey())){
					System.out.println(sc.getValue().getName());
				}
			}
		}
	}

}
