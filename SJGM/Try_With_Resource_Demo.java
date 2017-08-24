package com.sjgm.question;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Try_With_Resource_Demo {
	public static void main(String[] args) throws FileNotFoundException,
			IOException {
		String line = null;
		try (BufferedReader br = new BufferedReader(new FileReader(new File(
				"dummyFile.txt")))) {
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		}
	}
}
