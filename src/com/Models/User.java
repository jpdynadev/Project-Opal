package com.Models;

public class User {
private String userName;
private String firstName;
private String lastname;
private String password;
private String businessName;
private String email;
private String role;
private String userID;
private Business business;
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
public String getBusinessName() {
	return businessName;
}
public void setBusinessName(String businessName) {
	this.businessName = businessName;
}

public Business getBusiness() {
	return business;
}
public void setBusiness(Business business) {
	this.business = business;
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
