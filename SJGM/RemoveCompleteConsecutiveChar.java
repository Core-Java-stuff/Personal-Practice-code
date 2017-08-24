package com.sjgm.question;

public class RemoveCompleteConsecutiveChar {

	public static String remove(String input) {
		for (int i = 0; i <= input.length() - 1; i++) {
			if (isDuplicate(input, input.charAt(i))) {
				input = input.replace(String.valueOf(input.charAt(i)), "");
			}
		}
		return input;
	}

	private static boolean isDuplicate(String s, char ch) {
		int count = 0;
		for (char ch1 : s.toCharArray()) {
			if (ch1 == ch) {
				count++;
			}
		}
		return count > 1 ? true : false;
	}

	public static void main(String[] args) {
		System.out.println(remove("abbbbbbccccccccceppppqr"));
	}
}
