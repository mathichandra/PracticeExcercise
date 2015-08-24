package com.algorithm.warmup;

import java.util.Scanner;

public class SimpleArraySum {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		try {
			int t = in.nextInt();
			int sum = 0;
			int temp;
			 
			for (int i = 0; i < t; i++) {
				temp = in.nextInt();
				sum = sum + temp;

			}

			System.out.println(sum);

		} finally {
			in.close();
		}
	}
}
