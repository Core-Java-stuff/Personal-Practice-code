package com.rcm.req.crit;

import java.util.Arrays;

public class User {

	private String userId;
	private String name;
	private String location;
	private String[] skills;

	public User(String userId, String name, String location, String[] skills) {
		super();
		this.userId = userId;
		this.name = name;
		this.location = location;
		this.skills = skills;
	}

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

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", location="
				+ location + ", skills=" + Arrays.toString(skills) + "]";
	}

}
/*
 * Suppose i have List of user need to find List<User> who have minimum single
 * common skill , skill can be array or collection in User bean
 */