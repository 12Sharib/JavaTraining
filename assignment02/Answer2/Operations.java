package assignment02.Answer2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Operations {
	Integer productPrice(List list,String productName) {
		Iterator<Customer> it = list.iterator();
		
		List<Integer> price  = new ArrayList<Integer>();
		
		Integer temp = 0;
		while(it.hasNext()) {
			Customer values = it.next();
			String productNameInList = values.getProduct();
			
			if(productName.equals(productNameInList)) {
				Integer productPrice = values.getPrice();
				price.add(productPrice);
			}
		}
		//Integer discountedPrice = price.stream().min(Integer::compare).get();
		Integer discountedPrice = Collections.min(price);
		
		return discountedPrice;
		
	}
	
	void printOperations(List list, Integer discountedPrice) {
		
		Iterator<Customer> it2 = list.iterator();
		while(it2.hasNext()) {
			Customer values = it2.next();
			Integer getPriceFromList = values.getPrice();
			
			if(discountedPrice == getPriceFromList) {
					System.out.print(values.getName() + " has bought " + values.getProduct() + " in discounted price i.e " + discountedPrice+" ;");
				}
			}
		}
	}

