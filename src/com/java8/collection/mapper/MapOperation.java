package com.java8.collection.mapper;

import java.util.HashMap;
import java.util.Map;

public class MapOperation {
	static Map<Integer, String> company = new HashMap<Integer, String>();

	static {
		company.put(1, "IBM");
		company.put(2, "Microsoft");
		company.put(3, "Accenture");
		company.put(4, "Oracle");
		company.put(5, "Hewlett Packard");
		company.put(6, "SAP");
		company.put(7, "TCS");
	}

	/* Iterate Map */
	public static void iterateMap() {
		company.forEach((key, value) -> System.out.println(key + "<---->"
				+ value));
	}

	public static void getAllKeys() {
		// Approach:1
		company.keySet().forEach(key -> System.out.println(key));
		// Approach:2
		company.keySet().forEach(System.out::println);
	}

	public static void getAllValues() {
		// Approach:1
		company.values().forEach(value -> System.out.println(value));
		// Approach:2
		company.values().forEach(System.out::println);
	}
	
	

	public static void main(String[] args) {
		iterateMap();
		getAllKeys();
		getAllValues();
	}

}
