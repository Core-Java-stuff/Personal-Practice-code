package com.sjgm.question;

import java.util.Arrays;

public class SumOfIntegerFromArray {

	public static int findSum(String[] input) {
		int sum = 0;
		for (String s : input) {
			if (!s.matches(".*[a-z].*")) {
				sum += Integer.valueOf(s);
			}
		}
		return sum;
	}

	// Using Java8
	public static int findSum2(String[] input) {
		return Arrays.stream(input).filter(s -> !s.matches(".*[a-z].*"))
				.mapToInt(i -> Integer.valueOf(i)).sum();
	}

	public static void main(String[] args) {
		System.out.println(findSum(new String[] { "10", "20", "Basant" }));
		System.out.println(findSum2(new String[] { "10", "20", "Basant" }));
	}
}
