package com.mahendra;

public class TestWrapper {

	public static void main(String[] args) {
		//Boxing : storing primitive in Wrapper object
		Integer n = new Integer(100);
		// Integer n = Integer.valueOf(100);
		Number m = 100.8;
		System.out.println(m);
		//Unboxing : extracting primitive from wrapper object
		int k = n.intValue();
		//Auto-Unboxing
		// int k = n;
		System.out.println(Integer.toHexString(255));
		System.out.println(Integer.toOctalString(255));
		System.out.println(Integer.toBinaryString(255));
		boolean isIt = Boolean.parseBoolean("TRUE");
		System.out.println(isIt);
		Character ch = 'X';
		
		
		
		
	}

}
