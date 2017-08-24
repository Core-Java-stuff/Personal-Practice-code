package com.sjgm.question;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseWord {
	// Using java 7
	public static String reverse(String word) {
		List<String> wordList = new ArrayList<>();
		for (String s : word.split(" ")) {
			wordList.add(s);
		}
		Collections.reverse(wordList);
		return String.join(" ", wordList);
	}

	// Using java 8
	public static String reverse2(String word) {
		StringBuffer sb = new StringBuffer();
		Arrays.stream(word.split(" "))
				.collect(Collectors.toCollection(ArrayDeque::new))
				.descendingIterator()
				.forEachRemaining(s -> sb.append(s).append(" "));
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(reverse("I Love My India"));
		System.out.println(reverse2("I Love My India"));
	}
}
