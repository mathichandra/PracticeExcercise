package com.practice.samples;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeHashCode {
	
	private Integer empId;
	private String fname;
	private String lname;
	private String depName;

	public static void main(String[] args) {
		EmployeeHashCode emp1 = new EmployeeHashCode();
		EmployeeHashCode emp2 = new EmployeeHashCode();
		emp1.setEmpId(123);
		emp2.setEmpId(123);
		//System.out.println(emp1.equals(emp2));//false b4 overriding equals method
		System.out.println(emp1.equals(emp2));//true after overriding equals method
		/*Now i thinking of removing the duplicates so passing the employee object to a Set*/
		Set<EmployeeHashCode> eSet = new HashSet<>();
		eSet.add(emp1);
		eSet.add(emp2);
		for(EmployeeHashCode e: eSet){
			//System.out.println(e.hashCode());
			//System.out.println(e.getEmpId()); // this prints the two values of 
											//emp1 and emp2 but as per the equals method it should print only one value
											// removing the duplicate it is not happening so overriding the hashCode() would help
		}
		
		Set<EmployeeHashCode> tSet = new TreeSet<>();
		eSet.add(emp1);
		eSet.add(emp2);
		for(EmployeeHashCode e: eSet){
			System.out.println(e.hashCode());
			System.out.println(e.getEmpId()); // this prints the two values of 
											//emp1 and emp2 but as per the equals method it should print only one value
											// removing the duplicate it is not happening so overriding the hashCode() would help
		}
	}

	/*Default Set equals() compares the object reference and it assumes it as 
	 * different object and returns false and so prints the duplicates without overriding the 
	 * equals method in this class
	 * 
	 * */
	@Override
	public boolean equals(Object o){
		if(o == null) return false;
		if(o == this) return true;
		if(getClass() != o.getClass()) return false;
		EmployeeHashCode oe = (EmployeeHashCode) o;
		return this.getEmpId().equals(oe.getEmpId());
	}
	
	/*Default hashcode method returns two different hashcode so we have to make sure to 
	 * override the hashcode to return the same code and equals method to say true
	 * 
	 * returns same hash code for emp1 and emp2 but the equals method helps to 
	 * identify the objest values are equal and it returns equal so duplicate is removed*/
	@Override
	public int hashCode(){
		int PRIME = 31;
		int result =1;
		result = PRIME+result*this.getEmpId();
		return result;
	}
	
	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
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

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

}
