package co.Assignment03.Answer3.Question01.InputParser;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import co.Assignment03.Answer3.Question01.Mapper.SoftwareMapper;
import co.Assignment03.Answer3.Question01.Model.Software;


public class SoftwareInputParser {

		public List<Software> parseFile(String path){
		
			List<Software> Softwares = new ArrayList<>();
			File file = new File(path);
			BufferedReader bufferReader = null;
			try {
				bufferReader = new BufferedReader(new FileReader(file));
				String st;
				while((st = bufferReader.readLine()) != null) {
					Software software = SoftwareMapper.map(st);
					
					Softwares.add(software);
				}
			}catch(IOException ioException) {
				throw new RuntimeException(ioException);
			}
			catch(Exception ex) {
				System.out.println(ex.getMessage());
			}
			return Softwares;
		}
}


