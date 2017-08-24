package com.sjgm.question;

public class RemoveConsecutiveChar {

	public static String remove(String input) {
		input = input + " ";
		int length = input.length() - 1;
		String result = "";
		for (int i = 0; i < length; i++) {
			if (input.charAt(i) != input.charAt(i + 1)) {
				result += input.charAt(i);
			}
		}
		return result;
	}

	// using regular expression
	public static String remove2(String input) {
		return input.replaceAll("(.)\\1{1,}", "$1");
	}

	public static void main(String[] args) {
		System.out.println(remove("abbc"));
		System.out.println(remove2("abbbbccccddddeeeeeeebbbb"));
	}
}
