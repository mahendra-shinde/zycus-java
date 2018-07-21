package com.mahendra.demo1;

public class TestException1 {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		int x = calc.calcDiv(10, 0);
		System.out.println("Answer:"+ x);
	}

}

class Calculator{
	public int calcSum(int n1, int n2) {
		return n1+n2;
	}
	
	public int calcDiv(int n1,int n2) {
		try {
			return n1/n2;
		}catch(ArithmeticException ex) {
			ex.printStackTrace();
			return 0;
		}
	}
}
