package com.sjgm.question;

public class Printer {

	public synchronized void printName(String name) {
		try {
			System.out.println("Name is : " + name);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e.getLocalizedMessage());
		}
	}
}
