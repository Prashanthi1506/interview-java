package com.interview.array;

public class TwoStacks {
	
	int[] arr;
	int top1,top2;
	int n;
	
	TwoStacks (int n)
	{
		arr = new int[n];
		top1 = -1;
		top2 = n;
		this.n = n;
	}
	
	public void push1(int item)
	{
		if(top1 < top2-1)
		{
			top1++;
			arr[top1] = item;
		}
		else
		{
			System.out.println("Stack overflow");
		}
	}
	public void push2(int item)
	{
		if(top1 < top2 -1)
		{
			top2--;
			arr[top2] = item;
		}
		else
		{
			System.out.println("Stack overflow");
		}
	}
	
	public int pop1()
	{
		int item = -1;
		if(top1 < 0)
		{
			System.out.println("Stack underflow");
		}
		else
		{
			item = arr[top1];
			top1--;
		}
		return item;
	}
	
	public int pop2()
	{
		int item = -1;
		if(top2 > n-1)
		{
			System.out.println("Stack Underflow");
		}else
		{
			item  = arr[top2];
			top2++;
		}
		return item;
	}
	
	public static void main(String[] args) {
		TwoStacks twostack = new TwoStacks(5);
		twostack.push1(1);
		twostack.push1(2);
		twostack.push1(3);
		twostack.push2(4);
		twostack.push2(4);
		twostack.push2(6);
		System.out.println(twostack.pop1());
		System.out.println(twostack.pop2());
	}
}
