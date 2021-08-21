package com.generics;

public class TwoGen<T,V> {
	T obj;
	V obj2;
	public TwoGen(T vol, V vol2) {
		obj=vol;
		obj2=vol2;
	}
	void showType() {
		System.out.println("Type of T is :" +obj.getClass().getName());
		System.out.println("Type of V is :" +obj2.getClass().getName());
	}
	T getOb1() {
		return obj;
	}
	V getOb2() {
		return obj2;
	}

}
