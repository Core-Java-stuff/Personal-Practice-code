package com.sjgm.question;

public class StudentThread2 extends Thread {
	private Printer printer;

	public StudentThread2(Printer printer) {
		super();
		this.printer = printer;
	}

	@Override
	public void run() {
		printer.printName("Sudhansu");
	}
}
