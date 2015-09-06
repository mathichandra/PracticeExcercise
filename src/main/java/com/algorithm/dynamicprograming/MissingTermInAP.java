package com.algorithm.dynamicprograming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MissingTermInAP {

	public static void main(String args[]) throws Exception {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int[] inArr = new int[t];
		for (int i = 0; i < t; i++) {
			inArr[i] = in.nextInt();
		}
		missingTermInAP(inArr);
	}
	
	public static void missingTermInAP(int[] input){
		int len = input.length;
		System.out.println(len);
		int left =0;
		int right = len-1;
		int diff = (input[right]-input[left])/len;
		if(diff > 1){
			
		}
		System.out.println("diff: "+diff);
	}
	
	private static void missingNumber(int[] inputArr, int right,int left){		
		int mid = left +(right-left)/2;
		
	}

}
