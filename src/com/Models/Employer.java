package com.Models;

import java.util.ArrayList;

public class Employer {
private String businessName;
private String address;
private ArrayList<Employee> employees;
public Employer(String businessName, String address) {
	super();
	this.businessName = businessName;
	this.address = address;
	this.employees = new ArrayList<Employee>();
}
public Employer(String businessName, String address, ArrayList<Employee> em) {
	super();
	this.businessName = businessName;
	this.address = address;
	this.employees = em;
}
public String getBusinessName() {
	return businessName;
}
public void setBusinessName(String businessName) {
	this.businessName = businessName;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public ArrayList<Employee> getEmployees() {
	return employees;
}
public void setEmployees(ArrayList<Employee> employees) {
	this.employees = employees;
}



}
