package com.interview.maze;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Suffix {
	
public static List<String> getSuffix(String text){
		
		int lengthOfText = text.length();
		List<String> suffixList = new ArrayList<String>();
		
		for(int index=0;index<lengthOfText;index++){
			suffixList.add(text.substring(index,lengthOfText)); // O(1) 
		}
		
		return suffixList;
	}

public static void main (String[] args)
{
   
	System.out.println( longestRepeatedSubstirng("helloehelloejdjehello") );
}

public static String longestRepeatedSubstirng(String text){
	
	int lengthOfText = text.length();
	
	List<String> suffixList = getPrefix(text); // O(N)
	
	Collections.sort(suffixList); // O(NlogN) BUT O(N)
	
	String longestSubstring = "";
	
	for(int i=0;i<lengthOfText-1;i++){
		String tempString = longestCommonSuffix(suffixList.get(i), suffixList.get(i+1));
		
		if( tempString.length() > longestSubstring.length()){
			longestSubstring = tempString;
		}
	}
	
	return longestSubstring;
}

public static String longestCommonSuffix(String text1, String text2){
	
	int commonLength = Math.min(text1.length(), text2.length());
	
	for(int index=0;index<commonLength;index++){
		if( text1.charAt(index) != text2.charAt(index)){
			return text1.substring(0,index); // O(1)
		}
	}
	
	return text1.substring(0,commonLength);
}

public static List<String> getPrefix(String text){
	
	int lengthOfText = text.length();
	List<String> prefixList = new ArrayList<>();
	
	for(int index=0;index<lengthOfText+1;index++){
		prefixList.add(text.substring(0,index)); // O(1)
	}
	
	return prefixList;
}



}