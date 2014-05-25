package com.ds.sorting;

public class InsertionSort {
	
	
	public int[] sort(int[] i_array){
		int key = 0;
		int i = 0;
		for(int j=1;j<i_array.length;j++){
			key = i_array[j];
			i = j-1;
			while(i >= 0  && i_array[i]< key){
				i_array[i+1] = i_array[i];
				i = i-1;
				
			}
			i_array[i+1] = key;
		}
		return i_array;
		}

	
	public static void main(String[] args) {
		InsertionSort inser = new InsertionSort();
		int [] arr = {1,2,3,4,5,6};
		int [] sortArr = inser.sort(arr);
		for(int d:sortArr){
			System.out.println(d);
		}
		
	}
}
