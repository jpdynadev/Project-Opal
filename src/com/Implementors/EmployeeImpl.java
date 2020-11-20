package com.Implementors;

import java.util.ArrayList;
import java.util.Scanner;

import com.Models.Employee;

public class EmployeeImpl {
	
	private ArrayList<Employee> employeeList;
	
	//constructor
	public EmployeeImpl() {
		this.employeeList = new ArrayList<Employee>();
	}
	
	private void addEmployee(Employee e) {
		this.employeeList.add(e);
	}
	
	public ArrayList<Employee> allEmployee() {
		return this.employeeList;
	}
	public Employee retriveEmployee(String firstName, String lastName) {
		for(Employee E : this.employeeList) {
			if(E.getFirstName().equalsIgnoreCase(firstName) && E.getLastName().equalsIgnoreCase(lastName)) {
				return E;
			}
		}
		return null;
	}
	
}
