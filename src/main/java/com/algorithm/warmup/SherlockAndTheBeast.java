package com.algorithm.warmup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SherlockAndTheBeast {

	private static List<String> outList = new ArrayList<String>();
	private static int[] decentNo = { 3, 5 };
	private static int decentSum = decentNo[0] + decentNo[1];
	private static final String DECENTTHREE = "555";
	private static final String DECENTFIVE = "33333";
	private static final String NA = "-1";

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		try {
			int noOfTestCases = in.nextInt();

			int givenDigit = 0;

			int tempThree = 0;
			int tempFive = 0;

			for (int i = 0; i < noOfTestCases; i++) {
				givenDigit = in.nextInt();
				if (givenDigit <= 0
						|| givenDigit < decentNo[0]
						|| (givenDigit > decentNo[0] && givenDigit < decentNo[1]) ||givenDigit < decentSum) {
					outList.add(NA);
				} else if (givenDigit == decentNo[0]) {
					outList.add(DECENTTHREE);
				} else if (givenDigit == decentNo[1]) {
					outList.add(DECENTFIVE);
				}else if (givenDigit == decentSum) {
					outList.add(DECENTTHREE + DECENTFIVE);
				}else{
					
				}

			}

			for (String i : outList) {
				System.out.println(i);
			}
		} finally {
			in.close();
		}

	}

	public static void findDecentNo(int givenDigit) {
		int tempDigit = givenDigit;
		int tempSum = decentSum;
		while (tempSum > 0) {
			if (tempDigit > decentNo[0] || tempDigit > decentNo[1]) {
				if (tempDigit >= tempSum) {
					tempSum = tempDigit - tempSum;
					if (tempSum == 0) {
						outList.add(DECENTTHREE + DECENTFIVE);
					} else {

					}

				} 
			}
		}
	}

}
