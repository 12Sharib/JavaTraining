package co.Assignment02.Answer4.studentMapper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import co.Assignment02.Answer4.Mapper.InputMapper;
import co.Assignment02.Answer4.Student.Student;

public class StudentMapper {
	public List<Student> parseFile(String path){
		
		List<Student> list = new ArrayList<Student>();
		 File file = new File(path);
		 BufferedReader bufferReader = null;
		 try{
			 bufferReader = new BufferedReader(new FileReader(file));
			 String st;
			 while ((st = bufferReader.readLine()) != null) {
				Student student = InputMapper.map(st);
				 list.add(student);
			 }
		 }catch(IOException IOException) {
			 throw new RuntimeException(IOException);
		 }catch(Exception ex) {
			 throw new RuntimeException(ex);
		 }
		 finally {
			 try {
				 bufferReader.close();
			 }
			 catch(IOException ex){
				 System.out.println(ex);
			 }
		 }
		 return list;
	}
}
	  
		

