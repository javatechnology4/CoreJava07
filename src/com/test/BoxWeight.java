package com.test;
public class BoxWeight extends Box{
	double weight;
	BoxWeight(double w, double h, double d,double weight){
		/*width=w;
		height=h;
		depth=d;*/
		super(w,h,d);
		this.weight=weight;
	}
	BoxWeight(BoxWeight obj){
		super(obj);
		weight=obj.weight;
	}
	BoxWeight(){
		super();
		weight=-1;
	}
	BoxWeight(double len, double m){
		super(len);
		weight=m;
	}
	public static void main(String[] arg){
		BoxWeight bw=new BoxWeight(34.3,34.3,34.3,34.3);
		BoxWeight bw1=new BoxWeight(bw);
		double vol;
		vol=bw.volume();
		System.out.println("volume of BoxWeight is: "+vol);
		System.out.println(" Weight of BoxWeight "+ bw.weight);
		//bo=bw;
		vol=bw1.volume();
		System.out.println("volume of BoxWeight is: "+vol);
		System.out.println(" Weight of BoxWeight "+ bw1.weight);
	}
}