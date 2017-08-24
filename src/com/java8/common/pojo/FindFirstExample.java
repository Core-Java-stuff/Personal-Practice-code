package com.java8.common.pojo;

import java.util.Arrays;
import java.util.List;

public class FindFirstExample {

	public static String findFirst(String[] names) {
		List<String> nameList = Arrays.asList(names);
		/*
		 * i have to check the string who contains specific character first that
		 * i need to get
		 */
		return nameList.stream().filter(name -> name.startsWith("b"))
				.findFirst().get();

	}

	public static void main(String[] args) {
System.out.println(findFirst(new String[]{"Don","xyz","bikash","basant","Dugu"}));
	}
}
