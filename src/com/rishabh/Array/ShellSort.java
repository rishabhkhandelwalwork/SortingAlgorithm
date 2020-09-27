package com.rishabh.Array;

public class ShellSort {
	
	// implementing Insertion sort with the help of Shell sort

	public static void main(String [] args) {
		int arr[] = new int [7];
		arr[0]=20;
		arr[1]=-98;
		arr[2]=35;
		arr[3]=15;
		arr[4]=85;
		arr[5]=-876;
		arr[6]=876;
		

		for (int gap = arr.length/2;gap >0; gap/=2) {
			
		for (int i = gap ; i <arr.length;i++) {
		int 	newElement = arr[i];
		int j = i ; 
		while(j>=gap && arr[j-gap]>newElement) {
			arr[j]=arr[j-gap];
			j-=gap;
		}
		arr[j]= newElement;
		}	
		
		
		
		
		}
		
		for (int i : arr) {
			System.out.println(i);
					}

	}
}
