package com.Assignment02.Answer02.Main;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.Assignment02.Answer02.Customer.Customer;
import com.Assignment02.Answer02.Services.CustomerServices;
import com.Assignment02.Answer02.inputMapper.InputMapper;


public class Main {
	public static void main(String[] args) {
		String path = "/home/mohds/java/JavaAssignments/src/com/Assignment02/Answer02/inputFile/input";
		InputMapper parseFile = new InputMapper();
		
		try {
			List<Customer> input = parseFile.parseInput(path);
			CustomerServices service = new CustomerServices(input);
			//System.out.println(input);
			
			service.getAllProducts();
		}catch(Exception ex) {
			throw new RuntimeException(ex);
		}
	}
}
