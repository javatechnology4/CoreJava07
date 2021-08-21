package com.facebook.instgram.member.profile;

class Exc2{
	public static void main(String[] args){
		int d,a;
		try{
			d=0;
			a=42/d;
			System.out.println("Try block Println statement");
		}catch(ArithmeticException ex){
			System.out.println("Division by zero");
		}
		System.out.println("After catch block");
	}
}