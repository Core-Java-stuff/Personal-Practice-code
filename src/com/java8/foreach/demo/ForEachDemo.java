package com.java8.foreach.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import com.java8.common.pojo.User;

public class ForEachDemo {

	private static List<User> users;

	static {
		users = new ArrayList<>();
		users.add(new User(112, "Basant", "IT-DEV", 25));
		users.add(new User(352, "Rakesh", "Telecom", 21));
		users.add(new User(892, "Biswas", "IT-DEV", 26));
		users.add(new User(240, "Ashik", "MedicalManagement", 29));
	}

	public static void main(String[] args) {
		// ITERATE APPROACH:1
		System.out.println("Approach : 1");
		users.forEach(new Consumer<User>() {
			@Override
			public void accept(User user) {
				System.out.println(user);
			}
		});

		// ITERATE APPROACH:2
		System.out.println("Approach : 1");
		users.forEach(u -> System.out.println(u));

		// ITERATE APPROACH:3(APPYING CONDITION)
		System.out.println("No of users : "
				+ users.stream()
						.filter(user -> user.getProfession().equals("IT-DEV"))
						.collect(Collectors.toList()));
		// ITERATE APPROACH:4
		users.forEach(System.out::println);
		calculateSumAge();
	}

	public static List<User> getITUsers() {
		List<User> ITusers = new ArrayList<>();
		users.stream()
				.filter(u -> u.getProfession().equalsIgnoreCase("IT-DEV"))
				.forEach(ITusers::add);
		return ITusers;

	}

	public static void calculateSumAge() {
		int sum = users.stream().mapToInt(u -> u.getAge()).sum();
		System.out.println("Age count: " + sum);

		System.out.println("IT :" + getITUsers());
	}
}
