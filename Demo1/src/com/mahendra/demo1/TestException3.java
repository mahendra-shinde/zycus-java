package com.mahendra.demo1;

public class TestException3 {

	public static void main(String[] args) {
		Calculator3 calc = new Calculator3();
		int x = 0;
		try {
			x = calc.calcDiv(10, 0);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Answer:" + x);
	}
}

class Calculator3 {
	public int calcSum(int n1, int n2) {
		return n1 + n2;
	}

	public int calcDiv(int n1, int n2) throws MyException {
		if (n2 == 0)
			throw new MyException();
		return n1 / n2;
	}
}
