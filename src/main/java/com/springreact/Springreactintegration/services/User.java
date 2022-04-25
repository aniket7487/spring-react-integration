package com.springreact.Springreactintegration.services;

public class User {

	private String id;
	private String email;
	private String fullName;
	private String role;
	private String isEnabled;
	
	
	public User(String id, String email, String fullName, String role, String isEnabled) {
		super();
		this.id = id;
		this.email = email;
		this.fullName = fullName;
		this.role = role;
		this.isEnabled = isEnabled;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getIsEnabled() {
		return isEnabled;
	}
	public void setIsEnabled(String isEnabled) {
		this.isEnabled = isEnabled;
	}
	
	
}
