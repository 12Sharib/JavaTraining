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
		Iterator<Customer> it = list.iterator();
		List<String> getAllProducts = new ArrayList<>();
 		while(it.hasNext()) {
 			Customer values = it.next();
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
			Iterator<Customer> it = list.iterator();
			while(it.hasNext()) {
				Customer values = it.next();
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
		Iterator<Customer> it = list.iterator();
		while(it.hasNext()) {
			Customer values = it.next();
			if(minDiscount == values.getPrice()) {
				System.out.println(values.getName());
			}
		}
	}
}

