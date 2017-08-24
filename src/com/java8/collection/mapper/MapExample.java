package com.java8.collection.mapper;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	public static void main(String[] args) {
		// updates:
		Map<Integer, String> nameForId = new HashMap<>();
		nameForId.put(1, "Java");
		nameForId.put(2, null);

		nameForId.computeIfAbsent(1, key -> "Java at " + key);
		System.out.println("No changes: " + nameForId);
/*
		nameForId.computeIfAbsent(2, key -> "Esperanto at " + key);
		System.out.println("Null updated: " + nameForId);

		nameForId.computeIfAbsent(3, key -> "Clojure at " + key);
		System.out.println("New key: " + nameForId);*/
	}
}
