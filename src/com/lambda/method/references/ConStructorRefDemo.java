package com.lambda.method.references;

public class ConStructorRefDemo {

	public static void main(String[] args) {
		ConFunc myCLass=MyClass::new;
		MyClass func = myCLass.func();
		System.out.println(func.getVal());

	}

}
