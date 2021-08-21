package com.generics;

public class NonGen {
	Object obj;
	public NonGen(Object obj) {
		this.obj=obj;
	}
	Object getOb() {
		return obj;
	}
	void showType() {
		System.out.println("Type of obj is :" +obj.getClass().getName());
	}
}
