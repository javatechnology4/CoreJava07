package com.lambda.expressions;

public class BlockCodeDemo2 {

	public static void main(String[] args) {
		StringFunc reverse=(str)->{
			String result="";
			int i;
			for(i=str.length()-1;i>=0;i--)
				result+=str.charAt(i);
			return result;
		};
		System.out.println("Lambda Reversed is: " +reverse.func("LAMBDA"));

	}

}
