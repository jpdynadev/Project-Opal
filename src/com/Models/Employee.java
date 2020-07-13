package com.Models;

import java.util.Date;

public class Employee {

//	Attributes
	private String firstName;
	private String lastName;
	private Date DoB;
	private int Employee_ID;
	private String userID;
	//	Employee: Full-time, Part-time, forloughed, laid-off 
	private String Employee_status;

	public Employee(String firstName, String lastName, Date doB, int employee_ID, String employee_status) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.DoB = doB;
		this.Employee_ID = employee_ID;
		this.Employee_status = employee_status;
	}
	
	public Employee(String firstName, String lastName, Date doB, String employee_status) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.DoB = doB;
		this.Employee_status = employee_status;
	}
	
	public Employee(String firstName, String lastName, Date doB) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.DoB = doB;
	}
     
	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Employee() {
		super();
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDoB() {
		return DoB;
	}

	public void setDoB(Date doB) {
		DoB = doB;
	}

	public int getEmployee_ID() {
		return Employee_ID;
	}

	public void setEmployee_ID(int employee_ID) {
		Employee_ID = employee_ID;
	}

	public String getEmployee_status() {
		return Employee_status;
	}

	public void setEmployee_status(String employee_status) {
		Employee_status = employee_status;
	}

	@Override
	public String toString() {
		return  firstName + " " + lastName;
	}
	
	
}


//Object
/*
*
*		Class name
*			Parameters/Attributes
*
*			Constructor (Not necessary)
*
*				Method() usually called the same name as the class	
*
*				Initializes the object with required data		
*
*			Methods
*
*/