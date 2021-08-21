package com.generics;

public class MinMaxImpl<T extends Comparable<T>> implements MinMax<T>{
	T[] vals;
	public MinMaxImpl(T[] o) {
		vals=o;
	}
	@Override
	public T min() {
		T v=vals[0];
		return v;
	}

	@Override
	public T max() {
	int length = vals.length;
	T t = vals[length-1];
		return t;
	}
public static void main(String[] args) {
	Integer nums[]= {45,23,12,65,87,96,54,21};
	Character ch[]= {'A','b','Z','V','x','w'};
	MinMaxImpl<Integer> im=new MinMaxImpl<>(nums);
	MinMaxImpl<Character> im1=new MinMaxImpl<>(ch);
	System.out.println(im.max());
	System.out.println(im.min());
	
	System.out.println(im1.max());
	System.out.println(im1.min());
}
}
