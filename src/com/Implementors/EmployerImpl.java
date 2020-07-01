package com.Implementors;

import java.util.ArrayList;
import java.util.Scanner;

import com.Models.Employer;

public class EmployerImpl {
	
	private ArrayList employerList;
	
	public EmployerImpl() {
		this.employerList = new ArrayList<Employer>();
	}
	
	public static void main(String[] args) {
		Employerlmpl();
		Scanner sc = new Scanner(System.in);
		boolean sessionActive = true;
		while(sessionActive) {
			System.out.println("Please enter the name of your business");
			String businessName = sc.next();
			System.out.println("Please enter the phone number of your business");
			String phoneNumber = sc.next();
			System.out.println("Please enter the address of your business");
			String Address = sc.next();
			Employer temp = new Employer(businessName, phoneNumber, Address);
			em.addEmployer(temp);
			
		}
	}
//	a list data structure to store employers
	
//	create public constructor for the impl object
	
//	main method
	
//	methods needed to create employer 
	
//	methods needed to delete emploeyer
	

}

POJO
private static void Employerlmpl() {
		// TODO Auto-generated method stub
		
	}
Controllers using pojo