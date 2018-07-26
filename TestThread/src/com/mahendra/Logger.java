package com.mahendra;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Stack;

public class Logger implements Runnable {

	private OutputStream out;  //Target Stream
	private boolean doStop = false; //Switch to TurnOff thread
	
	private Stack<String> stack = new Stack<>();
	
	public Logger(OutputStream out) {
		super();
		this.out = out;
	}
/**
 * Write a message to Stack which will be later written to Output Stream
 * @param msg
 */
	public void write(String msg) {
		stack.push(msg);
	}
	
	/**
	 * Turn Off the thread
	 */
	public void close() {
		doStop = true;
	}
	
	@Override
	public void run() {
		while(!doStop) {
			System.out.println("Getting element from stack");
			if(!stack.isEmpty()) {
				try {
					out.write(stack.pop().getBytes());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			try {
			Thread.sleep(100);
			System.out.println("Nothing to write!");
			}catch(InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}

}
