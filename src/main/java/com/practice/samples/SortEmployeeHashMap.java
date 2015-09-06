package com.practice.samples;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*
 * Sort the Employee key with lname
 * */
public class SortEmployeeHashMap {
	private String fname;
	private String lname;
	private String deptName;
	private Integer empId;
	
	public SortEmployeeHashMap(String fname,String lname,String deptName,Integer empID){
		this.fname = fname;
		this.lname = lname;
		this.deptName = deptName;
		this.empId = empID;
	}

	public static void main(String[] args) {
		SortEmployeeHashMap emp1 = new SortEmployeeHashMap("Mathi","Chandra","10",234);
		SortEmployeeHashMap emp3 = new SortEmployeeHashMap("Jana","Selvam","10",134);
		SortEmployeeHashMap emp2 = new SortEmployeeHashMap("Mano","Vinoth","10",134);
		Map<SortEmployeeHashMap,String> empMap = new  HashMap<>();
		empMap.put(emp1, "first");
		empMap.put(emp2, "second");
		empMap.put(emp3, "third");
		
		/*Want the print stmt as sort the employee obj based on lsname
		empMap.put(emp3, "first");
		empMap.put(emp1, "second");
		empMap.put(emp2, "third");
		 * */
		/*for(SortEmployeeHashMap s : empMap.keySet()){
			System.out.println(s.lname+"  "+empMap.get(s));
		}*/
		Map<SortEmployeeHashMap,String> tMap = new  TreeMap<>(new Comparator<SortEmployeeHashMap>() {

			@Override
			public int compare(SortEmployeeHashMap o1, SortEmployeeHashMap o2) {
				
				return o1.getLname().compareTo(o2.getLname());
				//return o1.getEmpId().compareTo(o2.getEmpId());
			}
		});
		tMap.putAll(empMap);
		
		for(SortEmployeeHashMap s : tMap.keySet()){
			System.out.println(s.lname+"  "+tMap.get(s));
		}
		

	}
	
	@Override
	public boolean equals(Object o){
		if(o == null) return false;
		if(this == o ) return true;
		if(getClass() != this.getClass()) return false;
		SortEmployeeHashMap sm =(SortEmployeeHashMap) o;
		return this.getEmpId().equals(sm.getEmpId());
	}

	@Override
	public int hashCode(){
		int PRIME = 31;
		int result =1;
		result = PRIME+result*this.getEmpId();
		return result;
	}
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

}
