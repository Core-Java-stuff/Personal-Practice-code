package com.java8.collection.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class ConvertMapToList {

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

	// How to iterate key from map in java and convert to List
	public static List<Integer> getRank() {
		return company.keySet().stream().collect(Collectors.toList());
	}

	// How to iterate Value from map in java and convert to List
	public static List<String> getAllCompany() {
		return company.values().stream().collect(Collectors.toList());
	}

	// How to convert complete map to List
	public static List<Entry<Integer, String>> getAllEntry() {
		return company.entrySet().stream().collect(Collectors.toList());
	}

	public static void main(String[] args) {
		System.out.println(getRank());
		System.out.println(getAllCompany());
		System.out.println(getAllEntry());
	}
}
