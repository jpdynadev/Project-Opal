package com.controllers;

import java.util.ArrayList;

import com.Models.User;

public class UserController {

	private ArrayList<User> userList;
	
	public UserController() {
		this.userList = new ArrayList<User>();
	}

	public User getUser(String email) {
		for(User u : userList) {
			if(u.getEmail().equalsIgnoreCase(email)) {
				return u;
			}
		}
		return null;
	}
	public User getUser(User user) {
		for(User u : userList) {
			if(user.equals(user)) {
				return u;
			}
		}
		return null;
	}
	
	public boolean createUser(String username, String email, String password) {
		try {
			User temp = new User(username, password, email);
			this.userList.add(temp);
			return true;
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
			return false;
		}
	}
	
	public boolean deleteUser(User u) {
		try {
			for(User user: this.userList) {
				if(user.equals(u)) {
					this.userList.remove(user);
					return true;
				}
			}
			System.out.println("Failed to delete user : " + u.toString());
			return false;
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
			return false;
		}
	}
}
