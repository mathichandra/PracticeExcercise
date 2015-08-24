package com.algorithm.warmup;

import java.util.Scanner;

public class Staircase {

/*	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		String[] aList = new String[a];
		String hashTag = "#";
		int count = a;
		for (int i = 1; i <= a; i++) {
			//System.out.println("count: " + count);
			for (int j = 1; j <= i; j++) {
				aList[count-1] = hashTag;
				
				
			}
			hashTag = hashTag + hashTag;
			
			count--;
		}
		for(int k=0;k<=a-1;k++){
			System.out.println(aList[k]);
		}
		
	}*/
	
	public static void main(String[] args) {
		  Scanner in = new Scanner(System.in);
	        int a = in.nextInt();
	        for(int i=1;i<=a;i++){
	        	
	        	for(int j=1;j<=i;j++){
	        		
	        		System.out.print("#");
	        		
	        	}
	        	System.out.println();
	        }
	}
	
	public static void printStairCase(){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		String hashValue = "#";
		
		for(int i=0;i<t;i++){
			String[] str = new String[t];
			//hashValue += "#";
			for(int j=0;j<=t-1;j++){
				str[j]=" ";
				//str[t-1] = hashValue;
				System.out.println(str[j]+hashValue);
			}
		}
		
		
	}

}
