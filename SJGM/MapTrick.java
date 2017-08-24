package com.sjgm.question;

import java.util.HashMap;
import java.util.Map;

public class MapTrick {
	static Map<Employee, String> company = new HashMap<>();

	static {
		company.put(new Employee(12, "Saroj"), "IBM");
		company.put(new Employee(34, "Animesh"), "Microsoft");
		company.put(new Employee(48, "Basant"), "Accenture");
		company.put(new Employee(12, "Ravindra"), "Oracle");
		company.put(new Employee(88, "Santosh"), "Hewlett Packard");
		company.put(new Employee(27, "Deepak"), "SAP");
		company.put(new Employee(18, "Amit"), "TCS");
	}

	public static void findCompanyById7(int id) {
		for (Employee e : company.keySet()) {
			if (e.getId() == id) {
				System.out.println(company.get(e));
			}
		}
	}

	public static void findCompanyById8(int id) {
		// Java 8 approach 1
		company.keySet().stream().filter(key -> key.getId() == id)
				.forEach(key -> System.out.println(company.get(key)));
		// Java 8 approach 2
		company.entrySet().stream().filter(e -> e.getKey().getId() == id)
				.forEach(e -> System.out.println(e.getValue()));
	}

	public static void main(String[] args) {
		findCompanyById7(18);
		findCompanyById8(27);
	}
}
