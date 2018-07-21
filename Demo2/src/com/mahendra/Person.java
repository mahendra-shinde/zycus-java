package com.mahendra;

public class Person {
	private String firstName, lastName;
	private Address address;
	
	public Person(String firstName, String lastName, String line1, String line2, String city, String state) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = new Address();
		this.address.line1 = line1;
		this.address.line2=line2;
		this.address.city = city;
		this.address.state=state;
	}



	private class Address{
		private String line1, line2, city, state;
	}
}
