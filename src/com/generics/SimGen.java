package com.generics;

public class SimGen {

	public static void main(String[] args) {
		TwoGen<Integer, String> obj=new TwoGen<Integer, String>(85,	"Generics");
		obj.showType();
		System.out.println("Value of ob: " +obj.getOb1());
		System.out.println("Value of ob2: " +obj.getOb2());
		
		TwoGen<Boolean, Character> obj2=new TwoGen<Boolean, Character>(true,'A');
		obj2.showType();
		System.out.println("Value of ob1: " +obj2.getOb1());
		System.out.println("Value of ob2: " +obj2.getOb2());

	}

}
