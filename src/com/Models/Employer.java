package com.Models;

import java.util.Date;

public class Employer {
	//asdojfnalsijfnasdlkijfbnasldkjgfbasdlkjb
//	
//	
//	Attributes
	private String businessName;
//	variable for phone number of the employer
	private String phoneNumber;
	private String Address;
	private String hoursofOperation;
	private Date datesClosed;
	private String managerName;
	private int numberofEmployees;
	
	public Employer(String businessName, String phoneNumber, String Address, String hoursofOperation, Date datesClosed, String mangerName, int numberofEmployees) {
		super();
		this.businessName = businessName;
		this.phoneNumber = phoneNumber;
		this.Address = Address;
		this.hoursofOperation = hoursofOperation;
		this.datesClosed = datesClosed;
		this.managerName = managerName;
//		Getting  type mistamatch error, not sure why. 
		this.numberofEmployees = numberofEmployees;
		
	}

//	Constructor
	
//	Methods (Getter and Setter, and anything else need i.e toString method)
	

//	For easy and fast creation of constructor and methods you can right click -> source -> Constructor/Getter and setter

}
