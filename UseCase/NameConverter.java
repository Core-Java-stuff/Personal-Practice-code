package com.rcm.req.crit;

import java.text.SimpleDateFormat;
import java.util.Date;

public class NameConverter {
	// dipti_12_psr_10122016
	public static String convertFormat(String input) {
		String prefix = "";
		String date = new SimpleDateFormat("ddMMYYYY").format(new Date());
		if (input.contains("_")) {
			prefix = input.substring(0, input.lastIndexOf("_"));
		} else {
			prefix = input.replaceAll("[^a-z]", "");
		}
		return prefix + "" + date;
	}

	public static String convertFormat2(String input) {
		String date = new SimpleDateFormat("ddMMYYYY").format(new Date());
		return input.contains("_") ? input.substring(0, input.lastIndexOf("_"))
				+ "" + date : input.replaceAll("[^a-z]", "") + "" + date;

	}

	public static void main(String[] args) {
		System.out.println(convertFormat2("dipti_12_psr_10122016"));
		System.out.println(convertFormat2("dipti20122016"));
	}
}
