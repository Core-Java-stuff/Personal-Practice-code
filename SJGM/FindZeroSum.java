package com.sjgm.question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindZeroSum {

	public static List<int[]> find(int[] array) {
		List<int[]> combList = new ArrayList<>();
		for (int i = 0; i <= array.length - 1; i++) {
			for (int j = i + 1; j <= array.length - 1; j++) {
				if (array[i] + array[j] == 0) {
					int[] comb = { array[i], array[j] };
					combList.add(comb);
				}
			}
		}
		return combList;
	}

	public static void main(String[] args) {
		int[] array = { 1, 4, -4, 6, 8, -1, 22, 11, -6 };
		List<int[]> comb = find(array);
		for (int[] pair : comb) {
			System.out.println(Arrays.toString(pair));
		}

	}
}
