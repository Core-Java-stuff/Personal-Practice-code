package com.java8.stream.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {

	private static List<Integer> list = null;

	static {
		list = new ArrayList<>();
		for (int i = 1; i <= 20; i++) {
			list.add(i);
		}
	}

	/* Internal Iteration */
	/*
	 * suppose i have a List<Integer> i want find sum of all int which above 10
	 * so we will see here how to do using java 7 and and java 8 as well
	 */

	public static int findSumInJava7() {
		int sum = 0;
		for (int i : list) {
			if (i > 10) {
				sum += i;
			}
		}
		return sum;
	}

	public static int findSumInJava8() {
		// Print number which are higher than 10
		List<Integer> lists = list.stream().filter(i -> i > 10)
				.collect(Collectors.toList());
		System.out.println(lists + ",");
		// Return sum of Numbers
		return list.stream().filter(i -> i > 10).mapToInt(i -> i).sum();
	}

	public static void findSumInJava8SecondApproach() {
		System.out.println(list.stream().filter(i -> i > 10).reduce((i, j) -> {
			return i + j;
		}).get());
	}

	public static void findMultipication() {
		int mul = 0;
		List<Integer> lists = Arrays.asList(new Integer[] { 1, 2, 3, 4, 5 });
		mul = lists.stream().reduce((i, j) -> {
			return i * j;
		}).get();
		System.out.println("Multipication :" + mul);
	}

	public static void main(String[] args) {
		System.out.println("Sum using Java7 :" + findSumInJava7());
		System.out.println("Sum using Java8 :" + findSumInJava8());
		findSumInJava8SecondApproach();
		findMultipication();
	}
}
