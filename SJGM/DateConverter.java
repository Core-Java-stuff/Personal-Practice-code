package com.sjgm.question;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter {

	private static String formatDate(String input) {
		return new StringBuffer().append(input.substring(0, 4)).append("-")
				.append(input.substring(4, 6)).append("-")
				.append(input.substring(6, input.length())).toString();

	}

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(formatDate("20170206"));
		Date date = sdf.parse(formatDate("20170206"));
		
		System.out.println("SQL :"+new java.sql.Date(date.getTime()));
		
		
		System.out.println(date);
	}
}
