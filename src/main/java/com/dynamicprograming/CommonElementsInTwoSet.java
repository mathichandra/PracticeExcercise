package com.dynamicprograming;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

public class CommonElementsInTwoSet {

	public static void main(String[] args) {
		Set<Integer> setOne = new HashSet<Integer>();
		Set<Integer> setTwo = new LinkedHashSet<Integer>();
		Set<Integer> setThree = new HashSet<Integer>();
		Set<Integer> hashSet = new HashSet<Integer>();
		setOne.add(1);
		setOne.add(2);
		setOne.add(3);
		setTwo.add(4);
		setTwo.add(2);
		setTwo.add(5);
		setTwo.add(5);
		hashSet.add(78);
		hashSet.add(38);
		hashSet.add(99);
		
		setThree = new HashSet<Integer>(setOne);
		Set<Integer> sortedSet = new TreeSet<Integer>(setTwo);
		System.out.println("TreeSet impl SortedSet--> SortedOrder");
		for(Integer k:sortedSet){
			
			System.out.println(k);
		}
		System.out.println("LinkedHashSet-->Insertion Order");
		for(Integer m:setTwo){
			
			System.out.println(m);
		}
		System.out.println("HashSet--> hashcode order");
		for(Integer n:hashSet){
			
			System.out.println(n+" -->hashCode: "+n.hashCode());
		}
		System.out.println(setOne.containsAll(setTwo));
		System.out.println(setThree.removeAll(setTwo));
		for(Integer j:setOne){
			System.out.println(j);
		}
		System.out.println(setOne.removeAll(setThree));
		for(Integer i: setOne){
			System.out.println(i);
		}
		
	}

}
