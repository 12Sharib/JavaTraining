package assignment02.Isogram.Services;

import java.util.Arrays;
import java.util.List;

public class IsogramService {
	public static void printDetails(List<String> list) {
		for(String values : list) {
			String value = values;
			
			value.toLowerCase();
			char arr[] = value.toCharArray();
			Arrays.sort(arr);
			for(int i=0;i<arr.length-1;i++) {
				if(arr[i] == arr[i+1]) {
					System.out.println("word is not a phrase isogram");
					break;
				}
				System.out.println("word is a phrase of isogram");
				break;
			}
		//	System.out.println("word is a phrase of isogram");
			
		
		}
	}
}
