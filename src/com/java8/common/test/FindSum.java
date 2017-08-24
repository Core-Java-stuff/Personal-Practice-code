package com.java8.common.test;

import java.util.stream.Stream;

public class FindSum {
	public static void find(String no) {
		String strNo = "";
		int sum = 0;
		for (int i = 0; i <= no.length() - 1; i++) {
			strNo = no.substring(i);
			sum += calculateSum(strNo);
			System.out.print("(" + strNo + ")" + "+");
		}
		System.out.println("=" + sum);
	}

	public static int calculateSum(String no) {
		int sum = 0;
		for (int i = 0; i <= no.length() - 1; i++) {
			sum += Integer.parseInt(String.valueOf(no.charAt(i)));
		}
		return sum;
	}

	// Using Java 8 in single method
	public static int getSum(String input) {
		int sum = 0;
		for (int i = 0; i <= input.length() - 1; i++) {
			sum += Stream.of(input.substring(i).split(""))
					.mapToInt(Integer::parseInt).sum();
		}
		return sum;
	}

	public static void main(String[] args) {
		find("582109");

	}
}
