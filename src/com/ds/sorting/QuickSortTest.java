/* 
 * Copyright (c) 2014 
 *
 * animishr
 *
 * May 12, 2014
 * 
 */
package com.ds.sorting;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

/**
 * @author animishr
 *
 */
public class QuickSortTest {
	
	private  Integer[] dataArr;
	
	public QuickSortTest(Integer[] Arr){
		this.dataArr = Arr;
	}
	
	
	@Parameters
	 public static List<Object[]> data() {
	 Integer[] d = {1, 23, 12, 9, 30, 2,56,68, 50,90,99};

	   Object[][] data = new Object[][]{{d}};
	   
			   							
	   return Arrays.asList(data);
	 }
	 
	 @Test
	 public void testQuickSort(){
		 QuickSort<Integer> quick = new QuickSort<Integer>();
		 quick.setElementArray(dataArr);
		 quick.setStart(0);
		 quick.setEnd(dataArr.length-1);
		 Integer[] arr = quick.sort();
		 
	 }
}
