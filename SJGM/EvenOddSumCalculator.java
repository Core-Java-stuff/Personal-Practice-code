package com.sjgm.question;

import java.util.ArrayList;
import java.util.List;

public class EvenOddSumCalculator {

	private static List<Integer> list = new ArrayList<>();
	static {
		// Add 1 to 100 into List
		for (int i = 1; i <= 100; i++) {
			list.add(i);
		}
	}

	// using java 7
	public static int findSum(String type) {
		List<Integer> evenList = new ArrayList<>();
		List<Integer> oddList = new ArrayList<>();
		for (int i : list) {
			if (i % 2 == 0) {
				evenList.add(i);
			} else {
				oddList.add(i);
			}
		}
		return type.equals("even") ? sum(evenList) : sum(oddList);
	}

	private static int sum(List<Integer> list) {
		int sum = 0;
		for (int i : list) {
			sum += i;
		}
		return sum;

	}

	// Using java 8
	public static int findSumU2(String type) {
		return type.equals("even") ? list.stream().filter(i -> i % 2 == 0)
				.mapToInt(i -> i).sum() : list.stream()
				.filter(i -> !((i % 2) == 0)).mapToInt(i -> i).sum();
	}

	public static void main(String[] args) {
		System.out.println(findSum("odd"));
		System.out.println(findSumU2("even"));
	}
}
