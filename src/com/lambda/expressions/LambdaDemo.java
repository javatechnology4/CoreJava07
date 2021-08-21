package com.lambda.expressions;

public class LambdaDemo {

	public static void main(String[] args) {
		MyNumber myNum;
		myNum=()->123.45;
		System.out.println("A fixed value: " +myNum.getValue());
		
		myNum=()->Math.random()*100;
		System.out.println("Random value: " +myNum.getValue());
		System.out.println("Another Random value: " +myNum.getValue());
		//myNum=()->"123.45"; //Type mismatch: cannot convert from String to double
	}

}
