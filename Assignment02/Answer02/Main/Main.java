package co.Assignment02.Answer02.Main;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import co.Assignment02.Answer02.Customer.Customer;
import co.Assignment02.Answer02.Operations.Operations;
import co.Assignment02.Answer02.inputMapper.InputMapper;


public class Main {
	public static void main(String[] args) {
		String path = "/home/mohds/java/JavaAssignments/src/co/Assignment02/Answer02/inputFile/input";
		InputMapper parseFile = new InputMapper();
		
		try {
			List<Customer> input = parseFile.parseInput(path);
			Operations op = new Operations(input);
			//System.out.println(input);
			
			op.getAllProducts();
		}catch(Exception ex) {
			throw new RuntimeException(ex);
		}
	}
}
