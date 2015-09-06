package com.cracking.code.interview.chapter;



public class Chap1ReplaceEmptyString4 {
	// Assume string has sufficient free space at the end
	public static void replaceSpaces(char[] str, int length) {
		int spaceCount = 0, index, i = 0;
		for (i = 0; i < length; i++) {
			if (str[i] == ' ') {
				spaceCount++;
			}
		}
		index = length + spaceCount * 2;
		System.out.println("index: "+index);
		str[index] = '#';
		
		for (i = length - 1; i >= 0; i--) {
			System.out.println("str[i]: "+i+"  "+str[i]);
			System.out.println("str[index]: "+index+" "+str[index]);
			if (str[i] == ' ') {
				str[index - 1] = '0';
				str[index - 2] = '2';
				str[index - 3] = '%';
				index = index - 3;
			} else {
				str[index - 1] = str[i];
				index--;
			}
		}
	}
	
	public static void main(String[] args) {
		String str = "abc d e f";
		int spaces = 3;
		int excess = 7;
		char[] arr = new char[str.length() + spaces * 2 + 1 + excess];
		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
		}
		for (int i = str.length(); i < arr.length; i++) {
			arr[i] = ' ';
		}
		System.out.println(String.valueOf(arr));
		System.out.println("arr.length: "+arr.length);
		System.out.println("str.length(): "+str.length());
		replaceSpaces(arr, str.length());	
		System.out.println("Final String: "+String.valueOf(arr));
		//System.out.println("\"" + AssortedMethods.charArrayToString(arr) + "\"");
	}
}