package com.ds.sorting;

public class QuickSort<E extends Comparable<E>> {
	
	E[] elementArray;
	
	int start;
	int end;
	
	public QuickSort() {
		super();
		// TODO Auto-generated constructor stub
	}

	public QuickSort(E[] elementArray, int start, int end) {
		super();
		this.elementArray = elementArray;
		this.start = start;
		this.end = end;
	}

	public void setElementArray(E[] elementArray) {
		this.elementArray = elementArray;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public void setEnd(int end) {
		this.end = end;
	}
	
   public E[] sort(){
	   return sort(elementArray,start, end);
	}
   
   public E[] sort(E[] elementArray, int start, int end){
		int med  = 0;
		if (start < end ) {
			 med = partition(elementArray,start,end);
		}
		if(start < med-1)
	    sort(elementArray,start, med-1);
	    if(med+1 <end)
		sort(elementArray,med+ 1, end);
	    return elementArray;
	}

	private int partition(E[] eleArr, int st, int ed) {
		// TODO Auto-generated method stub
		E x = eleArr[ed];
		int i = st -1;
		for(int j=st;j<=ed-1;j++){
			//System.out.println(x+ "      ===   " + x.compareTo(eleArr[j]) + "  ===  j  " +  eleArr[j]);
			if ((x.compareTo(eleArr[j]) == 1) || (x.compareTo(eleArr[j]) == 0)){
				i = i + 1;
				swap(eleArr,i,j);
			}
				
		
		}
		swap(eleArr,i+1,ed);
		return i+1;
	}
	private E[] swap(E[] eleArr,int x,int y){
		E temp = eleArr[x];
		eleArr[x] = eleArr[y];
		eleArr[y] =  temp;
		return eleArr;
	}

}
