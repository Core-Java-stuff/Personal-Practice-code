package com.sjgm.question;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EmpDuplicateRemove {

	public static void main(String[] args) {
		List<Emp> emps = new ArrayList<>();
		emps.add(new Emp(1, "basanta"));
		emps.add(new Emp(2, "rabindra"));
		emps.add(new Emp(4, "vineet"));
		emps.add(new Emp(11, "basanta"));

		Set<Emp> s = new HashSet<>();
		for (Emp e : emps) {
			s.add(e);
		}
		System.out.println(s);
	}
}
