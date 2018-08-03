package com.interview.sorting;

public class SelectionSort {
	
	public static void selectionSort(int[] arr,int n)
	{
		for(int i =0;i<n-2;i++)
		{
			int minindex = i;
			for(int j =i+1;j<n-1;j++)
			{
				if(arr[j] < arr[minindex])
				{
					minindex = j;
				}
			}
			int temp = arr[minindex];
			arr[minindex] = arr[i];
			arr[i] = temp;
		}
		for(int i =0;i < n-1;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		int a[] = {3,2,1,6,5,4};
		selectionSort(a,6);
	}

}
