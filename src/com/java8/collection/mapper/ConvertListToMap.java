package com.java8.collection.mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.java8.common.pojo.User;

public class ConvertListToMap {
	private static List<User> users;

	static {
		users = new ArrayList<>();
		users.add(new User(112, "Basant", "IT-DEV", 25));
		users.add(new User(352, "Rakesh", "Telecom", 21));
		users.add(new User(892, "Biswas", "IT-DEV", 26));
		users.add(new User(240, "Ashik", "MedicalManagement", 29));
	}

	public static Map<Integer, String> convertListToMap() {
		// Mapping User id as key and name as value
		return users.stream().collect(
				Collectors.toMap(u -> u.getId(), u -> u.getName()));
	}

	public static void main(String[] args) {
		// Iterating Map using java 8 for each
		convertListToMap().forEach(
				(key, value) -> System.out.println("Key :" + key + " value: "
						+ value));
	}
}
