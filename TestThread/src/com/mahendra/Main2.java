package com.mahendra;

import java.io.FileOutputStream;
import java.io.IOException;

public class Main2 {

	public static void main(String[] args) throws IOException{
		Logger log1 = new Logger(System.out);
		FileOutputStream fout = new FileOutputStream("d:/data/data2.txt");
		Logger log2 = new Logger(fout);
		
		Thread t1 = new Thread(log1);
		Thread t2 = new Thread(log2);
		
		log1.write("Hello World");
		log2.write("Hello WOrld");
		log1.write("Hello India");
		log2.write("Hello India");
		
		
		t1.start();
		t2.start();
		
		try {
		Thread.sleep(1000);
		}catch(InterruptedException ex) {
			
		}
		log1.close();
		log2.close();
		
	}

}
