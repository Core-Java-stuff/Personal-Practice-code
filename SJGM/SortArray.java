package com.sjgm.question;

import java.util.Arrays;

public class SortArray {
	public static int[] sort(int[] input) {
		int[] output = new int[input.length];
		int temp = 0;
		for (int i = 0; i <= input.length - 1; i++) {
			for (int j = i + 1; j <= input.length - 1; j++) {
				if (input[i] >= input[j]) {
					temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
			}
			output[i] = input[i];
		}
		return output;
	}

	public static void main(String[] args) {
		int[] input = { 5, 2, 3, 1, 6, 4 };
		System.out.println(Arrays.toString(sort(input)));

	}
}
