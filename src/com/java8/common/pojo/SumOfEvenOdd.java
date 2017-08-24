package com.java8.common.pojo;

import java.util.ArrayList;
import java.util.List;

public class SumOfEvenOdd {
	private static List<Integer> list = null;

	static {
		list = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("EvenSum :"+list.stream().filter(i->i%2==0).mapToInt(i->i).sum());
		System.out.println("OddSum :"+list.stream().filter(i->i%2!=0).mapToInt(i->i).sum());
	}
}
