package com.rcm.req.crit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WorkSkillService {

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

	// get the users who have common skill

	public static List<User> getCommonSkillUsers(List<User> allUsers) {
		List<User> sameSkilledUsers = new ArrayList<>();
		for (User user : allUsers) {
			if (Arrays.asList(user.getSkills()).contains(getCommonSkill())) {
				sameSkilledUsers.add(user);
			}
		}
		return sameSkilledUsers;
	}

	// it will return which is common skills
	private static String getCommonSkill() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (User user : users) {
			String[] skillSets = user.getSkills();
			for (String skill : skillSets) {
				if (map.containsKey(skill)) {
					map.put(skill, map.get(skill) + 1);
				} else {
					map.put(skill, 1);
				}
			}
		}
		String mostCommonSkill = null;
		int count = -1;
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() > count) {
				mostCommonSkill = entry.getKey();
				count = entry.getValue();
			}
		}
		return mostCommonSkill;
	}

	public static void main(String[] args) {
		System.out.println(getCommonSkillUsers(users));
	}

}
