package co.Assignment03.Answer3.Question05.InputParser;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import co.Assignment03.Answer3.Question05.Mapper.HighestSalaryMapper;
import co.Assignment03.Answer3.Question05.Model.HighestSalary;
public class HighestSalaryParser {
		public List<HighestSalary> parseFile(String path){
			List<HighestSalary> student = new ArrayList<>();
			
			File file = new File(path);
			try(BufferedReader bufferReader = new BufferedReader(new FileReader(file));){
				String st;
				while((st = bufferReader.readLine())!=null) {
					HighestSalary salary = HighestSalaryMapper.map(st);
					student.add(salary);
				}
			}catch(IOException ioException) {
				System.out.println(ioException);
			}catch(Exception ex) {
				System.out.println(ex);
			}
			
			return student;
		}
	

}
