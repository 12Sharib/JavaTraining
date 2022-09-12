package assignment02;

import java.util.ArrayList;
import java.util.List;

public class Assignment03 {
	     static boolean isanagram(String a,String b)
	    {
	        if(a.length()!= b.length())
	            return false;
	        a = a.toUpperCase();
	        b = b.toUpperCase();
	        
	        int freq[] = new int[256];
	        for(int i=0;i<a.length();i++)
	        {
	            freq[a.charAt(i)]++;
	            freq[b.charAt(i)]--;
	        }
	        for(int i=0;i<256;i++)
	        {
	            if(freq[i]!=0)
	                return false;
	        }
	        return true;
	    
	        
	    }
	    
	    public static List<String> listAnagrams(List<String> list, String w)
	    {
	        List<String> subList = new ArrayList<>();
	        for(String i : list)
	        {
	            if(isanagram(i, w)==true)
	            {
	                subList.add(i);
	            }
	        }
	        
	        return subList;
	    }
		public static void main(String[] args) {
			List<String>list=new ArrayList<String>();
			list.add("enlists");
			list.add("google");
			list.add("inlets");
			list.add("banana");
			String word="listen";
			List<String> ans = listAnagrams(list, word);
			    System.out.print(ans);
		}
	      

	}


