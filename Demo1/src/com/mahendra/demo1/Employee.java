package com.mahendra.demo1;

public class Employee {
	private String firstName, lastName;
	private String designation;
	
	//Constructor without arguments
	public Employee() {
		firstName="unknown";
		lastName="unknown";
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void print() {
		System.out.println("Name: "+firstName+" "+lastName);
	}
}
