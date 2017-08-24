package com.sjgm.question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySumCalculator {
	// Using Java 7
	public static int findSum(String[] input) {
		String str = "";
		int sum = 0;
		List<Integer> NumberList = new ArrayList<>();
		try {
			for (String s : input) {
				if (!s.matches(".*[a-z].*")) {
					NumberList.add(Integer.valueOf(s));
				} else if (s.matches("[a-zA-Z0-9]+")) {
					str = s.replaceAll("[^0-9]+", "");
					NumberList.add(Integer.valueOf(str));
				}
			}
			sum = sum(NumberList);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return sum;
	}

	private static int sum(List<Integer> list) throws IllegalAccessException {
		if (!list.isEmpty()) {
			int sum = 0;
			for (int i : list) {
				sum += i;
			}
			return sum;
		} else {
			throw new IllegalAccessException("No integer found to count");
		}
	}

	// Using Java 8
	public static int findSum2(String[] input) {
		List<Integer> NumberList = new ArrayList<>();
		Arrays.stream(input)
				.filter(s -> (s.matches("[a-zA-Z0-9]+"))
						|| (!s.matches(".*[a-z].*")))
				.forEach(
						s -> NumberList.add(Integer.valueOf(s.replaceAll(
								"[^0-9]+", ""))));
		return NumberList.stream().mapToInt(s -> s).sum();

	}

	public static void main(String[] args) {
		System.out.println("using java7 :-"
				+ findSum(new String[] { "10", "20", "Rajani100", "500Odisha",
						" Berhampur", "90" }));
		System.out.println("using java8 :-"
				+ findSum2(new String[] { "10", "20", "Rajani100", "500Odisha",
						" Berhampur", "90" }));
	}
}
