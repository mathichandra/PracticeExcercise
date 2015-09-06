package com.algorithm.dynamicprograming;

/*
 * Refer- http://www.csegeek.com/csegeek/view/tutorials/algorithms/arrays_strings/arr_str_part2.php
 * Problem :- Sort an array of 0s & 1s, i.e element at each index of the array is either 0 or 1. 
 Implement an efficient algorithm so that the array gets sorted (all '0's are placed before '1's)

 Solution :- 
 First approach that we might think of is counting the no. of '0's (say 'm') and '1s' (say 'n') and then placing m '0's and n '1's. Well, this approach is efficient with complexity of O(n) but it requires traversing the array 2 times. So, as soon as you suggest this approach, interviewer would ask for a better solution.
 Following implementation sorts the array in 1 pass.
 Say 'i' points to index 0 & 'j' points to index n-1.
 We will start traversing from end of the array.
 If arr(j) is 0, then swap arr(i) & arr(j) and increment 'i' else decrement 'j'.
 In this way all 0s will form one portion of the array and all 1s will form other portion.

 i/p: {0,1,0,1,1,0,1,0,0,1,0}
 o/p: 

 Assumptions:
 1. Positive Integers in the input array
 2. Equal number of Zeros and ones in the input array
 * */

public class SortArraysWithZerosAndOnes {

	public static void main(String[] args) {
		int arr[] = { 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1 };
		sortArray(arr);

	}

	public static void sortArray(int[] inputArr) {
		int lenArr = inputArr.length;
		int left = 0;
		int right = lenArr - 1;

		while (left < right) {

			if (checkEqual(inputArr, left, right)) {
				if (inputArr[right] == 0) {
					left++;
				}
				if (inputArr[right] == 1) {
					right++;
				}
			} else {
				if (inputArr[right] == 0) {
					inputArr = swap(inputArr, left, right);
					right++;
					left--;
				}
				if (inputArr[left] == 0 || inputArr[right] == 1) {
					right--;
					left++;
				}

			}

		}
		for (int i = 0; i < lenArr; i++) {
			System.out.print(inputArr[i] + " ");
		}
	}

	private static int[] swap(int[] input, int left, int right) {

		int temp = input[left];
		input[left] = input[right];
		input[right] = temp;
		return input;

	}

	private static boolean checkEqual(int[] input, int left, int right) {

		if (input[left] == input[right]) {
			return true;
		}

		return false;

	}

}
