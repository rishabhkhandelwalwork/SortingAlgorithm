package com.rishabh.Array;

public class InsertionSort {

	public static void main(String [] args) {
		
		int arr[] = new int [7];
		arr[0]=20;
		arr[1]=-98;
		arr[2]=35;
		arr[3]=15;
		arr[4]=85;
		arr[5]=-876;
		arr[6]=876;
		
		
		for (int unsortedIndex= 1 ; unsortedIndex<arr.length;unsortedIndex++ ) {
			int newElement = arr[unsortedIndex];
			int i ; 
			for (i =unsortedIndex; i >0 && arr[i-1]>newElement;i--) {
				arr[i]=arr[i-1];
				
			}
			arr[i]=newElement;
		}
		
		
		for (int i : arr) {
			System.out.println(i);
					}

	
	
		
		
	}

}

