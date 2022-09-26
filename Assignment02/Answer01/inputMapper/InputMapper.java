package co.Assignment02.Answer01.inputMapper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import co.Assignment02.Answer01.Mapper.MapInput;
import co.Assignment02.Answer01.Software.Software;

public class InputMapper {
	public List<Software> parseFile(String path){
	
		List<Software> list = new ArrayList<>();
		File file = new File(path);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(file));
			String st;
			while((st = bufferReader.readLine()) != null) {
				Software software = MapInput.map(st);
				
				list.add(software);
			}
		}catch(IOException ioException) {
			throw new RuntimeException(ioException);
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return list;
	}
}
