package com.generics;

public class GenCons {
	private double val;
	public <T extends Number,V extends T,Z extends Gen<T>> GenCons(T args) {
		val=args.doubleValue();
	}
	void showVal() {
		System.out.println("val: " +val);
	}
	public static void main(String[] args) {
		GenCons gc=new GenCons(41.0);
		GenCons gc1=new GenCons(75);
		gc1.showVal();
		gc.showVal();
	}

}
