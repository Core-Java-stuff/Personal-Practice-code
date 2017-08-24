package com.mindtree.test;

import java.util.ArrayList;

public class List extends ArrayList<Employee> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public boolean add(Employee e) {
		return this.contains(e) ? false : super.add(e);
	}

	public static void main(String[] args) {

		List list = new List();
		list.add(new Employee(111, "Basanta", "sw", "1234567890"));
		list.add(new Employee(567, "Lokesh", "IT", "9999999999"));
		list.add(new Employee(111, "Basanta", "sw", "1234567890"));
		list.add(new Employee(567, "Lokesh", "IT", "9999999999"));
		System.out.println(list);
	}
}
