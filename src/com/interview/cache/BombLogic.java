package com.interview.cache;

import java.util.*;

public class BombLogic {
	
	
	public static List<Integer> getBomblist(int[] ar,int size,int key)
	{
		List<Integer> resultlist = new ArrayList<Integer>();
		int i =0;
		if(key >= 0)
		{
			while(i < size)
			{
				int result= 0;
				int counter = 0;
				int j = i;
				while(counter < key)
				{
					j++;
					j = j%size;
					result = result + ar[j];
					counter++;
				}
				i++;
				resultlist.add(result);
			}
		}
		else
		{
			key = Math.abs(key);
			while(i < size)
			{
				int result= 0;
				int counter = 0;
				int j = size+i-key;
				while(counter < key)
				{
					j = j%size;
					result = result + ar[j];			
					j++;
				
					
					counter++;
				}
				i++;
				resultlist.add(result);
			}
		}
		
		return resultlist;
		
		
	}
	
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,7,9};
		List<Integer> result = getBomblist(arr, 5,-2);
		for(int i =0;i < result.size();i++)
		{
			System.out.println(result.get(i));
		}
	}

}
