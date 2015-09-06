package com.practice.samples;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeSortEmployeeObject implements Comparable<TreeSortEmployeeObject>{
	private String firstName;
	private String lastName;
	private Integer employeeId;

	public static void main(String[] args) {
		TreeSortEmployeeObject emp1 = new TreeSortEmployeeObject();
		TreeSortEmployeeObject emp2 = new TreeSortEmployeeObject();
		TreeSortEmployeeObject emp3 = new TreeSortEmployeeObject();
		TreeSortEmployeeObject emp4 = new TreeSortEmployeeObject();
		TreeSortEmployeeObject emp5 = new TreeSortEmployeeObject();
		emp1.setFirstName("Mathi");
		emp1.setLastName("Chandra");
		emp1.setEmployeeId(100);
		
		emp2.setFirstName("Jana");
		emp2.setLastName("Selvam");
		emp2.setEmployeeId(101);
		
		emp3.setFirstName("Sumathi");
		emp3.setLastName("Selvam");
		emp3.setEmployeeId(102);
		
		emp4.setFirstName("Senthil");
		emp4.setLastName("Kumaran");
		emp4.setEmployeeId(103);
		
		emp5.setFirstName("Mano");
		emp5.setLastName("Vinoth");
		emp5.setEmployeeId(104);
		
		Map<TreeSortEmployeeObject,Integer> empMap = new HashMap<>();
		empMap.put(emp1, emp1.getEmployeeId());
		empMap.put(emp2, emp2.getEmployeeId());
		empMap.put(emp3, emp3.getEmployeeId());
		empMap.put(emp4, emp4.getEmployeeId());
		empMap.put(emp5, emp5.getEmployeeId());
		
		Map<TreeSortEmployeeObject, Integer> treeMap = new TreeMap<>(empMap);
	//	printMap(treeMap);
		for(TreeSortEmployeeObject sm:treeMap.keySet()){
			System.out.println(sm.getLastName()+" "+empMap.get(sm));
		}


	}
	
	@Override
	public int compareTo(TreeSortEmployeeObject o) {
		return this.lastName.compareToIgnoreCase(o.getLastName());
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	

}
