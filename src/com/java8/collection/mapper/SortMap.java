package com.java8.collection.mapper;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SortMap {
	static Map<Integer, String> company = new HashMap<Integer, String>();

	static {
		company.put(1, "IBM");
		company.put(21, "Microsoft");
		company.put(13, "Accenture");
		company.put(40, "Oracle");
		company.put(5, "Hewlett Packard");
		company.put(16, "SAP");
		company.put(12, "TCS");
	}

	/* Sort map using key in java 8 */
	public static Map<Integer, String> sortByKey(Map<Integer, String> inputMap) {
		Map<Integer, String> map = new LinkedHashMap<>();
		inputMap.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.forEachOrdered(c -> map.put(c.getKey(), c.getValue()));
		return map;
	}

	/* Sort map using value in java 8 */
	public static Map<Integer, String> sortByValue(Map<Integer, String> inputMap) {
		Map<Integer, String> map = new LinkedHashMap<>();
		inputMap.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.forEachOrdered(c -> map.put(c.getKey(), c.getValue()));
		return map;
	}

	public static void testSort(Map<Integer, String> inputMap) {
		inputMap.entrySet().stream()
				.sorted(new Comparator<java.util.Map.Entry<Integer, String>>() {
					@Override
					public int compare(java.util.Map.Entry<Integer, String> o1,
							java.util.Map.Entry<Integer, String> o2) {
						return o1.getKey() - o2.getKey();
					}
				}).forEach(System.out::println);
		;
	}

	public static void main(String[] args) {
		// System.out.println(sortByKey(company));
		// System.out.println(sortByValue(company));

		testSort(company);
	}
}
