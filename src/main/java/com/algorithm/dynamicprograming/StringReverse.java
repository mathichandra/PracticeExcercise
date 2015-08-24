package com.algorithm.dynamicprograming;

public class StringReverse {
	
	private static StringBuffer sb = new StringBuffer();

	public static void main(String[] args) {
		String givenString = "Mathi Chandra Selvam";
		String reversedString ="";
		if(null != givenString && !givenString.isEmpty()){
			 reversedString = reverseStringRecursive(givenString);	
			// System.out.println(reversedString);
		}
		if(null != reversedString && !reversedString.isEmpty() && reversedString.split(" ").length > 1){
			//reverseWord(reversedString.toLowerCase());
			reReverseWordString(reversedString);
		}
		

	}

	public static String reverseString(String input) {
		int strLen = input.length();
		String reversedStr = "";
		// reverse given string
		for (int i = strLen - 1; i >= 0; i--) {
			reversedStr = reversedStr + input.charAt(i);
		}
		return reversedStr;
	}
	
	public static String reverseStringRecursive(String input) {
		String newStr = "";
		int strLen = input.length();
		while(strLen > 0){
			sb.append(input.charAt(strLen-1));
			strLen--;
			newStr = input.substring(0,strLen);
			return reverseStringRecursive(newStr);
		}
		return sb.toString();
	}
		
	

	public static void reverseWord(String reversedStr) {
		String reversedWord = "";
		// reverse the given word
		String[] wrdSplit = reversedStr.split(" ");
		for (int j = wrdSplit.length - 1; j >= 0; j--) {
			if (j != 0)
				reversedWord = reversedWord + wrdSplit[j] + " ";
			else
				reversedWord = reversedWord + wrdSplit[j];
		}

		System.out.println(reversedWord);
	}
	
	public static void reReverseWordString(String reversedStr) {
		String reversedWord = "";
		// reverse the given word
		String[] wrdSplit = reversedStr.split(" ");
		for(int i=0;i<wrdSplit.length;i++){
			if(i != wrdSplit.length-1){
			  wrdSplit[i] = reverseString(wrdSplit[i]);
			  reversedWord = reversedWord+wrdSplit[i]+" ";
			}
			else{
				wrdSplit[i] = reverseString(wrdSplit[i]);
				reversedWord = reversedWord+wrdSplit[i];
			}
		}

		System.out.println(reversedWord);
	}

}
