package com.interview.sorting;

public class BubbleSort {
	
	private static void bubbleSort(int[] a, int n) {
		for(int i = 0; i< n-2;i++)
		{
			for(int j =0;j<n-2;j++)
			{
				if(a[j] > a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
		for(int i =0;i < n-1;i++)
		{
			System.out.println(a[i]);
		}
		
	}

	
	
	
	public static void main(String[] args) {
		int a[] = {3,2,1,6,5,4};
		bubbleSort(a,6);
	}

	

}
