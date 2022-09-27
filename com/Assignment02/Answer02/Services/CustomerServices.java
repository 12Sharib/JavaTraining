package com.Assignment02.Answer02.Services;



import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.Assignment02.Answer02.Customer.Customer;



public class CustomerServices {
	private List<Customer> customerList = new ArrayList<>();
	public CustomerServices(List<Customer> customerList) {
		this.customerList = customerList;
	}
	public void getAllProducts() {
		List<String> getAllProducts = new ArrayList<>();
 			for(Customer values:customerList) {
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
				for(Customer values:customerList) {
				if(value.equals(values.getProduct())) {
					getAllPrices.add(values.getPrice());
				}
			}
		//	System.out.println(value + " " + getAllPrices);
			
		//	System.out.println(minDiscount);
			printResult(Collections.min(getAllPrices));
		}
	}
	public void printResult(Integer minDiscount) {
			for(Customer values:customerList) {
			if(minDiscount == values.getPrice()) {
				System.out.println(values.getName());
			}
		}
	}
}

