package com.lambda.expressions;

public class LambdaAsParameter {
	
	static String parameter(StringFunc sf, String s) {
		return sf.func(s);
	}

	public static void main(String[] args) {
		String inStr="Lambda Example";
		String outStr;
		outStr=parameter((str)->str.toUpperCase(), inStr);
		System.out.println(outStr);
		
		outStr=parameter((str)->{
			String result="";
			int i;
			for(i=str.length()-1;i>=0;i--)
				result+=str.charAt(i);
			return result;
		},inStr);
		System.out.println(outStr);

	}

}
