package com.Models;

public class User {
private String userName;
private String password;
private String email;
private String role;
private String userID;
public User(String userName, String password, String email) {
	super();
	this.userName = userName;
	this.password = password;
	this.email = email;
}
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public String getUserID() {
	return userID;
}
public void setUserID(String userID) {
	this.userID = userID;
}
@Override
public String toString() {
	return "User [userName=" + userName + ", password=" + password + ", email=" + email + ", role=" + role + ", userID="
			+ userID + "]";
}
public boolean equals(User u){
	if(this.email.equalsIgnoreCase(u.getEmail()) && this.userID.equalsIgnoreCase(u.getUserID())) {
		return true;
	}else {
		return false;
	}
}
}
