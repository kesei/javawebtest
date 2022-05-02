package com.example.yikeerp.entity.UserManagementEntity;

public class User {
	private String username;
	private String password;
	private String Eno;
	private String title;

	public User() {
	}

	public User(String username, String password, String eno, String title) {
		this.username = username;
		this.password = password;
		Eno = eno;
		this.title = title;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEno() {
		return Eno;
	}

	public void setEno(String eno) {
		Eno = eno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "User{" +
				"username='" + username + '\'' +
				", password='" + password + '\'' +
				", Eno='" + Eno + '\'' +
				", title='" + title + '\'' +
				'}';
	}

}
