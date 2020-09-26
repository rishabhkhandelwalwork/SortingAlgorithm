package com.rishabh.Array;

public class BubbleSort {

	public static void main(String[] args) {
		
		// Declaring array 
		int arr[] = new int [7];
		arr[0]=20;
		arr[1]=-98;
		arr[2]=35;
		arr[3]=15;
		arr[4]=85;
		arr[5]=-876;
		arr[6]=876;
		
// actual bubble sort algorithm 
// Taking the last index as the last sorted index and decresing it so that the element beyond the lastsorted index value are sorted 
for (int lastSortedIndex = arr.length-1 ; lastSortedIndex >0;lastSortedIndex--) {
			for (int i = 0 ; i <lastSortedIndex;i++) {
				if(arr[i]>arr[i+1]) {
					swap(arr,i,i+1);
				}
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
