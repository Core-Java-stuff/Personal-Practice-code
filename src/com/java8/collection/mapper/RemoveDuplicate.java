package com.java8.collection.mapper;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author basanta.kumar.hota
 *
 */
public class RemoveDuplicate {
	/**
	 * distinct() method used specially to remove duplicates in java 8
	 *
	 */
	public static Object[] remove(String[] input) {
		return Arrays.stream(input).distinct().collect(Collectors.toList())
				.toArray();

	}

	// In Java 7
	public static String[] removeDuplicateWithoutCollection(String[] input) {
		String[] uniqueStrArrays = null;
		int length = input.length;
		for (int i = 0; i <= input.length - 1; i++) {
			for (int j = i + 1; j <= input.length - 1; j++) {
				if (input[i] == input[j]) {
					input[j] = input[length - 1];
					length--;
					j++;
				}
			}
		}
		uniqueStrArrays = Arrays.copyOf(input, length);
		return uniqueStrArrays;
	}

	public static void main(String[] args) {
		String[] input = { "Sun", "Apple", "JBoss", "Whatsup", "Apple",
				"BEA Weblogic", "JBoss" };
		// System.out.println(Arrays.toString(remove(input)));
		System.out.println(Arrays
				.toString(removeDuplicateWithoutCollection(input)));

	}
}
