package com.sjgm.question;

public class FourthHighestValue {

	public static void main(String[] args) {
		String input = "ab";
		StringBuffer sb = new StringBuffer();
		input = input + " ";
		int length = input.length() - 1;
		for (int i = 0; i < length; i++) {
			int flag = String.valueOf(input.charAt(i)).compareTo(
					String.valueOf(input.charAt(i + 1)));
			if (flag != -1) {
				sb.append(input.charAt(i));
			} else {
				sb.append(input.charAt(i + 1));
			}
		}
		System.out.println(sb.toString());
	}
}
