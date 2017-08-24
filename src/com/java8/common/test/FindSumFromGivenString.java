package com.java8.common.test;

import java.util.stream.Stream;

public class FindSumFromGivenString {

	public static int getSum(String input) {
		return Stream.of(input.split("")).mapToInt(Integer::parseInt).sum();
	}

	public static void main(String[] args) {
		System.out.println("Sum of input is : " + getSum("12345"));
	}
}
