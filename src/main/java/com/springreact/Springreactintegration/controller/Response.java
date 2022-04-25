package com.springreact.Springreactintegration.controller;

public class Response {
	
	
	public Response() {
	}
	public Response(String firstName, String lastName, String country, String state) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.country = country;
		this.state = state;
	}
	private String firstName;
	private String lastName;
	private String country;
	private String state;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
}
