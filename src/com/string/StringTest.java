package com.string;

import java.io.UnsupportedEncodingException;

public class StringTest {

	public static void main(String[] args) throws UnsupportedEncodingException {
		/*char[] value= {'A','B','C','D','E','F'};
		int length = value.length;
		//int off, int len, Void sig
		// "String" 's','t','r','i','n','g'
		String s=new String(value);
		System.out.println(s);
		String s1=new String();
		System.out.println("Empty String: "+s1);
		String s2=new String(value, 1, 4);
		System.out.println(s2);
		byte arr[]= {96,97,98,99,100,101,102,103,104};
		String s3=new String(arr,1,6,"US-ASCII");
		System.out.println(s3);
		String s4=new String(arr);
		System.out.println(s4.length());*/
		
		//===============================
		String s5="abc";
		System.out.println(s5);
		System.out.println(s5.length());
		String m1="9";
		String m2=" He is " +m1+ " years old";
		System.out.println(m2);

	}

}
