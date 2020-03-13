package com.cts.beans;

public class Registration {
	
	public String firstName;
	public String lastname;
	public String emailId;
	public String password;
	public String phoneNumber;
	
	
	
	public Registration(String firstName, String lastname, String emailId, String password, String phoneNumber) {
		super();
		this.firstName = firstName;
		this.lastname = lastname;
		this.emailId = emailId;
		this.password = password;
		this.phoneNumber = phoneNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	

}
