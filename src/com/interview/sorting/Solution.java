package com.interview.sorting;

import java.util.ArrayList;

public class Solution {
	
	 public static ArrayList<Integer> maxset(ArrayList<Integer> A) {
	      int max_so_far = Integer.MIN_VALUE,
	        max_ending_here = 0,start = 0,
	        end = 0, s = 0;
	      boolean allnegetive= true;
	        ArrayList<Integer> result = new ArrayList<Integer>();
	        for (int i = 0; i < A.size(); i++) 
	        {
	        	
				if(A.get(i) >= 0)
	        	{
	        		allnegetive = false;
	        	}
	            max_ending_here += A.get(i);
	 
	            if (max_so_far <= max_ending_here) 
	            {
	                max_so_far = max_ending_here;
	                start = s;
	                end = i;
	            }
	 
	            if (max_ending_here < 0) 
	            {
	                max_ending_here = 0;
	                s = i + 1;
	            }
	        	
	        	
	        }
	        if(!allnegetive)
	        {
	        for(int i=start;i<=end;i++)
	           result.add(A.get(i));
	        }
	      return result; 
	}
	 public static void main(String[] args) {
		 ArrayList<Integer> A = new ArrayList<Integer>();
		 A.add(0);
		 A.add(0);
		 A.add(-1);
		 A.add(0);
//		 A.add(-8);
//		 A.add(3);
		 ArrayList<Integer> result = maxset(A);
//		 for(int i =0; i< result.size();i++)
//			 System.out.println(result.get(i));
		 int j =0;
		 System.out.println(Math.abs((j++)%7));
	}

}
