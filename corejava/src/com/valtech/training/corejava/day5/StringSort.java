package com.valtech.training.corejava.day5;

import java.util.Comparator;

public class StringSort implements Comparator<String>{
	@Override
	   public int compare(String s1, String s2) {
	   
	           return s1.length() - s2.length();
	   }
	    
	    private int vowelCount(String s1) {
	        String vowels = "AaEeIiOoUu";
	        int count =0;
	        for(int i =0 ;i<s1.length(); i++) {
	            char s4 = s1.charAt(i);
	            if(vowels.contains(""+s4)) {
	                count++;
	            }
	        }
	        return count;
	    }
	    public int checkAlphabet(String s1, String s2) {
	        
	        return s1.compareTo(s2);
	    
	    
	    }
}