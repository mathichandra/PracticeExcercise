package com.practice.samples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringComparator {

	public static void main(String[] args) {
		String str1 = "Mathi";
		String str2 = "chandra";
		String str3 = "Mano";
		String str4 = "Chitra";
		List<String> list = new ArrayList<>();
		list.add(str1);
		list.add(str2);
		list.add(str3);
		list.add(str4);
		/*Collections.sort(list); -->String class compareTo method is case sensitive and it compare
		 * capital letter with small letter and gives the Capital letter lesser value then small letter 
		Chitra
		Mano
		Mathi
		chandra*/
		//SO here we use Coparator to overcome this issue
		Collections.sort(list, new Comparator<String>() {

					@Override
					public int compare(String o1, String o2) {

						return o1.compareToIgnoreCase(o2);
					}
		});

/*		
 * now it is not case sensitive
 * chandra
		Chitra
		Mano
		Mathi*/

		for(String s: list){
			System.out.println(s);
		}

	}

}
