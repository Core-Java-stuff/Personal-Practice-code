package com.sjgm.question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class CommonSkillExtractor {

	private static List<SkillUser> skillUsers = new ArrayList<>();
	static {
		skillUsers.add(new SkillUser("user1", "basant", "bangalore",
				new String[] { "java", "ui" }));
		skillUsers.add(new SkillUser("user2", "vivek", "bangalore",
				new String[] { "ui", ".Net" }));
		skillUsers.add(new SkillUser("user3", "Bikash", "Odisha", new String[] {
				".Net", "php" }));
		skillUsers.add(new SkillUser("user4", "partha", "Ap",
				new String[] { "ui" }));
	}

	/* First find MaxOccures Skill in user list */
	public static List<String> findMaxOccuresSkills() {
		Map<String, Integer> skillMap = new HashMap<>();
		List<String> maxOccureSkill = new ArrayList<>();
		for (SkillUser user : skillUsers) {
			for (String skill : user.getSkills()) {
				if (skillMap.containsKey(skill)) {
					skillMap.put(skill, skillMap.get(skill) + 1);
				} else {
					skillMap.put(skill, 1);
				}
			}
		}
		int maxValueInMap = (Collections.max(skillMap.values()));
		for (Entry<String, Integer> entry : skillMap.entrySet()) {
			if (entry.getValue() == maxValueInMap) {
				maxOccureSkill.add(entry.getKey());
			}
		}
		return maxOccureSkill;
	}

	/* Check which Skill array contains this MaxOccures skill */
	public static List<SkillUser> getCommonSkillUser() {
		List<SkillUser> users = new ArrayList<SkillUser>();
		for (SkillUser user : skillUsers) {
			for (String commonSkill : findMaxOccuresSkills()) {
				if (Arrays.asList(user.getSkills()).contains(commonSkill)) {
					users.add(user);
				}
			}
		}
		return users;
	}

	public static void main(String[] args) {
		System.out.println(getCommonSkillUser());
	}
}
