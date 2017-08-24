package com.sjgm.question;

public class PrinterTest {
	public static void main(String[] args) {
		Printer printer = new Printer();
		StudentThread1 thread1 = new StudentThread1(printer);
		thread1.start();
		StudentThread2 thread2 = new StudentThread2(printer);
		thread2.start();
	}
}
