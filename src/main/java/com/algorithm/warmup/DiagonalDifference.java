package com.algorithm.warmup;

import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		try{
		
		int t = in.nextInt();
		int[][] board = new int[t][t];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = in.nextInt();
			}
		}
		diagonalDifference(board, t);
		}finally{
			in.close();
		}
	}

	private static void diagonalDifference(int[][] board, int t) {
		int[][] rightBoard = new int[t][t];
		int[][] leftBoard = new int[t][t];
		int row = 0;
		int column = t - 1;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (i == j) {
					rightBoard[i][j] = board[i][j];
				}
				if (row == i && column == j) {
					leftBoard[row][column] = board[i][j];
					row++;
					column--;
				}
			}
		}
		int rightSum = printDiagonalArrays(rightBoard);
		int leftSum = printDiagonalArrays(leftBoard);
		if (rightSum >= leftSum)
			System.out.println(rightSum - leftSum);
		if (rightSum < leftSum)
			System.out.println(leftSum - rightSum);
	}

	private static int printDiagonalArrays(int[][] board) {
		// System.out.println();
		int sumOf = 0;
		for (int[] a : board) {
			for (int i : a) {
				sumOf = sumOf + i;
				// System.out.print(i+ "\t");

			}

			// System.out.println("\n");
		}
		return sumOf;
	}
}
