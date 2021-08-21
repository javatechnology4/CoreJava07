package com.lambda.expressions;

public class BlockCodeDemo {

	public static void main(String[] args) {
		NumericFunc fact=(n)->{
			int result=1;
			for(int i=1;i<=n;i++) {
				System.out.println(result);
				result=i*result;
			}
			return result;
		};
		System.out.println("The Factoral of 3 is: " + fact.func(3));
		System.out.println("The Factoral of 5 is: " + fact.func(5));

	}

}
