package com.java8.common.pojo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindCommonElement {

	public static List<Integer> findCommon(Integer[] array1, Integer[] array2) {
		List<Integer> list1 = Arrays.asList(array1);
		List<Integer> list2 = Arrays.asList(array2);
		return list1.stream().filter(list2::contains)
				.collect(Collectors.toList());
	}

	public static void main(String[] args) {
		System.out.println(findCommon(new Integer[] { 11, 2, 43, 23 },
				new Integer[] { 10, 12, 2, 11 }));
	}
}
