package co.Assignment02.Answer01.inputMapper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import co.Assignment02.Answer01.Mapper.mapInput;
import co.Assignment02.Answer01.Software.Software;

public class inputMapper {
	public List<Software> parseFile(String path){
		List<Software> list = new ArrayList<>();
		File file = new File(path);
		BufferedReader buffer = null;
		try {
			buffer = new BufferedReader(new FileReader(file));
			String st;
			while((st = buffer.readLine()) != null) {
				Software software = mapInput.map(st);
				
				list.add(software);
			}
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return list;
	}
}
