package co.Assignment02.Answer02.inputMapper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import co.Assignment02.Answer02.Customer.Customer;
import co.Assignment02.Answer02.Mapper.MapInput;

public class InputMapper {
	public List<Customer> parseInput(String path){
		
		List<Customer> list = new ArrayList<>();
		File file = new File(path);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(file));
			String st;
			while((st=bufferReader.readLine())!=null) {
				Customer customer = MapInput.map(st);
				list.add(customer);
				
			}
		}catch(Exception ex) {
			throw new RuntimeException(ex);
		}
		return list;
	}
	

}
