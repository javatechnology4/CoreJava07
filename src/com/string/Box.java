package com.string;

public class Box {
	double width;
	double height;
	double depth;
	public Box(double w, double h, double d) {
		width=w;
		height=h;
		depth=d;
	}
	public String toString() {
		return "[ Dimensions are "+width+" by " +height + " by "+ depth + " ]"; 
	}
	public static void main(String[] args) {
		Box box=new Box(10.0,25.0,78.0);
		System.out.println(box);
	}

}
