package com.java8.collection.mapper;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicate {
	private static Map<String, Long> map = new HashMap<>();

	// Using Java 7 Approach:1
	public static Map<String, Long> findDuplicateCount1(String[] input) {
		List<String> list = Arrays.asList(input);
		Set<String> set = new HashSet<>(list);
		for (String s : set) {
			int count = Collections.frequency(list, s);
			if (count >= 1) {
				map.put(s, (long) count);
			}
		}
		return map;
	}

	// Using Java 8 Approach:2
	public static Map<String, Long> findDuplicateCount2(String[] input) {
		List<String> list = Arrays.asList(input);
		list.stream()
				.filter(s -> Collections.frequency(list, s) >= 1)
				.collect(Collectors.toSet())
				.forEach(
						value -> map.put(value,
								(long) Collections.frequency(list, value)));
		return map;
	}

	// Using Java 8 Approach:2
	public static Map<String, Long> findDuplicateCount3(String[] input) {
		return Arrays.stream(input).collect(
				Collectors.groupingBy(Function.identity(),
						Collectors.counting()));
	}

	public static void main(String[] args) {

		System.out.println(findDuplicateCount1(new String[] { "apple", "apple",
				"banana", "apple", "orange", "banana", "papaya" }));

		System.out.println(findDuplicateCount2(new String[] { "apple", "apple",
				"banana", "apple", "orange", "banana", "papaya" }));

		System.out.println(findDuplicateCount3(new String[] { "apple", "apple",
				"banana", "apple", "orange", "banana", "papaya" }));

	}

}
