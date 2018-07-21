package com.mahendra;

public class TestWrapper2 {

	public static void main(String[] args) {
	Number [] data = new Number[3];
	data[0] = 10;
	
	float sum = 0;
	for(Number x : data) {
		sum += x.floatValue();
	}
	}

}
