package com.java8.collection.mapper;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertArrayToList {

	public static List<String> convert1(String[] input) {
		return Stream.of(input).collect(Collectors.toList());
	}

	public static List<String> convert2(String[] input) {
		return Arrays.stream(input).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		String[] input = new String[] { "IBM", "Microsoft", "Accenture",
				"Oracle", "Hewlett Packard", "SAP", " TCS" };
		System.out.println(convert1(input));
		System.out.println(convert2(input));
	}

}
