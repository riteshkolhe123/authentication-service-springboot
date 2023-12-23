package org.dnyanyog.dto;

public class AddUserRequest {
	
	private String action;
	private String User_id;
	private String User_name;
	private String User_email;
	private String user_age;
	
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getUser_name() {
		return User_name;
	}
	public void setUser_name(String user_name) {
		User_name = user_name;
	}
	public String getUser_id() {
		return User_id;
	}
	public void setUser_id(String user_id) {
		User_id = user_id;
	}
	public String getUser_email() {
		return User_email;
	}
	public void setUser_email(String user_email) {
		User_email = user_email;
	}
	public String getUser_age() {
		return user_age;
	}
	public void setUser_age(String user_age) {
		this.user_age = user_age;
	}

}
