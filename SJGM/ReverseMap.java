package com.sjgm.question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ReverseMap {

	public static Map<String, Integer> reverse1(Map<String, Integer> initMap) {
		Map<String, Integer> reverseMap = new LinkedHashMap<String, Integer>();
		List<String> keySet = new ArrayList<String>(initMap.keySet());
		Collections.reverse(keySet);
		for (String key : keySet) {
			reverseMap.put(key, initMap.get(key));
		}
		return reverseMap;

	}

	public static Map<String, Integer> reverse2(Map<String, Integer> initMap) {
		Map<String, Integer> reverseMap = new LinkedHashMap<String, Integer>();
		List<String> keySet = new ArrayList<String>(initMap.keySet());
		for (int i = keySet.size() - 1; i >= 0; i--) {
			reverseMap.put(keySet.get(i), initMap.get(keySet.get(i)));
		}
		return reverseMap;

	}

	public static void main(String[] args) {
		Map<String, Integer> initMap = new LinkedHashMap<>();
		for (int i = 65; i <= 90; i++) {
			initMap.put(String.valueOf((char) i), i);
		}
		System.out.println("Before Reverse :" + initMap);
		System.out.println("After Reverse: " + reverse1(initMap));
		System.out.println("After Reverse: " + reverse2(initMap));
	}
}
