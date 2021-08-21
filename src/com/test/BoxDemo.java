package com.test;
public class BoxDemo{
	public static void main(String[] args){
		/*Box box1=new Box();
		Box box2=new Box();
		Box box3;// declaration Object Reference variable
		
		box3=box2;
		double vol;
		box1.width=10;
		box1.height=20;
		box1.depth=30;
		
		box2.width=3;
		box2.height=6;
		box2.depth=9;
		vol=box1.width*box1.height*box1.depth;
		System.out.println("Volume of box:"+vol);
		
		vol=box2.width*box2.height*box2.depth;
		System.out.println("Volume of box:"+vol);
		
		vol=box3.width*box3.height*box3.depth;
		System.out.println("Volume of box:"+vol);
		box3.width=100;
		box3.height=15;
		box3.depth=12;
		
		System.out.println(box1);
		System.out.println(box2);
		System.out.println(box3);
		System.out.println(box2.width);
		
		vol=box2.width*box2.height*box2.depth;
		System.out.println("Volume of box:"+vol);
		
		vol=box3.width*box3.height*box3.depth;
		System.out.println("Volume of box:"+vol);
		System.out.println(box1.width);
		System.out.println(box2.width);*/
		Box box1=new Box();
		Box box2=new Box();
		double vol;
		/*box1.width=10;
		box1.height=20;
		box1.depth=30;
		
		box2.width=3;
		box2.height=6;
		box2.depth=9;*/
		//box1.setDim(3,6,9);
		
		/*box2.setDim(30,60,90);
		
		//vol=box1.volume();
		System.out.println("Volume of box:"+box1.volume());
		
		//vol=box2.volume();
		System.out.println("Volume of box:"+box2.volume());*/
		Shipment sh=new Shipment();
		System.out.println(sh.volume());
		
		
	}
}