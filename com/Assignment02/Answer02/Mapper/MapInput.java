package com.Assignment02.Answer02.Mapper;

import com.Assignment02.Answer02.Customer.Customer;

public class MapInput {
	public static Customer map(String data) {
		String split[] = data.split(", ");
		Customer customer = new Customer();
		try {
			String customerName = split[0];
			String product = split[3];
			Integer productPrice = Integer.parseInt(split[4]);
			
			customer.setName(customerName);
			customer.setProduct(product);
			customer.setPrice(productPrice);
		}catch(NumberFormatException numberFormat) {
			throw new RuntimeException(numberFormat);
		}catch(Exception ex) {
			throw new RuntimeException(ex);
		}
		return customer;
	}
}
