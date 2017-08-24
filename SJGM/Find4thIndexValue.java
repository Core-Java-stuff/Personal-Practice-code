package com.sjgm.question;

public class Find4thIndexValue {

	public static char getValue(Object obj) throws IllegalAccessException {
		String result = String.valueOf(obj);
		if (result.length() >= 4) {
			return String.valueOf(obj).charAt(4);
		} else {
			throw new IllegalAccessException(
					"Length of input should not be less than 4");
		}
	}

	public static void main(String[] args) throws IllegalAccessException {
		System.out.println(getValue("basanta"));
		System.out.println(getValue(43676555));
	}
}
