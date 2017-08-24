package com.interview.programming.questions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurance {

	// using java 7
	public static Map<String, Integer> findOccurance(String filePath)
			throws FileNotFoundException, IOException {
		Map<String, Integer> wordMap = new HashMap<>();
		String line = null;
		try (BufferedReader br = new BufferedReader(new FileReader(new File(
				filePath)));) {
			while ((line = br.readLine()) != null) {
				String[] word = line.split(" ");
				for (String s : word) {
					if (wordMap.containsKey(s)) {
						wordMap.put(s, (wordMap.get(s)) + 1);
					} else {
						wordMap.put(s, 1);
					}
				}
			}
		}
		return wordMap;
	}

	// using Java 8
	public static Map<String, Long> findOccurance2(String filePath)
			throws FileNotFoundException, IOException {
		Map<String, Long> wordMap = new HashMap<>();
		String line = null;
		try (BufferedReader br = new BufferedReader(new FileReader(new File(
				filePath)));) {
			while ((line = br.readLine()) != null) {
				wordMap = Arrays.stream(line.split(" ")).collect(
						Collectors.groupingBy(Function.identity(),
								Collectors.counting()));
			}
		}
		return wordMap;
	}

	public static void main(String[] args) {
		try {
			System.out.println(findOccurance("dummyFile.txt"));
			System.out.println(findOccurance2("dummyFile.txt"));
		} catch (IOException e) {
			System.out.println("File is not present in specified Directory");
		}
	}
}
