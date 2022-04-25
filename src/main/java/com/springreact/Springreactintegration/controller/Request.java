package com.springreact.Springreactintegration.controller;

public class Request {

	private String first;
	private String last;
	private String emailId;
	private String panNumber;
	private String gender;
	public Request() {
	}
	public Request(String first, String last, String emailId, String panNumber,String gender) {
		super();
		this.first = first;
		this.last = last;
		this.emailId = emailId;
		this.panNumber = panNumber;
		this.gender=gender;
	}
	
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
