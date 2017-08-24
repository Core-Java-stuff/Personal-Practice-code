package com.rcm.req.crit;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<String> l1 = new ArrayList<>();
		l1.add("a");
		l1.add("e");
		l1.add("b");
		List<String> l2 = new ArrayList<>();
		l2.add("a");
		l2.add("b");
		l2.add("m");
		System.out.println("Hello world");
		// find common element between list

		List<List<String>> l3 = new ArrayList<>();
		l3.add(l1);
		l3.add(l2);

		for (List<String> list : l3) {
			for (String s : list) {
				System.out.println(s);
			}

		}
	}

}
