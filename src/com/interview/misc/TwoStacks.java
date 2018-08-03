package com.interview.Misc;

public class TwoStacks {
	
	int top1,top2= 0;
	int size = 0;
	int arr[];
	
	TwoStacks(int size)
	{
		top1 = 0;
		top2 = size;
		arr  = new int[size];
	}
	
	void push1(int data)
	{
		if(top1 < top2-1)
		{
			arr[top1] = data;
			top1++;
		}
		else
		{
			System.out.println("Stack Overflow ");
		}
	}
	void push2(int data)
	{
		if(top1 < top2-1)
		{
			top2--;
			arr[top2] = data;			
		}
		else
		{
			System.out.println("Stack Overflow ");
		}
		
	}
	int pop1()
	{
		int data = 0;
		if(top1 >= 0)
		{
			data = arr[top1];
			top1--;
		}
		return data;
		
	}
	int pop2()
	{
		int data = 0;
		if(top2 < size)
		{
			data = arr[top2];
			top2++;
		}
		return data;
		
	}
	
	public static void main(String[] args) {
		
		
	}
	
	
	

}
