package com.rishabh.Array;

public class SelectionSort {

	public static void main(String[] args) {
		// Basic plan find the largest element  and swap it with the last index
		
		int arr[] = new int [7];
		arr[0]=20;
		arr[1]=-98;
		arr[2]=35;
		arr[3]=15;
		arr[4]=85;
		arr[5]=-876;
		arr[6]=876;
		for (int lastSortedIndex = arr.length-1 ; lastSortedIndex >0;lastSortedIndex--) {
			int largestInex = 0;
			for (int i = 1; i <=lastSortedIndex;i++) {
				if(arr[i]>arr[largestInex]) {
					largestInex = 1; 
				}
				swap(arr,largestInex,lastSortedIndex);
			}
		}
		
		for (int i : arr) {
			System.out.println(i);
					}
}	
	// Swap function to swap the element in the array its static and using global variable 
	public static void swap(int [] arr ,int i , int j ) {
		if(i==j) {
			return ;
		}
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	
	
}
