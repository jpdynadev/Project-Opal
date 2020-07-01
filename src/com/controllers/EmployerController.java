package com.controllers;

import java.util.ArrayList;

import com.Models.Employee;
import com.Models.Employer;

public class EmployerController {
private Employer employer;
public EmployerController(String businessName, String address){
	employer = new Employer(businessName, address);
}

public void addEmployee(Employee em){
	ArrayList<Employee> temp = this.employer.getEmployees();
	temp.add(em);
	this.employer.setEmployees(temp);
}
}
