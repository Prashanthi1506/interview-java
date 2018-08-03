package com.interview.sorting;

public class InsertionSort {
	
	private static void insertionSort(int[] a, int n) {
		
		for(int i =1;i <n;i++)
		{
			
			int minindex = i;
			int value = a[i];
			for(int j =i-1;j>=0;j--)
			{
				if(a[j] > value)
				{
					a[j+1] = a[j];
					minindex = j;
				}
			}
			if(minindex != i)
			{
			a[minindex] = value;
			}
		}
		for(int i =0;i < n;i++)
		{
			System.out.println(a[i]);
		}
		
	}
	

	public static void main(String[] args) {
		int a[] = {3,2,-1,6,5,4,10};
		insertionSort(a,7);
	}

	

}
