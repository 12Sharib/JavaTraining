package assignment02.IsAnagram.Services;

import java.util.ArrayList;
import java.util.List;

public class IsanagramService {
	  public boolean isanagram(String a,String b)
	    {
	        if(a.length()!= b.length())
	            return false;
	        a = a.toUpperCase();
	        b = b.toUpperCase();
	        
//	        int freq[] = new int[256];
//	        for(int i=0;i<a.length();i++)
//	        {
//	            freq[a.charAt(i)]++;
//	            freq[b.charAt(i)]--;
//	        }
//	        for(int i=0;i<256;i++)
//	        {
//	            if(freq[i]!=0)
//	                return false;
//	        }
	      
	       for(int i=0;i<a.length()-1;i++) {
	    	   for(int j=i+1;j<b.length()-1;j++) {
		    	   if(a.charAt(i) == b.charAt(j)) {
		    		   return true;
		    	   }
	    		   
	    	   }
	       }
	       // System.out.println(arr);
	       return false;
	        
	    }
	    public List<String> listAnagrams(List<String> list, String word)
	    {
	        List<String> subList = new ArrayList<>();
	        for(String value : list)
	        {
	            if(isanagram(value, word)==true)
	            {
	                subList.add(value);
	            }
	        }
	        
	        return subList;
	    }
	}


