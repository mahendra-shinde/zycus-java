package com.mahendra;

public class Main4 {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Repeater("Mahendra"));
		Thread t2 = new Thread(new Repeater("Dharmendra"));
		
		t1.setDaemon(true);
		t2.setDaemon(true);
		
		t1.start();
		t2.start();
		
	/*	try {
			t1.join(); //Block current thread (MAIN) untill "t1" dies!!
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		System.out.println("Continuation of MAIN");
		for(int i = 0;i<100;i++) {
			System.out.println("MAIN THREAD!!!");
			try {
			Thread.sleep(10);
			}catch(InterruptedException ex) {
				
			}
		}
		
		System.out.println("::::::::::::::::::END OF MAIN::::::::::::::::::::::::");
		
	}

}
