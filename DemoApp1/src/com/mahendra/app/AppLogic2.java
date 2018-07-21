package com.mahendra.app;

import java.io.*;

import com.mahendra.models.Employee;

public class AppLogic2 {
	private static final String DATA_PATH="d:/data/emps.dat";
	
	public Employee[] read() {
		Employee []temp = new Employee[100];
		int i = 0;
		try( ObjectInputStream in = new ObjectInputStream(new FileInputStream(DATA_PATH))  ) {
			Object obj  =in.readObject();
			while(obj!=null) {
				temp[i++] = (Employee)obj;
				obj = in.readObject();
			}
		}catch(IOException | ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		return temp;
	}
	

	
	public void write(Employee[] emps) {
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(DATA_PATH))){
			for (Employee e: emps) {
				out.writeObject(e);
				out.flush();
			}
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}
}
