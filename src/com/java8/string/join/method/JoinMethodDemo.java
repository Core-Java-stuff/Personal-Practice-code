package com.java8.string.join.method;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author basanta.kumar.hota
 *
 */
public class JoinMethodDemo {

	/**
	 * join() method: This String method joins all strings using specified
	 * delimiter and finally returns a composed string (or say concatenated
	 * string with delimiter)
	 *
	 * public static String join(CharSequence delimiter, CharSequence...
	 * elements);
	 * 
	 * public static String join(CharSequence delimiter, Iterable<? extends
	 * CharSequence> elements);
	 * 
	 * delimiter –> this is used to separate each elements (each strings)
	 * elements –> elements which will be joined together using delimiter
	 */

	/*
	 * This method will return String with append - after each word but value is
	 * hard-coded here
	 */
	public static String joinTest1() {
		return String.join("-", "Basanta", "kumar", "hota");
	}

	/*
	 * This method will return String with append - after each word, Here value
	 * is dynamic just convert String to array then array toList
	 */
	public static String joinTest2(String input) {
		return String.join("-",
				Stream.of(input.split(" ")).collect(Collectors.toList()));
	}

	/*
	 * This method will return String with append / after each word
	 */
	public static String joinTest3() {
		List<String> list = new ArrayList<>();
		list.add("15");
		list.add("05");
		list.add("2017");
		return String.join("/", list);
	}

	/*
	 * This method will return String with append . after each word even though
	 * we added null it allow to concat
	 */
	public static String joinTest4() {
		return String.join(".", "www", "facebook", "com", null);
	}

	/* NOTE: delimiter can't be null else it will through NullPointerException */

	public static void main(String[] args) {
		System.out.println(joinTest1());
		System.out.println(joinTest2("Basanta Kumar Hota"));
		System.out.println(joinTest3());
		System.out.println(joinTest4());
	}
}
