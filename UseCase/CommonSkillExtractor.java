package com.rcm.req.crit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CommonSkillExtractor {
	static List<User> users = new ArrayList<>();

	static {
		users.add(new User("user1098", "Basanta", "bangalore", new String[] {
				"java", "UI" }));
		users.add(new User("user4634", "Dipak", "Odisha",
				new String[] { "SAP" }));
		users.add(new User("useru7646", "Sahanee", "bangalore",
				new String[] { "SFDC" }));
		users.add(new User("user4869", "Vivek", "bangalore",
				new String[] { "UI" }));
		users.add(new User("user9087", "Asiq", "Hyderabad",
				new String[] { "UI" }));
	}

	public static List<User> getCommonSkillUsers() {
		List<String> skills = new ArrayList<String>();
		users.stream().forEach(
				user -> Arrays.stream(user.getSkills()).forEach(
						s -> skills.add(s)));
		String commonSkill = skills
				.stream()
				.collect(
						Collectors.groupingBy(Function.identity(),
								Collectors.counting()))
				.entrySet()
				.stream()
				.max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1
						: -1).get().getKey();
		return users
				.stream()
				.filter(user -> Arrays.asList(user.getSkills()).contains(
						commonSkill)).collect(Collectors.toList());

	}

	public static void main(String[] args) {
		System.out.println(getCommonSkillUsers());
	}
}
