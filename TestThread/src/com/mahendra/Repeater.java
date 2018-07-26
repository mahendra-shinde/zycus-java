package com.mahendra;

public class Repeater implements Runnable {
	private String message;
	
	public Repeater(String message) {
		super();
		this.message = message;
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		
		for(int i=0;i<100;i++) {
			System.out.println(name+" : "+ message);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
