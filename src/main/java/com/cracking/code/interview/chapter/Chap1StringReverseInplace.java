package com.cracking.code.interview.chapter;

public class Chap1StringReverseInplace {

	private static StringBuffer sb = new StringBuffer();
	public static void main(String[] args) {
		String str = "asdae";
		System.out.println(reverseString(str));
		System.out.println(reverStringRecur(str));
		System.out.println(reverStringLoop(str));

	}
	
	//Approach 1 - recursion
	public static String reverStringRecur(String str){
		System.out.println("Executing approach 1 recursion");
		long currMill = System.currentTimeMillis();
		System.out.println(System.currentTimeMillis());
		int len = str.length();
		if(len > 0){
			sb.append(str.charAt(len-1));
			return reverStringRecur(str.substring(0, len-1));
		}
		//long runMill = System.currentTimeMillis();
		System.out.println(System.currentTimeMillis()-currMill);	
		return sb.toString();
	}
	
	//Approcal 2 - just looping
	public static String reverStringLoop(String str){
		System.out.println("Executing approach 2 looping");
		long currMill = System.currentTimeMillis();
		System.out.println(System.currentTimeMillis());
		int len = str.length();
		for(int i=len-1;i>=0;i--){
			sb.append(str.charAt(i));
		}
		
		long runMill = System.currentTimeMillis();
		System.out.println(runMill-currMill);	
		return sb.toString();
	}
	
	//Approach 3 not efficient
	public static String reverseString(String str){
		char[] charArr = null;
		try{
			
			str = null;
		charArr = str.toCharArray();
		System.out.println("Executing approach 3 Char[]");
		long currMill = System.currentTimeMillis();
		System.out.println(System.currentTimeMillis());
		int len = str.length();
		
		
		int left =0;
		int right = charArr.length-1;
		char temp;
		
		while(left <= right){
			temp = charArr[left];
			charArr[left] = charArr[right];
			charArr[right] = temp;
			left++;
			right--;
		}		
		long runMill = System.currentTimeMillis();
		System.out.println(runMill-currMill);	
		}catch(NullPointerException e){
			e.printStackTrace();
			throw (e);
		}
		return String.copyValueOf(charArr);
	}

}
