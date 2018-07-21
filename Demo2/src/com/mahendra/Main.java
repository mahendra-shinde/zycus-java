package com.mahendra;

public class Main {

	public static void main(String[] args) {
		//Employee e = new Employee();
		Employee.Address address=new Employee.Address("Mannat","Bandra","Mumbai","Maharashtra");
		Employee e = new Employee("Gauri","Khan",address);
		
		Person p = new Person("Amitabh","Bacchan","Pratiksha","Juhu","Mumbai","Maharashtra");
		
		
	}

}
