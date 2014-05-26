package com.ds.linkedlist;

import java.util.LinkedList;

public class App {
	public static void main(String[] args) {
		String num = "1234567898765";
		String num2 = "1234567898765";
		LargeNumberProblem largeobj = new LargeNumberProblem();
		largeobj.addNumberinList(num);
		LinkedList<Character> li = largeobj.getNumList();
		for(char s:li){
			System.out.println(s);
		}
	}
}
