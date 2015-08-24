package com.dynamicprograming;

import sun.security.util.Length;

public class MissingNumberSequence {

	public static void main(String[] args) {
		int[] naturalSequence = { 0, 1, 2, 3, 4, 5, 7, 8 };
		int[] oddNumbers = { 1, 3, 5, 7,9,11,13,15,17};
		int[] binarysortedSequence = {0,1,2,3,4,6};
		// findMissingNumber(naturalSequence);
		findMissingOddNumber(oddNumbers);
		//findMissingNumberBinarySearch(binarysortedSequence);
	}

	/*
	 * This is method will work only for the sequence of number where the
	 * difference in the sequence is 1
	 */
	public static void findMissingNumber(int[] a) {
		int aLength = a.length;
		int sumOfn = aLength * (aLength + 1) / 2;// sum of 0-n
		int sumOfArray = 0;
		int missingNumber = 0;
		for (int i = 0; i < aLength; i++) {
			sumOfArray += a[i];
		}

		missingNumber = sumOfn - sumOfArray;
		System.out.println(aLength + " sumOfn: " + sumOfn + " sumOfArray: "
				+ sumOfArray + " missingNumber: " + missingNumber);
		// System.out.println(aLength+" oddNumbers[aLength-1]: "+oddNumbers[aLength-1]+" oddNumbers[0]: "+oddNumbers[0]+" diff: "+diff);

	}
	
	/*
	 * This is method will work only for the sequence of number where the
	 * difference in the sequence is 1 with sorted order
	 */
	public static void findMissingNumberBinarySearch(int[] a) {
		int aLength = a.length;
		int left = 0;
		int right = aLength-1;
		int missingnumber = missingBinarySearch(a, left, right);
		if(missingnumber >= 0){
			System.out.println("Missing number on binary search is: "+missingnumber);
		}else{
			System.out.println("No missing number in the given sequence");
		}
		
		
	}
	public static int missingBinarySearch(int a[],int left,int right){
		if(right < left){
			return -1;
		}
		int mid = left +  (right-left)/2;
		System.out.println("mid: "+mid+" a[mid] "+a[mid]);
		if(mid == a[mid]){
			return missingBinarySearch(a, mid+1,right);
		}
		if(mid != a[mid]){
			
			if(mid == 0 || (mid-1==a[mid-1])){
				return mid;
			}
			
		}
		return missingBinarySearch(a, left, mid-1);
		//return -1;
	}

	/*
	 * This is method will work only for the sequence of number where the
	 * difference in the sequence is 2 or more lastindexValue-firstindexvalue/no
	 * of values in the array
	 */
	public static void findMissingOddNumber(int[] oddNumbers) {
		int aLength = oddNumbers.length;
		int diff = 0;
		if (aLength <= 0) {
			System.out.println("Invalid array");
		}
		if(aLength >= 3)
		{
			int actaulDiff0 = oddNumbers[1] - oddNumbers[0];
			int actaulDiff1 = oddNumbers[2] - oddNumbers[1];
			if(actaulDiff0 >= actaulDiff1){
				diff = actaulDiff1;
			}
			
			
		}else{
			 diff = (oddNumbers[aLength - 1] - oddNumbers[0]) / aLength;
		}
		
		
		System.out.println(aLength+" oddNumbers[aLength-1]: "+oddNumbers[aLength-1]+" oddNumbers[0]: "+oddNumbers[0]+" diff: "+diff);
		int missingNo = missingNumberWithDiff(oddNumbers, 0, aLength - 1, diff);
		if (missingNo > 0)
			System.out.println("missing number: " + missingNo);
		else
			System.out.println("No missing number");
	}

	public static int missingNumberWithDiff(int[] a, int left, int right,
			int diff) {
		if (right <= left) {
			return -1;
		}
		int mid = left + (right - left) / 2;
		if (mid > 0 && (a[mid] - a[mid - 1]) != diff) {
			return a[mid] - diff;
		}
		if ((a[mid + 1] - a[mid]) != diff) {
			return (a[mid] + diff);
		}
		if (a[mid] == a[0] + mid * diff) {
			return missingNumberWithDiff(a, mid + 1, right, diff);
		}
		return missingNumberWithDiff(a, left, mid - 1, diff);
	}
}
