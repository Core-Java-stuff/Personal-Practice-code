package com.sjgm.question;

import java.util.Arrays;
import java.util.stream.Collectors;

public class InputFormatter {

	public static String formattString(String input) {
		StringBuffer sb = new StringBuffer();
		for (String s : input.split("")) {
			sb.append(s).append(",");
		}
		return sb.toString().substring(0, sb.length() - 1);
	}

	public static String formatString(String input) {
		return String.join(",",
				Arrays.stream(input.split("")).collect(Collectors.toList()));
	}

	public static void main(String[] args) {
		System.out.println("Using Java7 : " + formattString("12345"));
		System.out.println("Using Java8 : " + formatString("12345"));
	}
}
