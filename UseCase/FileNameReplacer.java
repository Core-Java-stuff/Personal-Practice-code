package com.rcm.req.crit;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileNameReplacer {

	public static String replacer(String fileName) {
		return fileName.replaceAll("[^a-z]", "") + ""
				+ new SimpleDateFormat("ddMMYYYY").format(new Date());
	}

	public static String renameFile(String directory) {
		String[] files = new File(directory).list();
		for (String oldFileName : files) {
			System.out.println(oldFileName);
			String fileName = oldFileName.split("[.]")[0];
			Path source = Paths.get(directory + "/" + oldFileName);
			try {
				Files.move(
						source,
						source.resolveSibling(replacer(fileName) + "."
								+ oldFileName.split("[.]")[1]));
			} catch (IOException e) {
				System.out.println("Unable to Rename");
			}
		}
		return "All file from path :" + directory + " Renamed successfully";

	}

	public static void main(String[] args) {
		/*System.out
				.println(renameFile("C:/Users/basanta.kumar.hota/Desktop/dummy"));
*/
		
		System.out.println(replacer("dipti_12_psr_10122016"));
	}
}
