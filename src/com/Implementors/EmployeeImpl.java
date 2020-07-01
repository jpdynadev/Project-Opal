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

//	public static void main(String[] args) {
//		EmployeeImpl em = new EmployeeImpl();
//		Scanner sc = new Scanner(System.in);
//		boolean sessionActive = true;
//		while(sessionActive) {
//			System.out.println("Please enter a first name for your employee");
//			String firstname = sc.next();
//			System.out.println("Please enter a last name for your employee");
//			String lastname = sc.next();
//			Employee temp = new Employee(firstname, lastname);
//			em.addEmployee(temp);
//			System.out.println("These are the employees so far");
//			em.allEmployee();
//			System.out.println("Would you like to continue? Y or N");
//			String ans = sc.next();
//			while(!em.validateAns(ans)) {
//				System.out.println("Please enter valid answer");
//				ans = sc.next();
//			}
//			while(em.validateAns(ans)) {
//				if(ans.equalsIgnoreCase("Y")) {
//					break;
//				}else {
//					sessionActive = false;
//					System.out.println("Ok thank you");
//					break;
//				}
//			}
//			sc.close();
//		}
//	}
	
	public boolean validateAns(String ans) {
		if(ans.equalsIgnoreCase("Y") || ans.equalsIgnoreCase("N")) {
			return true;
		}else {
			return false;
		}
	}
	
	private void addEmployee(Employee e) {
		this.employeeList.add(e);
	}
	
	public void allEmployee() {
		String allEmployees = "";
		for(int i = 0; i < this.employeeList.size(); i++) {
			allEmployees += this.employeeList.get(i).toString() + " ";
		}
		System.out.println(allEmployees);
	}
}
