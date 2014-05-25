package com.ds.sorting;

import org.junit.Assert;
import org.junit.runners.Parameterized.Parameters;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class QuickSortTestNg {
  
	
	
	@DataProvider
	public Object[][] ValidDataProvider() {
		Integer[] d = {1, 23, 12, 9, 30, 2,56,68, 50,90,99};
		Integer[] dSort = {1,2, 9,12,23,30,50,56,68,90,99};
		Integer[] d2 = {5,4,3,2,1};
		Integer[] d2Sort = {1,2,3,4,5};
		Integer[] d3 = {0,4,3,-2,0};
		Integer[] d3Sort = {-2,0,0,3,4};
		
		return new Object[][]{
			{ d, dSort },{ d2, d2Sort }, {d3,d3Sort}
			
		};
	}
 
	
  @Test(dataProvider = "ValidDataProvider")
  public void testQuickSort(Integer[] dataArr,Integer[] sorteddataArr ){
		 QuickSort<Integer> quick = new QuickSort<Integer>();
		 quick.setElementArray(dataArr);
		 quick.setStart(0);
		 quick.setEnd(dataArr.length-1);
		 Integer[] arr = quick.sort();
		 Assert.assertArrayEquals(sorteddataArr, arr);
		 assert 1==3;
		 
	 }
}
