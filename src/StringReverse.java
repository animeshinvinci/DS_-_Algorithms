
public class StringReverse {
	
	public String iterativeReverse(String str){
		String revStr = "";
		
		return revStr;
		
	}
	
	public String reverseWithStringBuffer(String str){
		String revStr = "";
		
		return revStr;
	}
	
	public String reverseWithRecursion(String str,String revStr){
		
		int beginIndex = 0;
		int endIndex = revStr.length();
		while(str.length() != revStr.length()){
			revStr = revStr.charAt(revStr.length() -1) + reverseWithRecursion(revStr.substring(beginIndex, endIndex),revStr);
		}
		return revStr;
	}

}
