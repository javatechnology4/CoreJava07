package com.lambda.expressions;

public class GenericFunctionDemo {

	public static void main(String[] args) {
		 
		SomeFunc<String> reverse=(str)->{
			String result="";
			int i;
			for(i=str.length()-1;i>=0;i--)
				result+=str.charAt(i);
			return result;
		};
		System.out.println("Lambda Reversed is: " +reverse.func("LAMBDA"));
		
		SomeFunc<Integer> fact=(n)->{
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
