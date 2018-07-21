package com.mahendra.app;

import com.mahendra.models.Employee;

public class TestMain {

	public static void main(String[] args) {
		AppLogic2 logic = new AppLogic2();
		
		Employee[] emp1 = new Employee[3];
		emp1[0]= new Employee("Rajiv","Bhatia", 52, "Assistant director");
		emp1[1]=new Employee("Twinkle","Khanna",47,"director");
		emp1[2]=new Employee("Dev","Anand",92,"manager");
		
		logic.write(emp1);
System.out.println("Data written to file");
		
	Employee[] emp2 = logic.read();
	System.out.println(emp2[1].getFirstName());
		
	}

}
