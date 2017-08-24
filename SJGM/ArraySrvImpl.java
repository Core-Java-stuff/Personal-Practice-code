package com.sjgm.question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArraySrvImpl {
	public static List<Integer> findElement(Integer[] array, int size,
			int number) {
		List<Integer> elementList = new ArrayList<>();
		try {
			int count = size / number;
			List<Integer> list = new ArrayList<>(Arrays.asList(array));
			Set<Integer> set = new HashSet<>(list);
			for (int element : set) {
				int frequency = Collections.frequency(list, element);
				if (frequency >= count) {
					elementList.add(element);
				}
			}
		} catch (Exception e) {
			System.out.println("Error while op : " + e.getMessage());
		}
		return elementList;
	}

	public static List<Integer> findElement8(Integer[] array, int size,
			int number) {
		List<Integer> elementList = new ArrayList<>();
		try {
			Arrays.stream(array)
					.collect(
							Collectors.groupingBy(Function.identity(),
									Collectors.counting())).entrySet().stream()
					.filter(map -> map.getValue() >= (size / number))
					.forEach(map -> elementList.add(map.getKey()));
		} catch (Exception e) {
			System.out.println("Error while op : " + e.getMessage());
		}
		return elementList;
	}

	public static void main(String[] args) {

		Integer[] array = { 2, 2, 4, 4, 3, 5, 3, 4, 4, 6, 4, 3, 3, 8 };
		// System.out.println(findElement(array, 14, 3));
		System.out.println(findElement8(array, 14, 3));
	}
}
