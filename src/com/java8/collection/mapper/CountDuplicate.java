package com.java8.collection.mapper;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CountDuplicate {

	public static void printOccurance(String[] input) {
		List<String> list = Arrays.asList(input);
		list.stream()
				.filter(l -> Collections.frequency(list, l) >= 1)
				.collect(Collectors.toSet())
				.forEach(
						l -> System.out.println(l + "-"
								+ Collections.frequency(list, l)));
	}

	public static void main(String[] args) {
		printOccurance(new String[] { "apple", "apple", "banana", "apple",
				"orange", "banana", "papaya" });
	}
}
