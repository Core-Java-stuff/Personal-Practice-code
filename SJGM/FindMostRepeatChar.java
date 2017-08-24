package com.sjgm.question;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindMostRepeatChar {

	public static List<Entry<String, Long>> find(String s) {
		return Arrays
				.stream(s.split(""))
				.collect(
						Collectors.groupingBy(Function.identity(),
								Collectors.counting())).entrySet().stream()
				.sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toList());

	}

	public static void main(String[] args) {
		List<Entry<String, Long>> data = find("basanta");
		System.out.println("Most Repeat Char is :" + data.get(data.size() - 1));
	}
}
