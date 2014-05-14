package com.ds.sorting;

public class AppSort {
	
	public static void main(String[] args) {
		Integer[] dataArr = {1, 23, 12, 9, 30, 2,56,68, 50,90,99};
		QuickSort<Integer> quick = new QuickSort<Integer>();
		quick.setElementArray(dataArr);
		quick.setStart(0);
		quick.setEnd(dataArr.length-1);
		Integer[] arr = quick.sort();
		for(int a:arr){
			System.out.println(a);
		}
	}

}
