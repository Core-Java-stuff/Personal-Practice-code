package com.sjgm.question;

public class VarArgDemo {
	public static void main(String[] args) {
		new VarArgDemo().go("hi");
		new VarArgDemo().go("hi", "hello");
	}

	public void go(String... y) {
		System.out.println(y[y.length - 1] + "");
	}
}
