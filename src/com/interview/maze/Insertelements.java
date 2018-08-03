package com.interview.maze;

import java.util.LinkedList;

public class Insertelements {
	
	public static void main (String[] args)
	{
	   
		System.out.println( insertedString("1234567") );
	}

	private static String insertedString(String numberstring) {
		String result = "";
		int prev =0;
		int curr = 0;
		for(int i = 0; i < numberstring.length(); i++) {
		    curr = Character.digit(numberstring.charAt(i), 10);		   
		    if(curr == 0)
		 	{
		 		result = result+curr;
		 	}
		 	else if(curr%2 == 0 && prev%2 == 0)
		 	{
		 		result = result+"*"+curr;
		 	}else if(curr%2 != 0 && prev%2 != 0)
		 	{
		 		result = result+"-"+curr;
		 	}else
		 	{
		 		result = result+curr;
		 	}
		    prev = curr;
		}
		
		 return result;
	}

}
