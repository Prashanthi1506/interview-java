package com.interview.sorting;

public class MergeSort {

	public static void main(String[] args) {
		int a[] = { 3, 2, -1, 6, 5, 2 };
		mergeSort(a);
		for(int i =0;i<a.length;i++)
			System.out.println(a[i]);
	}

	private static void mergeSort(int[] a) {
		int n = a.length;
		if(n < 2)
			return;
		int mid = n/2;
		int L[] = new int[mid];
		int R[] = new int[n-mid];
		for(int i =0; i < mid;i++)
			L[i] = a[i];
		for(int i =mid;i<n;i++)
			R[i-mid] = a[i];
		mergeSort(L);
		mergeSort(R);
		merge(a, L, R);
			
	}

	private static void merge(int[] a, int l[],int r[]) {
		int nl = l.length;
		int nr = r.length;
		int i =0,j=0,k=0;
		while(i < nl && j < nr)
		{
			if(l[i] <= r[j])
			{
				a[k] = l[i];
				i++;
			}else
			{
				a[k] = r[j];
				j++;
			}
			k++;
		}
		while(i < nl)
		{
			a[k++] = l[i++];
		}
		while(j < nr)
		{
			a[k++] = r[j++];
		}
	}

}
