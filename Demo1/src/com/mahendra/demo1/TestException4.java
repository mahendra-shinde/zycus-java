package com.mahendra.demo1;

public class TestException4 {

	public static void main(String[] args) {
		
		int sum = 0;
		int n = 0;
	
		try {
		for(String s : args) {
				n = Integer.parseInt(s);
				sum += n;
		}
		}catch(NumberFormatException ex) {
			System.out.println(ex.getMessage());
			n = 0;
		}
		System.out.println("Sum = "+sum);
	}

}
