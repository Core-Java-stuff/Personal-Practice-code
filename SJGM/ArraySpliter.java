package com.sjgm.question;

import java.util.Arrays;
import java.util.List;

public class ArraySpliter {

	// Approach1
	public static String[] getArrayString(String[] array, String to, String from) {
		List<String> list = Arrays.asList(array);
		int startIndex = list.indexOf(to);
		int endIndex = list.indexOf(from);
		String[] newArray = new String[endIndex + 1];
		for (int i = startIndex; i <= endIndex; i++) {
			newArray[i] = list.get(i);
		}
		return newArray;
	}

	// Approach2
	public static String[] getArrayString2(String[] array, String to,
			String from) {
		String[] newArray = null;
		int count = 0;
		// Convert Array to String
		String formattedString = String.join(" ", array);
		// Substring the String (to->from)
		String actualString = formattedString.substring(
				formattedString.indexOf(to), formattedString.indexOf(from)
						+ from.length());
		// initialize an array and Iterate String and set value in array
		newArray = new String[actualString.split(" ").length];
		for (String s : actualString.split(" ")) {
			newArray[count++] = s;
		}
		return newArray;
	}

	public static void main(String[] args) {
		String arr[] = { "how", "are", "you", "doing", "in", "your", "office" };
		System.out.println(Arrays.toString(getArrayString(arr, "are", "your")));
		System.out
				.println(Arrays.toString(getArrayString2(arr, "you", "your")));

	}
}
