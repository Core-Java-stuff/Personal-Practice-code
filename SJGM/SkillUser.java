package com.sjgm.question;

import java.util.Arrays;

public class SkillUser {
	private String userId;
	private String name;
	private String location;
	private String[] skills;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String[] getSkills() {
		return skills;
	}

	public void setSkills(String[] skills) {
		this.skills = skills;
	}

	public SkillUser(String userId, String name, String location,
			String[] skills) {
		super();
		this.userId = userId;
		this.name = name;
		this.location = location;
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "SkillUser [userId=" + userId + ", name=" + name + ", location="
				+ location + ", skills=" + Arrays.toString(skills) + "]";
	}

}
