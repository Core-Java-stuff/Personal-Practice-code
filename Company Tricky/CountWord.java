package com.ravsoft.questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 1.Counts char from a given sentence
 *
 */
public class CountWord {

	// Java 7
	public static Map<String, Integer> count1(String sentence) {
		Map<String, Integer> wordMap = new HashMap<>();
		for (String word : sentence.split("")) {
			if (wordMap.containsKey(word)) {
				wordMap.put(word, wordMap.get(word) + 1);
			} else {
				wordMap.put(word, 1);
			}
		}
		return wordMap;
	}

	// Java 8
	public static Map<String, Long> count2(String sentence) {
		return Arrays.stream(sentence.split("")).collect(
				Collectors.groupingBy(Function.identity(),
						Collectors.counting()));

	}

	public static void main(String[] args) {
		System.out
				.println(count1("Ram is a good boy and Ram is a good student"));
		System.out
				.println(count2("Ram is a good boy and Ram is a good student"));
	}
}
