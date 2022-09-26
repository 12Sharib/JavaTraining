package co.Assignment02.Answer02.Operations;



import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import co.Assignment02.Answer02.Customer.Customer;



public class Operations {
	private List<Customer> list = new ArrayList<>();
	public Operations(List<Customer> list) {
		this.list = list;
	}
	public void getAllProducts() {
		List<String> getAllProducts = new ArrayList<>();
 			for(Customer values:list) {
 				getAllProducts.add((values.getProduct()));
 		}
 		findCopyProducts(getAllProducts);
	}
	
	public void findCopyProducts(List<String> getAllProducts) {
		Set<String> seen = new HashSet<>();
		Set<String> duplicates = new HashSet<>();
		for (String values : getAllProducts) {
			if(!seen.add(values)) {
				duplicates.add(values);
			}
		}
//		System.out.println(duplicates);
		findMinimumDiscount(duplicates);
	}
	public void findMinimumDiscount(Set<String> duplicates) {
		List<Integer> getAllPrices = new ArrayList<>();
		for (String value : duplicates) {
				for(Customer values:list) {
				if(value.equals(values.getProduct())) {
					getAllPrices.add(values.getPrice());
				}
			}
		//	System.out.println(value + " " + getAllPrices);
			Integer minDiscount = Collections.min(getAllPrices);
		//	System.out.println(minDiscount);
			printResult(minDiscount);
		}
	}
	public void printResult(Integer minDiscount) {
			for(Customer values:list) {
			if(minDiscount == values.getPrice()) {
				System.out.println(values.getName());
			}
		}
	}
}

