package com.sjgm.question;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test22 {

	public static void fileCreate(String file) throws IOException {
		File f = new File(file);
		f.createNewFile();
		System.out.println("Created.....");
	}

	public static void main(String[] args) throws IOException {

		// fileCreate("C:/Users/basanta.kumar.hota/Downloads/test/my.txt");

		String ROOT_DIR = "C:/Users/basanta.kumar.hota/test";
		Path path = Paths
				.get("C:/Users/basanta.kumar.hota/Downloads/cpwar-etq-p01/files/22/55/2503/482503/424/795327238");
		if (!Files.exists(path)) {
			try {
				Files.createDirectories(path);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}