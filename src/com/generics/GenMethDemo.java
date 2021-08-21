package com.generics;

public class GenMethDemo {
	static <T extends Comparable<T>,V extends T> boolean isIn(T x,V[] y) {
		for(int i=0;i<y.length;i++)
			if(x.equals(y[i]))return true;
		return false;
	}

	public static void main(String[] args) {
		Integer nums[]= {1,2,3,4,5,6,7,8};
		if(isIn(2, nums)) System.out.println("2 value is available in nums array");
		if(!isIn(9, nums)) System.out.println("9 value is not available in nums array");
		//
		String str[]= {"one","two","three"};
		if(isIn("one",str)) System.out.println("one value is available in str array");
		
		if(isIn("one",str)) System.out.println("one value is available in str array");
	}

}
