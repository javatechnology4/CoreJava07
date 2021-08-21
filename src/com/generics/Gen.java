package com.generics;

public class Gen<T> {
	T obj;
	Gen(T obj){
		this.obj=obj;
	}
	T getOb() {
		return obj;
	}
	void showType() {
		System.out.println("Type of this obj :"+obj.getClass().getName());
	}

}
