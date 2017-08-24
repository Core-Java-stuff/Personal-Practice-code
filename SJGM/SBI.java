package com.sjgm.question;

import java.lang.reflect.Method;

public class SBI {

	public void moneyTransfer() {
		try {
			System.out.println("Processing money Transfer......");
			Transaction tx = new Transaction();
			Method method = Transaction.class
					.getDeclaredMethod("doTransaction");
			method.setAccessible(true);
			method.invoke(tx);
		} catch (Exception e) {
			System.out.println("API Calling Failed..");
		}
	}

	public static void main(String[] args) {
		SBI sbi = new SBI();
		sbi.moneyTransfer();
	}
}
