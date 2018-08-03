package com.interview.array;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;

public class LongestString {
	
//	 public static void main(String[] args) 
//	    {
//	        String str = "((()()";
//	        System.out.println(findMaxLen(str));
//	      
//	        str = "()(()))))";
//	        System.out.println(findMaxLen(str));
//		 int arr[] = new int[1];
//		 arr[0] = 2;
////		 arr[1] = 4;
//		 getUmbrellas(1, arr);
//		 findSimilar("1234", "4321");
//		 String arrs[] = new String[2];
//		 arrs[0] = "abcd";
//		 arrs[1]= "cdab";
//		 System.out.println(distinctPasswords(2,arrs));
//		 ConvertInfixtoPostfix("8+(7-9)*2");
//		 
//	      
//	    }

	 public static void main(String args[])
	    {
	        // Declare two strings
	        String a = "Hello";
	        String b = "World";
	         
	        // Print String before swapping
	        System.out.println("Strings before swap: a = " + 
	                                       a + " and b = "+b);
	         
	        // append 2nd string to 1st
	        a = a + b;
	         
	        // store intial string a in string b
	        b = a.substring(0,a.length()-b.length());
	         
	        // store initial string b in string a
	        a = a.substring(b.length());
	         
	        // print String after swapping
	        System.out.println("Strings after swap: a = " + 
	                                     a + " and b = " + b);        
	    }  

	private static char[] findMaxLen(String str) {
		Stack<Character> st = new Stack<Character>();
		BigInteger len = null;
		for(int i=0; i<str.length();i++)
		{
			if(str.charAt(i) == '(')
			{
				st.push('(');
			}else
			{
				Character prev = st.peek();
				if(prev == '(')
				{
					
				}
				
			}
		}
		return null;
	}
	
	 static String winner(String erica, String bob) {
		 int sumerica=0,sumbob=0;
		 String result = "";
		 for(int i=0; i<erica.length();i++)
			{
			 	if(erica.charAt(i) == 'E')
			 	{
			 		sumerica = sumerica+1;
			 	}
			 	else if(erica.charAt(i) == 'M')
			 	{
			 		sumerica = sumerica+3;
			 	}
			 	else
			 	{
			 		sumerica = sumerica+5;
			 	}
			}
		 	for(int i=0; i<bob.length();i++)
			{
			 if(bob.charAt(i) == 'E')
			 	{
				 sumbob = sumbob+1;
			 	}
			 	else if(bob.charAt(i) == 'M')
			 	{
			 		sumbob = sumbob+3;
			 	}
			 	else
			 	{
			 		sumbob = sumbob+5;
			 	}
			}
		 	if(sumbob > sumerica)
		 	{
		 		result=  bob;
		 	}
		 	else if(sumbob == sumerica)
		 	{
		 		result= "Tie";
		 	}
		 	else
		 	{
		 		result= erica;
		 	}
		 	return result;
	    }
	 
	 static int getUmbrellas(int n, int[] p) {
		 
		 int curr = -1,res =Integer.MAX_VALUE;
		 for(int i=0; i<p.length;i++)
			{
			  if(n%p[i] == 0)
			  {
				  curr = n/p[i];
			  }
			  if(curr < res)
			  {
				  res = curr;
			  }
			}
		 
		 if(res == Integer.MAX_VALUE)
			 res = -1;
		 return res;

	    }
	 
	 static long findSimilar(String a, String b) {
		 boolean fact1=true,fact2 = true;int value = 0;int result =0;
		 Map<Character,Integer> count1 = new TreeMap<Character,Integer>();
		 Map<Character,Integer> count2 = new TreeMap<Character,Integer>();
		 for(int i=0; i<a.length();i++)
			{
			 Integer counter = count1.get(a.charAt(i));
			 if(counter == null)
			 {
				 count1.put(a.charAt(i), 1);
			 }else
			 {
				 count1.put(a.charAt(i),count1.get(a.charAt(i))+1);
			 }
			}
		 for(int i=0; i<b.length();i++)
			{
			 Integer counter = count2.get(b.charAt(i));
			 if(counter == null)
			 {
			 count2.put(b.charAt(i), 1);
			 }else
			 {
				 count2.put(b.charAt(i),count2.get(b.charAt(i))+1);
			 }
			}
		if(count1.keySet().equals(count2.keySet()))
		{
			for (Map.Entry<Character,Integer> entry : count1.entrySet())
			{
			    if(entry.getValue() != 1)
			    {
			    	fact1 = true;
			    	value = value++;
			    }
			}
		}
		else
		{
			
		}
		if(fact1 == true)
		{
			result = factorial(count1.size());
		}
		else if(fact2 == true)
		{
			result = factorial(count2.size());
		}
		return result; 
		 
	    }
	 
	 static double nCr(int n, int r){
			int rfact=1, nfact=1, nrfact=1,temp1 = n-r ,temp2 = r;
			if(r>n-r)
			{
				temp1 =r;
				temp2 =n-r;
			}
			for(int i=1;i<=n;i++)
			{
				if(i<=temp2)
				{
					rfact *= i;
					nrfact *= i;
				}
				else if(i<=temp1)
				{
					nrfact *= i;
				}
				nfact *= i;
			}
			return nfact/(double)(rfact*nrfact);
		}
	 static int factorial(int n){    
		  if (n == 0)    
		    return 1;    
		  else    
		    return(n * factorial(n-1));    
		 } 
	 
	 
	 	public static int distinctPasswords(int input1,String[] input2)
	 	{
	 		List<String> passlist = new ArrayList<String>();
	 		
	 		for(int i=0; i<input2.length;i++)
	 		{
	 			String swapped = "";
	 			String password = input2[i];
	 			int k =0;
	 			 for(int j=2; j<password.length();j++)
	 			{
	 				 int curr = (2*j)-2;
	 				 if(curr%2 == 0)
	 				 {
	 					swapped = swap(password,j-2,j);
	 					password = swapped;
	 				 }
	 			}
	 			 if(!passlist.contains(password))
	 			 {
	 				passlist.add(input2[i]);
	 			 }
	 		}
	 		
	 		return passlist.size();
	 		
	 	}

		private static String swap(String password, int i, int j) {
			
			char[] charray = password.toCharArray();
			char temp = charray[i];
			charray[i] = charray[j];
			charray[j] = temp;
			String swapped = String.valueOf(charray);
			return swapped;
			
		}
		
		static int Precedenc(char c)
		{
			switch(c)
			{
			case '+':
			case '-':
				return 1;
			case '*':
			case '/':
				return 2;
			case '^':
				return 3;
			}
			return -1;
			
		}
		
		static String ConvertInfixtoPostfix(String input1)
		{
			String result = "";
			Stack<Character> stack = new Stack<Character>();
			for(int i=0; i<input1.length();i++)
	 		{
				char c = input1.charAt(i);
				if(Character.isLetterOrDigit(c))
				{
					result += c;
				}
				else if(c == '(') {
					stack.push(c);
				}
				else if(c == ')')
				{
					while(!stack.isEmpty() && stack.peek() != '(')
					{
						result += stack.pop();
					}
					if(!stack.isEmpty() && stack.peek() != ')')
					{
						return "Invalid Expression";
					}
					else
						stack.pop();
				}
				else
				{
					while(!stack.isEmpty() && Precedenc(c) <= Precedenc(stack.peek()))
					{
						result +=stack.pop();
					}
					stack.push(c);
				}
	 		}
			while(!stack.isEmpty())
			{
				result += stack.pop();
			}
			return result;
		}

}
