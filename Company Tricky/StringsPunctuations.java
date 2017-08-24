package com.ravsoft.questions;

/**
 * 2.Exclude numerical strings and punctuations.
 */
public class StringsPunctuations {

	public static String removeNumeric(String data) {
		return data.replaceAll("[^a-zA-Z]", "");
	}

	public static void main(String[] args) {
		System.out.println(removeNumeric("DA2ta45"));
	}
}
