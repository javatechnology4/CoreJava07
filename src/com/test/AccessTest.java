package com.test;

public class AccessTest{
	private int a;// default access
	public int b;// public access
	private int c;// private access
	public  void setC(int i){
		c=i;
	}
	public int getC(){
		return c;
	}
	public static void main(String[] args){
		AccessTest test=new AccessTest();
		test.setA(10);
		test.b=20;
		test.c=30;
		System.out.println("a, b and c values "+test.getA()+" "+test.b+" "+test.c);
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
}
