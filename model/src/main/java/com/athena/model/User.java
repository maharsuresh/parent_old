package com.athena.model;

public class User {
	private int userId;
	private String uname;
	
	
	public User(int userId, String uname) {
		super();
		this.userId = userId;
		this.uname = uname;
	}
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	
	

}
