package com.Models;

public class Role {
private Object role;

public Role(String role, User user, Business b) {
	super();
	if(role.equalsIgnoreCase("Employer")) {
		this.setRole(new Employer(user.getBusinessName(), b.getAddress()));
	}else if(role.equalsIgnoreCase("Employee")) {
		this.setRole(new Employee());
	}
}

	public Object getRole() {
		return role;
	}

	public void setRole(Object role) {
		this.role = role;
	}

}
