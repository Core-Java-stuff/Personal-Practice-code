package com.sjgm.question;

public class Outer {

	public void outerMethod() {
		System.out.println("Outer class method called.");
		Inner inner = new Inner();
		inner.innerMethod();
	}

	private class Inner {
		private void innerMethod() {
			System.out.println("Inner class method called.");
		}
	}

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.outerMethod();
	}
}
