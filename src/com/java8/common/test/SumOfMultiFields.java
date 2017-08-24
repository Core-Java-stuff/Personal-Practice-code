package com.java8.common.test;


import java.util.ArrayList;
import java.util.List;

import com.java8.common.pojo.User;

public class SumOfMultiFields {
	public static void main(String[] args) {
		List<User> users = new ArrayList<>();

		for (int i = 1; i <= 5; i++) {
			users.add(new User(i, "user" + i, "dept" + i, i));
		}
		System.out.println("Sum of id :"
				+ ""
				+ users.stream().filter(user -> user.getName().equals("user4"))
						.mapToInt(user -> user.getId() + user.getAge()).sum());
	}
}
