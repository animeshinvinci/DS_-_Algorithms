package com.ds.string;

import java.util.Stack;
import java.util.regex.Pattern;

public class StringUtils {
	
	
	public static boolean isPalindrome(String input){
		if(input.length() <= 1){
			return true;
		}
		if(input.equals(reverseStringWithStack(input))){
			return true;
		}
		return false;
	}
	  
	public static String reverseStringWithStack(String input){
		Stack<Character> stack = new Stack<Character>();
		for(int i=0;i<input.length();i++){
			stack.push(input.charAt(i));
			}
			String revInput = "";
			while(stack.isEmpty()){
				revInput = revInput + stack.pop();
			}
		return revInput;
	}
	
	public static String reverseStringWithStrBuffer(String input){
		StringBuffer strbuff = new StringBuffer(input);
		return strbuff.reverse().toString();
	}
	
	public static String reverseStringWithRecursion(String input,String revStr ){
		int length = input.length();
		if(length>=1)
			revStr = revStr + input.charAt(length-1) + reverseStringWithRecursion(input.substring(0, length-1),revStr);
			return revStr;
	}
	
	public static String reverseString(String input){
		String revStr = "";
		for(int i=input.length()-1;i>=0;i--){
			revStr = revStr + input.charAt(i);
		}
		return revStr;
		}
	
	
	
	/* Left Trim of String
    * 
	* 	
	*/
	public static String leftTrim(String input){
		String pattern = "^\\s";
		return input.replaceAll(pattern, "");
	}
	
	/* Right Trim of String
	 * 
	 * 	
	 */
	public static String rightTrim(String input){
		String pattern = "\\s$";
		return input.replaceAll(pattern, "");
	}
	
	public static void main(String[] args) {
		System.out.println(StringUtils.isPalindrome("121"));
		String s = "animesh";
		String e = "";
		e = reverseStringWithRecursion(s,e);
		System.out.println(e);
		
		System.out.println(reverseString(s));
		
		String lr = " ae   er   tr    tr ";
		System.out.println(lr.length());
		System.out.println(leftTrim(lr)+ "!!");
		
		System.out.println(rightTrim(lr) + "!!");
		
	}
  
}
