package com.sjgm.question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArrayImplService {

	public static List<Integer> findElement(int[] array, int size, int number)
			throws IllegalAccessException {

		List<Integer> elementList = new ArrayList<>();
		int count = size / number;
		if (number == 0) {
			throw new IllegalAccessException("Number can't be 0");
		} else {
			Map<Integer, Integer> map = mapper(array);
			Set<Map.Entry<Integer, Integer>> s = map.entrySet();
			Iterator<Map.Entry<Integer, Integer>> itr = s.iterator();
			while (itr.hasNext()) {
				Map.Entry<Integer, Integer> m = itr.next();
				if (m.getValue() >= count) {
					elementList.add(m.getKey());
				}
			}
		}
		return elementList;
	}

	private static Map<Integer, Integer> mapper(int[] array) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : array) {
			if (map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
			} else {
				map.put(i, 1);
			}
		}
		return map;
	}

	public static void main(String[] args) {
		int[] arrA = { 2, 2, 4, 4, 3, 5, 3, 4, 4, 6, 4, 3, 3, 8 };
		try {
			System.out.println(findElement(arrA, 14, 3));
		} catch (IllegalAccessException e) {
			System.out.println(e.getLocalizedMessage());
			e.printStackTrace();
		}
	}
}
