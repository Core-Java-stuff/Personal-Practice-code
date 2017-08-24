package com.ravsoft.questions;

/**
 * 4.Reverse each word and display in table format.Retain the capital letter as
 * it is. 5.List the palindromes in a separately.
 * 
 *
 */
public class MakeTable {

	public static int make(String s) {
		int count = 0;
		System.out
				.println("No                   Word                  Reverse                isPalindrome");
		System.out
				.println("----------------------------------------------------------------------------------------");
		for (String w : s.split(" ")) {
			count++;
			System.out.println(count + "                    " + w
					+ "                     " + reverse(w)
					+ "                        " + isPalindrome(w));
		}
		return count;
	}

	private static String reverse(String s) {
		return new StringBuilder(s).reverse().toString();
	}

	private static boolean isPalindrome(String s) {
		return s.equalsIgnoreCase(reverse(s)) ? true : false;
	}

	public static void main(String[] args) {
		String s = "You did it Happy to see you here Oh my god";
		System.out.println("\nTotal Number of Word :" + make(s));

	}
}
