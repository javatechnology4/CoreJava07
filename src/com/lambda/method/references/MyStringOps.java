package com.lambda.method.references;

public class MyStringOps {
	
	 String strReverse(String str,int count) {
		String result="";
		for(int i=str.length()-1;i>=0;i--)
			result+=str.charAt(i);
		return result;
	}
	static String stringOP(StringFunc sf,String s) {
		return sf.func(s, 0);
	}

	public static void main(String[] args) {
		MyStringOps ops=new MyStringOps();
		String inStr="Lambda added in java 1.8";
		String outStr;
		outStr=stringOP(ops::strReverse, inStr);
		System.out.println(outStr);
	}
	

}
