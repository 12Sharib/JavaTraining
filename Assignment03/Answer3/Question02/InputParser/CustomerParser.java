package co.Assignment03.Answer3.Question02.InputParser;

	import java.io.BufferedReader;
	import java.io.File;
	import java.io.FileReader;
	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.List;

import co.Assignment03.Answer3.Question02.CustomerMapper.CustomerMapper;
import co.Assignment03.Answer3.Question02.Model.Customer;
	public class CustomerParser {
			public List<Customer> parseInput(String path){
			
				List<Customer> Customers = new ArrayList<>();
				File file = new File(path);
				BufferedReader bufferReader = null;
				try {
					bufferReader = new BufferedReader(new FileReader(file));
					String st;
					while((st=bufferReader.readLine())!=null) {
						Customer customer = CustomerMapper.map(st);
						Customers.add(customer);
						
					}
				}catch(IOException ioException) {
					throw new RuntimeException(ioException);
				}catch(Exception ex) {
					throw new RuntimeException(ex);
				}
				return Customers;
			}
			

		}

