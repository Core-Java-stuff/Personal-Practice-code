package com.sjgm.question;

import java.util.Arrays;

public class RemoveDuplicateFromArray {
	public static int[] removeDuplicates(int[] array) {
		// Assuming all elements in input array are unique
		int length = array.length;
		// Comparing each element with all other elements
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				// If any two elements are found equal
				if (array[i] == array[j]) {
					// Replace duplicate element with last unique element
					array[j] = array[length - 1];
					length--;
					j--;
				}
			}
		}
		int[] uniqeArray = Arrays.copyOf(array, length);
		return uniqeArray;

	}

	public static void main(String[] args) {
		// http://javaconceptoftheday.com/remove-duplicate-elements-array-java/
		System.out.println(Arrays.toString(removeDuplicates(new int[] { 4, 3,
				2, 4, 9, 2 })));
	}
}
