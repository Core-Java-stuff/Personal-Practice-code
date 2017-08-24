package com.java8.common.pojo;

import java.util.ArrayList;
import java.util.List;

public class MatchTest {
	private static List<Integer> list = null;

	static {
		list = new ArrayList<>();
		list.add(1);
		list.add(9);
		list.add(2);
		list.add(12);
		list.add(5);
	}

	public static void main(String[] args) {
		// Check given element is exist in list or not
		boolean flag = list.stream().anyMatch(i -> i == 5);
		System.out.println("is match found :" + flag);
		// List contains all elements less than 15 or not
		System.out.println("is List contains all elements less than 15 : "
				+ list.stream().allMatch(i -> i < 15));
		// List doesn't contain 10
		System.out.println("List doesn't contain 10 : "
				+ list.stream().noneMatch(i -> i == 10));
	}
}
