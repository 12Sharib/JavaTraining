package co.Assignment03.Answer3.Question03.InputParser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import co.Assignment03.Answer3.Question03.Mapper.LibraryMapper;
import co.Assignment03.Answer3.Question03.Model.OutdatedLibrary;


public class LibraryInputParser {
		public List<OutdatedLibrary> parseFile(String path){
			List<OutdatedLibrary> library = new ArrayList<>();
			
			File file = new File(path);
			BufferedReader bufferReader = null;
			try {
				bufferReader = new BufferedReader(new FileReader(path));
				String st;
				while((st = bufferReader.readLine()) != null) {
					OutdatedLibrary outdatedLibrary = LibraryMapper.map(st);
					library.add(outdatedLibrary);
				}
			}catch(IOException IoException) {
				System.out.println(IoException);
			}catch(Exception ex) {
				System.out.println(ex);
			}
			
			return library;
		}

	}



