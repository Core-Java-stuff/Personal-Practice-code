package com.sjgm.question;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatChar {

	public static char getFirstNonRepeatChar(String word) {
		char ch = 0;
		Map<Character, Long> wordMap = getoccurance(word);
		System.out.println(wordMap);
		for (char key : wordMap.keySet()) {
			if (wordMap.get(key) == 1) {
				ch = key;
				break;
			}
		}
		return ch;
	}

	public static Map<Character, Long> getoccurance(String word) {
		Map<Character, Long> wordMap = new LinkedHashMap<Character, Long>();
		for (char ch : word.toCharArray()) {
			if (wordMap.containsKey(ch)) {
				wordMap.put(ch, wordMap.get(ch) + 1);
			} else {
				wordMap.put(ch, (long) 1);
			}
		}
		return wordMap;
	}

	public static char getFirstNonRepeatChar2(String sentence) {
		Map<String, Long> map = new LinkedHashMap<>();
		List<String> list = Arrays.asList(sentence.split(""));
		list.stream()
				.filter(s -> Collections.frequency(list, s) >= 1)
				.collect(Collectors.toSet())
				.forEach(
						value -> map.put(value,
								(long) Collections.frequency(list, value)));
	System.out.println(map);
		return 0;
	}

	public static void main(String[] args) {
		System.out.println(getFirstNonRepeatChar("adabcbzq"));
		System.out.println(getFirstNonRepeatChar2("adabcbzq"));

	}
}
