package com.sjgm.question;

public class StudentThread1 extends Thread {
	private Printer printer;

	public StudentThread1(Printer printer) {
		super();
		this.printer = printer;
	}

	@Override
	public void run() {
		printer.printName("Basanta");
	}

}
