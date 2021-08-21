package com.lambda.expressions;

public class LambdaDemo3 {

	public static void main(String[] args) {
		
		NumericTest2 someEx=(int n,int d)->(n % d)==0;
		
		if(someEx.test(10, 2))
			System.out.println("2 is a factor of 10");
		if(!someEx.test(10, 3))
			System.out.println("3 is a factor of 10");
	}

}
