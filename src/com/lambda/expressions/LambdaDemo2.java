package com.lambda.expressions;

public class LambdaDemo2 {

	public static void main(String[] args) {
		NumericTest isEven=(int n)->(n%2)==0;
		if(isEven.test(10))
			System.out.println("10 is even");
		if(!isEven.test(9))
			System.out.println("9 is not even");
		
		NumericTest isNon=(n)->n>=0;
		if(isNon.test(2))
			System.out.println("1 is non - negative");
		
		if(!isNon.test(-1))
			System.out.println("-1 is  negative");
	}

}
