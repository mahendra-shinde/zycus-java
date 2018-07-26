package com.mahendra;
import java.util.Date;

//Create a TASK to be run inside a Thread
public class DigitalClock implements Runnable {

	@Override
	public void run() {
		while(true) {
			Date dt = new Date();
			try {
				System.out.println("Time : "+dt.toString());
				Thread.sleep(1000);
			}catch(InterruptedException ex) {
				System.out.println("Thread interrupted!");
			}
		}
	}

}
