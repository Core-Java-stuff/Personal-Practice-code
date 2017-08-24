package com.sjgm.question;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstLastEntryExtractor {

	static Map<String, Integer> map = new LinkedHashMap<>();
	static {
		for (int i = 65; i <= 90; i++) {
			map.put(String.valueOf((char) i), i);
		}
	}

	public static void getEntry(Map<String, Integer> map) {
		System.out.println("First Entry : " + map.entrySet().iterator().next());
		String lastKey = "";
		int lastValue = 0;
		for (Entry<String, Integer> entry : map.entrySet()) {
			lastKey = entry.getKey();
			lastValue = entry.getValue();
		}
		System.out.println("Last Entry : " + lastKey + "=" + lastValue);
	}

	public static void main(String[] args) {
		getEntry(map);
	}
}
