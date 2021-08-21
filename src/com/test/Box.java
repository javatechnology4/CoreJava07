package com.test;
public class Box{
	private double width;
	private double height;
	private double depth;
	/*void volume(){
		System.out.print("Volume of Box :");
		System.out.println(width*height*depth);
	}*/
	Box(){
		width=10;
		height=20;
		depth=30;
	}
	Box(double width, double height, double depth){
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	Box(double len){
		width=height=depth=len;
	}
	Box(Box box){
		width=box.width;
		height=box.height;
		depth=box.depth;
	}
	double volume(){
		return width*height*depth;
	}
	void setDim(double w, double h, double d){
		width=w;
		height=h;
		depth=d;
	}
	
	
	
}
	