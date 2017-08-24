package com.java8.common.pojo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortList {
	private static List<Integer> list = null;

	static {
		list = new ArrayList<>();
		list.add(1);
		list.add(9);
		list.add(2);
		list.add(12);
		list.add(5);
	}

	public static List<Integer> getSortedList(String sortType) {
		List<Integer> sortedList = null;
		switch (sortType) {
		case "Ascending":
			sortedList = list.stream().sorted().collect(Collectors.toList());
			break;
		case "Descending":
			sortedList = list.stream().sorted(Comparator.reverseOrder())
					.collect(Collectors.toList());
			break;
		default:
			sortedList = list;
		}
		return sortedList;
	}

	public static void main(String[] args) {
		System.out.println("Default Structrue :"+getSortedList(""));
		System.out.println("Ascending sort : " + getSortedList("Ascending"));
		System.out.println("Descending sort : " + getSortedList("Descending"));

	}
}
