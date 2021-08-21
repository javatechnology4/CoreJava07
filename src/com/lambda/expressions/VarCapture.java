package com.lambda.expressions;

public class VarCapture {

	public static void main(String[] args) {
		int num=10;
		MyFunc myLambda=(n)->{
			int v=num+n;
			//num++;
			v++;
			return v;
		};
	}//ABC.test()   abc.test();
	//ABC::test

}
