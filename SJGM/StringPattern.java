package com.sjgm.question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringPattern {

	public static List<String> findSubString(String data) {
		List<String> dataList = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		for (char c : data.toUpperCase().toCharArray()) {
			sb.append(c).append(getAlpha(c));
		}
		String str = sb.toString();
		for (int i = 1; i <= str.length(); i++) {
			for (int j = 0; j < str.length(); j++) {
				if ((j + i) > str.length()) {
					break;
				}
				dataList.add(str.substring(j, j + i));
			}
		}
		return dataList;
	}

	private static int getAlpha(char c) {
		int count = 0;
		Map<Character, Integer> alphaMap = new HashMap<>();
		for (int i = 65; i <= 90; i++) {
			count++;
			alphaMap.put((char) i, count);
		}
		return alphaMap.get(c);
	}

	public static void main(String[] args) {
		System.out.println(findSubString("ABCD"));

	}

}
