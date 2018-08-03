package com.interview.gamebits;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Gamingbits {
	
	public static void main(String[] args) {
		int[] numbers = readNumsFromCommandLine();
		for(int i =0 ;i<numbers.length;i++)
		{
			List<Integer> bitlist = getbitarray(numbers[i]);
			 Integer[] bitarray = new Integer[bitlist.size()];
			 Collections.reverse(bitlist);
			 bitarray = bitlist.toArray(bitarray);
			getwinner(bitlist,numbers[i]);
		}
	}
	
	private static void getwinner(List<Integer> bitlist,int original) {
		int moves = bitlist.size();
		boolean xavier = true;
		for(int i =0;i<moves;i++)
		{
			if(xavier)
			{
				toggle(bitlist,i);
				xavier = false;
			}
			else
			{
				toggle(bitlist,i);
				xavier = true;
			}
		}
		if(checkequalnumber(bitlist,original))
		{
			if(xavier)
			{
				System.out.println("Y");
			}
			else
			{
				System.out.println("X");
			}
		}
		else
		{
			if(xavier)
			{
				System.out.println("X");
			}
			else
			{
				System.out.println("Y");
			}
		}
		
	}

	private static boolean checkequalnumber(List<Integer> bitlist,int original) {
		
		StringBuilder builder = new StringBuilder();
		for (int i : bitlist) {
		  builder.append(i);
		}
		String binaryString = builder.toString();
		int number=Integer.parseInt(binaryString,2);
		if(number == original || Math.abs(original-number) == 1)
		{
			return true;
		}
		return false;
	}

	private static void toggle(List<Integer> bitlist,int index) {
		int previndex = index-1;
		int nextindex = index+1;
		if(bitlist.get(index) == 0)
		{
			bitlist.set(index, 1);
			if(previndex >= 0 && bitlist.get(previndex) != bitlist.get(index))
			{
				bitlist.set(previndex, 1);
			}
			if(nextindex < bitlist.size() && bitlist.get(nextindex) != bitlist.get(index))
			{
				bitlist.set(nextindex, 1);
			}
			
		}
		else
		{
			bitlist.set(index, 0);
			if(previndex >= 0 && bitlist.get(previndex) != bitlist.get(index))
			{
				bitlist.set(previndex, 0);
			}
			if(nextindex < bitlist.size() && bitlist.get(nextindex) != bitlist.get(index))
			{
				bitlist.set(nextindex, 0);
			}
		}
		
	}

	private static List<Integer> getbitarray(int i) {
		List<Integer> bitlist = new ArrayList<Integer>();		  
        // counter for binary array
        int j = 0;
        while (i > 0) 
        {
            // storing remainder in binary array
        	bitlist.add(i % 2);
            i = i / 2;
            j++;
        }
        return bitlist;
	}

	public static int [] readNumsFromCommandLine() {

		 Scanner scanner = new Scanner(System.in);

	        int count = scanner.nextInt();
	        scanner.nextLine(); // throw away the newline.

	        int [] numbers = new int[count];
	    
	        for (int i = 0; i < count; i++) {
	          
	                numbers[i] = scanner.nextInt();
	        }

	        return numbers;
    }

}
