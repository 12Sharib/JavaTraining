package co.Assignment02.Answer03.inputMapper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import co.Assignment02.Answer03.Library.Library;
import co.Assignment02.Answer03.Mapper.MapInput;

public class InputMapper {
	public List<Library> parseFile(String path){
		List<Library> list = new ArrayList<>();
		
		File file = new File(path);
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(path));
			String st;
			while((st = bufferReader.readLine()) != null) {
				Library library = MapInput.map(st);
				list.add(library);
			}
		}catch(IOException IoException) {
			System.out.println(IoException);
		}catch(Exception ex) {
			System.out.println(ex);
		}
		
		return list;
	}

}
