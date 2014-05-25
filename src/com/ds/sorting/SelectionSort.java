package com.ds.sorting;

public class SelectionSort<E extends Comparable<E>>{
	E[] elementArray;

	public SelectionSort() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SelectionSort(E[] elementArray) {
		super();
		this.elementArray = elementArray;
	}
	
	public E[] getElementArray() {
		return elementArray;
	}

	public void setElementArray(E[] elementArray) {
		this.elementArray = elementArray;
	}
	
	public E[] sort(){
		doSort();
		return this.elementArray;
		
	}

	private void doSort() {
		
	}

}
