package com.ds.linkedlist;

import java.util.LinkedList;

public class LargeNumberProblem {
	private String number;
	private LinkedList<Character> numList = new  LinkedList<Character>();
	
	
	public LinkedList<Character> getNumList() {
		return numList;
	}
	public void addNumberinList(String number){
		for(int i=0;i<=number.length()-1;i++){
			numList.add(number.charAt(i));
		}
		
		
	}

}
