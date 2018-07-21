package com.mahendra;

public class Computer {
	private Display primaryDisplay;
	private Storage primaryStorage;

	public static void main(String[] args) {
		Computer comp= new Computer();
		comp.primaryDisplay = new Projector();
		//Anonymous Inner classes are name-less classes which implements an interface
		comp.primaryStorage = new Storage(){
			@Override
			public void read() {
				System.out.println("Reading data");
			}
			@Override
			public void write() {
			System.out.println("Writing data");	
			}
			
		};
		
	}
}
