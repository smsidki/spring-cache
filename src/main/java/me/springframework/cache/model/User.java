package me.springframework.cache.model;

public class User {

	private String userName;
	private String email;
	private String password;
	private String role;
	private Identity identity;

	public String getUserName() {
		return userName;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getRole() {
		return role;
	}

	public Identity getIdentity() {
		return identity;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void setIdentity(Identity identity) {
		this.identity = identity;
	}

}
