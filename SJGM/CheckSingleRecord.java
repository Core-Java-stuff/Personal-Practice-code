package com.sjgm.question;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CheckSingleRecord {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(12);
		list1.add(10);
		list1.add(11);
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		list2.add(17);
		list2.add(20);
		list2.add(31);
		List<Integer> list3 = new ArrayList<Integer>();
		list3.add(1);
		list3.add(97);
		list3.add(23);
		list3.add(39);

		/*
		 * list1.stream().filter(list2::contains).filter(list3::contains)
		 * .forEach(i -> System.out.println(i));
		 */

		getUnique(567);

	}

	public static void getUnique(int id) {
		System.out.println("called");
		// TABLE-1
		List<Employee> e1 = new ArrayList<>();
		e1.add(new Employee(567, "user"));
		e1.add(new Employee(567, "user"));
		e1.add(new Employee(346, "user"));
		e1.add(new Employee(597, "Admin"));
		// TABLE-2
		List<Employee> e2 = new ArrayList<>();
		e2.add(new Employee(567, "user"));
		e2.add(new Employee(829, "user"));
		e2.add(new Employee(283, "uswdber"));
		e2.add(new Employee(676, "Admin"));
		// TABLE-3
		List<Employee> e3 = new ArrayList<>();
		e3.add(new Employee(567, "user"));
		e3.add(new Employee(253, "user"));
		e3.add(new Employee(636, "user"));
		e3.add(new Employee(363, "Admin"));

		/*e1.stream().filter(e -> e.getId() == id).filter(e2::contains)
				.filter(e3::contains).collect(Collectors.toList())
				.forEach(e -> System.out.println(e));*/

		Map<Employee, Long> counts = e1.stream().filter(e -> e.getId() == id)
				.collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		System.out.println(counts);
		/*counts.entrySet().stream().filter(e -> e.getKey().getId() == id)
				.filter(e -> counts.get(e) == 1).forEach(System.out::println);*/

	}
}
