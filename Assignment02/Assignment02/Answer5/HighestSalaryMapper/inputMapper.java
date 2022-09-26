package co.Assignment02.Answer5.HighestSalaryMapper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import co.Assignment02.Answer5.HighestSalary.HighestSalary;
import co.Assignment02.Answer5.Mapper.mapInput;

public class inputMapper {
	public List<HighestSalary> parseFile(String path){
		List<HighestSalary> list = new ArrayList<>();
		
		File file = new File(path);
		try(BufferedReader bufferReader = new BufferedReader(new FileReader(file));){
			String st;
			while((st = bufferReader.readLine())!=null) {
				HighestSalary salary = mapInput.map(st);
				list.add(salary);
			}
		}catch(IOException ioException) {
			System.out.println(ioException);
		}catch(Exception ex) {
			System.out.println(ex);
		}
		
		return list;
	}
}
