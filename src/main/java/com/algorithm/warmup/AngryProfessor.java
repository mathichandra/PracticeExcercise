package com.algorithm.warmup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AngryProfessor {

	private static List<String> resultList = new ArrayList<String> ();
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		try {
			int noOfTestCases = in.nextInt();
			int noOfStudent = 0;
			int expectedStudents =0;
			if(noOfTestCases > 0 && noOfTestCases <= 10){
				for(int i=0;i<noOfTestCases;i++){
					noOfStudent =  in.nextInt();
					expectedStudents = in.nextInt();
					if(!(noOfStudent > 0 && noOfStudent <= 1000 && expectedStudents > 0 && expectedStudents <= noOfStudent)){
						System.exit(0);
					}
					int[] entryArray = new int[noOfStudent];
					for(int j=0;j<noOfStudent;j++){
						entryArray[j] = in.nextInt();
						if(!(entryArray[j] >= -100 && entryArray[j] <=100)){
							System.exit(0);
						}
					}
					
					isClassCanceled(noOfTestCases,noOfStudent, expectedStudents, entryArray);
					
				}
				for(String str:resultList){
					System.out.println(str);
				}
			}else{
				System.exit(0);
			}
			
		}finally{
			in.close();
		}

	}
	
	public static List<String> isClassCanceled(int noOfTestCases,int noOfStudent,int expectedStudents,int[] entryArray){
		Map<Integer,String> entryMap = new HashMap<Integer,String>();
		int count = 1;
		for(int i=0;i<entryArray.length;i++){
			if(entryArray[i] >= 0){
				count = count+1;
				entryMap.put(count,"Present");
			}
		}
		if(expectedStudents >= entryMap.size()){
			resultList.add("YES");
		}else if(expectedStudents < entryMap.size()){
			resultList.add("NO");
		}
		return resultList;
	}
}
