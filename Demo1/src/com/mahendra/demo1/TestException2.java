package com.mahendra.demo1;

import javax.management.RuntimeErrorException;

public class TestException2 {

	public static void main(String[] args) {
		Calculator2 calc = new Calculator2();
		int x = calc.calcDiv(10, 0);
		System.out.println("Answer:"+ x);
	}

}

class Calculator2{
	public int calcSum(int n1, int n2) {
		return n1+n2;
	}
	
	public int calcDiv(int n1,int n2) {
		try {
			if(n2==0)
				throw new RuntimeException("Some other exception");
			return n1/n2;
		}catch(ArithmeticException ex) {
			ex.printStackTrace();
			return 0;
		}
	}
}
