package com.sjgm.question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentList {
	// Using java 7
	public static List<Student> getStudents(String studentData) {
		List<Student> students = new ArrayList<>();
		for (String s1 : studentData.split("\\|")) {
			String[] s2 = s1.split(",");
			students.add(new Student(s2[2], s2[0], s2[1]));
		}
		return students;
	}

	// using java 8
	public static List<Student> getStudents8(String studentData) {
		List<Student> students = new ArrayList<>();
		Arrays.stream(studentData.split("\\|"))
				.collect(Collectors.toList())
				.stream()
				.forEach(
						s -> students.add(new Student(s.split(",")[2], s
								.split(",")[0], s.split(",")[1])));
		return students;
	}

	public static void main(String[] args) {

		System.out
				.println(getStudents("name1,roll1,id1 | name2,roll2,id2 | name3,roll3,id3"));
		System.out
				.println(getStudents8("name1,roll1,id1 | name2,roll2,id2 | name3,roll3,id3"));

	}
}
