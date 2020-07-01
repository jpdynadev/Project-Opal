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
	
	public Employer(String businessName, String phoneNumber, String Address) {
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
	public void setbusinessName(String businessName) {
		this.businessName = businessName;
	}
	public String getbusinessName() {
		return businessName;	
	}
	
	public void setphoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getphoneNumber() {
		return phoneNumber;
	}
	
	public void setAddress(String Address) {
		this.Address = Address;
	}
	
	public String getAddress() {
		return Address;	
	}
	
	public void sethoursofOperation(String hoursofOperation) {
		this.hoursofOperation = hoursofOperation;
	}
	
	public String gethoursofOperation() {
		return this.hoursofOperation;
	}
	
	public void setdatesClosed(Date datesClosed) {
		this.datesClosed = datesClosed;
	}
	
	public Date getdatesClosed() {
		return datesClosed;
	}
	
	public void setmanagerName(String managerName) {
		this.managerName = managerName;
	}
	
	public String getmanagerName() {
		return managerName;
	}
	
	public void setnumberofEmployees(int numberofEmployees) {
		this.numberofEmployees = numberofEmployees;
	}
	
	public int getnumberofEmployees() {
		return numberofEmployees;
	}


//	Constructor
	
//	Methods (Getter and Setter, and anything else need i.e toString method)
	
//	Finished getter and setter methods for employer object. Only user source as a final solutioon if stuck.

//	For easy and fast creation of constructor and methods you can right click -> source -> Constructor/Getter and setter

}
