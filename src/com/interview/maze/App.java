package com.interview.maze;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class App {

	// overall running time os O(N)
	public static List<String> getSuffix(String text){
		
		int lengthOfText = text.length();
		List<String> suffixList = new ArrayList<String>();
		
		for(int index=0;index<lengthOfText;index++){
			suffixList.add(text.substring(index,lengthOfText)); // O(1) 
		}
		
		return suffixList;
	}
	
	// overall running time O(N)
	public static List<String> getPrefix(String text){
		
		int lengthOfText = text.length();
		List<String> prefixList = new ArrayList<>();
		
		for(int index=0;index<lengthOfText+1;index++){
			prefixList.add(text.substring(0,index)); // O(1)
		}
		
		return prefixList;
	}
	
	// O(N)
	public static String longestCommonPrefix(String text1, String text2){
		
		int commonLength = Math.min(text2.length(), text2.length());
		int secondlength = text2.length()-1;
		int firstlength = text1.length()-1;
		for(int index=0;index<commonLength;index++){
			if( text1.charAt(firstlength--) != text2.charAt(secondlength--)){
				if(index==0)
						return null;
				else
						return text1.substring(index-1,text1.length()); // O(1)
			}
		}
		
		
		return null;
	}
	
	public static String revertString(String text){
		
		// String -> O(N*N) time complexity ... StringBuilder -> O(N)
		int lengthOfText = text.length(); // O(1)
		StringBuilder reverseString = new StringBuilder();
		
		for(int index=lengthOfText-1;index>=0;index--){ // O(N)
			reverseString.append(text.charAt(index));
		}
		
		return reverseString.toString();
	}
	
	public static String longestRepeatedSubstirng(String text){
		
		int lengthOfText = text.length();
		
		List<String> suffixList = getSuffix(text); // O(N)
		
		Collections.sort(suffixList); // O(NlogN) BUT O(N)
		
		String longestSubstring = "";
		
		for(int i=0;i<lengthOfText-1;i++){
			String tempString = longestCommonPrefix(suffixList.get(i), suffixList.get(i+1));
			
			if( tempString.length() > longestSubstring.length()){
				longestSubstring = tempString;
			}
		}
		
		return longestSubstring;
	}
	
	
	public static void main(String[] args) {
		String line = "Cornfield, outfield";
		String[] totalinput = line.split(",");
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(2);
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
//		System.out.println( longestCommonPrefix(totalinput[0],totalinput[1]) );

	}
}

