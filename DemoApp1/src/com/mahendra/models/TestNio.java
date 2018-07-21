package com.mahendra.models;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.*;


public class TestNio {
	public static void main(String[] args)throws IOException { 
		System.out.println("Reading file through channel"); 
		FileInputStream  fis = new FileInputStream("d:/data/test.txt");
		FileChannel in = fis.getChannel(); 
		ByteBuffer buffer =ByteBuffer.allocate(100); int readBytes = in.read(buffer); 
		//write data in buffer 
		while(readBytes != -1)
		{  //flip to READ mode  
			buffer.flip();  while(buffer.hasRemaining()){   System.out.print((char)buffer.get());  
			} buffer.clear(); readBytes = in.read(buffer); 
			//read next set of bytes 
			} fis.close(); }
		
}
