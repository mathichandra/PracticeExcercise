package com.practice.samples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserListComparable implements Comparable<UserListComparable>{
	
	private String username;
	private String password;

	public static void main(String[] args) {

		UserListComparable user1 = new UserListComparable();
		UserListComparable user2 = new UserListComparable();
		UserListComparable user3 = new UserListComparable();
		user1.setUsername("Zaed");
		user2.setUsername("maed");
		user3.setUsername("baed");
		
		user1.setPassword("zppp");
		user2.setPassword("mppp");
		user3.setPassword("bppp");
		
		List<UserListComparable> list = new ArrayList<>();
		list.add(user1);
		list.add(user2);
		list.add(user3);
		Collections.sort(list);
		for(UserListComparable ulc:list){
			System.out.println(ulc.getUsername());
		}
	}
	
	@Override
	public int compareTo(UserListComparable o) {

		return this.username.compareToIgnoreCase(o.getUsername());
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}





}
