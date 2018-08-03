package com.interview.Misc;

import java.util.Set;
import java.util.TreeSet;

public class Programmer {
	
	static int findIndex(String s)
	{
		int index =0,secondindex=0,res = 0,pcount =0;
		String search = "programmer";
		index = firstprogrammer(s);
		int i = index;
		secondindex = index;
		while(i != s.length()-1)
		{
			if(s.charAt(i) == 'p')
			{
				pcount++;
				break;
				
			}
			else if(s.charAt(i) != 'p')
			{
				secondindex++;
			}
			
		}
		res = secondindex - index;	
		return res;
	}
	
	
	static int firstprogrammer(String str)
	{
		String s = "programmer";
		int i =0,count =0;
	while(i != str.length()-1)
	{	
		Character search= str.charAt(i);
		if(str.charAt(i) == 'r' && count == 9)
		{
			return i+1;
		}
		else if(s.contains(search.toString()))
		{
			count++;
		}
		i++;
			
	}
	return count;
	}
	
	public static void main(String[] args) {
		System.out.println(findIndex("xprogxrmaxemrppprmmograeiruu"));
	}

}
