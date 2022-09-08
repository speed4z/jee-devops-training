package com.training.day4;

public class User {
	String userName;
	String password;
		
	//Constructors
	public User() {}
	
	public User(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	
	//Getters and Setters
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	//toString
	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + "]";
	}
}
