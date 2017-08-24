package com.sjgm.question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class EmpDupRemove {

	public static List<String> getNames(List<Emp> emps) {
		List<String> names = new ArrayList<>();
		for (Emp e : emps) {
			names.add(e.getName());
		}
		return names;
	}

	public static List<Emp> removeDuplicate(List<Emp> emps) {
		List<String> names = getNames(emps);
		Set<String> set = new HashSet<>(names);
		for (String s : set) {
			int count = Collections.frequency(names, s);
			for (Emp e1 : emps) {
				if (count > 1) {
					if (e1.getName().equals(s)) {
						emps.remove(e1);
					}
				}
			}
		}
		return emps;
	}

	public static void main(String[] args) {
		List<Emp> emps = new CopyOnWriteArrayList<>();
		emps.add(new Emp(1, "basanta"));
		emps.add(new Emp(2, "rabindra"));
		emps.add(new Emp(4, "vineet"));
		emps.add(new Emp(11, "basanta"));
		System.out.println(removeDuplicate(emps));

	}
}
