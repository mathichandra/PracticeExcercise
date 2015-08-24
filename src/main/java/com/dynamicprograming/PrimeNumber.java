package com.dynamicprograming;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class PrimeNumber {

	public static void main(String[] args) {
		int[] primeList = { 0, 2, 3, 4, 5, 6, 7, 11, 19, 17, 15,97 };
		Map<Integer, Boolean> mapPrimeList = new TreeMap<Integer, Boolean>();
		for (int i = 0; i < primeList.length; i++) {
			mapPrimeList.put(primeList[i], isPrime(primeList[i]));
		}
		for(Integer k: mapPrimeList.keySet()){
			if(mapPrimeList.get(k))
			System.out.println(k+" is a Prime Number: ");
			else
			System.out.println(k+" is not a Prime Number");
		}

	}

	public static boolean isPrime(int input) {
		if (input % 2 == 0 && input/2 != 1) {
			return false;
		}
		int sqtInput = (int) Math.sqrt(input);
		for (int i = 3; i <= sqtInput; i = i + 2) {
			if (input % i == 0) {
				return false;
			}
		}

		return true;

	}

}
